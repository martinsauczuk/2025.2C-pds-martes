package interfacesUbert.plataforma;


import interfacesUbert.conductores.Conductor;
import interfacesUbert.notificaciones.Observable;
import interfacesUbert.notificaciones.Observer;
import interfacesUbert.notificaciones.SolicitudImpl;
import interfacesUbert.pasajeros.Pasajero;
import interfacesUbert.notificaciones.Solicitud;
import interfacesUbert.viajes.Viaje;
import interfacesUbert.viajes.ViajeImpl;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.UUID;

public class Ubert implements PlataformaDeViajes, Observable {

//    private final LinkedHashSet<Observable> conductoresEnViaje = new LinkedHashSet<>();
    private final HashSet<Observer> conductoresEnEspera = new HashSet<>();
    private final HashSet<Viaje> viajes = new HashSet<>();

    @Override
    public void pedirViajePara(Pasajero unPasajero, int km) {

        // crear viaje
        Viaje nuevoViaje = new ViajeImpl(generarId(),unPasajero, km);

        // Agrego a la coleccion de viajes
        viajes.add(nuevoViaje);

        // Notificar a los conductores de un nuevo viaje
        this.notificar(new SolicitudImpl(nuevoViaje.getId(), nuevoViaje.getDistancia()));

    }

    private String generarId(){
        return UUID.randomUUID().toString();
    }

    @Override
    public void tomarViajeConId(Conductor conductor, String idViaje) throws PlataformaViajesException {

        Viaje viajeElegido = viajes
                .stream()
                .filter( viaje -> viaje.getId().equals(idViaje))
                .findFirst()
                .orElseThrow(() -> new PlataformaViajesException("No existe viaje con ese Id"));

        viajeElegido.asignarConductor(conductor);

    }


    public void finalizarViaje(Conductor conductor, String idViaje) throws PlataformaViajesException {

//        Viaje viajeElegido = viajes
//                .stream()
//                .filter( viaje -> viaje.getId().equals(idViaje)).findFirst()
//                .orElseThrow(() -> new UbertException("No existe viaje con ese Id"));

    }


    private void asignarViajeA(Viaje unViaje, Conductor unConductor) {

        // Asignar viaje
//        unViaje.asignarConductor(unConductor);

    }

    @Override
    public void agregarObservador(Observer observer) {
        this.conductoresEnEspera.add(observer);
    }

    @Override
    public void eliminarObservador(Observer observer) {
        this.conductoresEnEspera.remove(observer);
    }

    @Override
    public void notificar(Solicitud solicitud) {
        for (Observer observer : conductoresEnEspera) {
            observer.update(solicitud);
        }
    }

}
