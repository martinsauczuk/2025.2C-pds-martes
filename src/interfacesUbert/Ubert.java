package interfacesUbert;

import p08_observer.ubert.conductores.Conductor;
import p08_observer.ubert.observer.Observable;
import p08_observer.ubert.observer.Observer;
import p08_observer.ubert.observer.Solicitud;
import p08_observer.ubert.pasajeros.Pasajero;
import p08_observer.ubert.viajes.Viaje;
import p08_observer.ubert.viajes.ViajeClasico;

import java.util.LinkedHashSet;
import java.util.UUID;

public class Ubert implements Observable{

    private final LinkedHashSet<Observable> conductoresEnViaje = new LinkedHashSet<>();
    private final LinkedHashSet<Observable> conductoresEnEspera = new LinkedHashSet<>();
    private final LinkedHashSet<Viaje> viajes = new LinkedHashSet<>();

    public void pedirViajePara(Pasajero unPasajero, int km) {

        String uuid = UUID.randomUUID().toString();
        ViajeClasico nuevoViaje = new ViajeClasico(uuid,unPasajero);
        this.viajes.add(nuevoViaje);
        viajes.add(nuevoViaje);
    }


    public void tomarViajeConId(Conductor conductor, String idViaje) throws UbertException {
        Viaje viajeElegido = viajes
                    .stream()
                    .filter( viaje -> viaje.getId().equals(idViaje)).findFirst()
                    .orElseThrow(() -> new UbertException("No existe viaje con ese Id"));

        viajeElegido.asignarConductor(conductor);

    }

    public  void finalizarViaje(Conductor conductor, String idViaje) throws UbertException {

        Viaje viajeElegido = viajes
                .stream()
                .filter( viaje -> viaje.getId().equals(idViaje)).findFirst()
                .orElseThrow(() -> new UbertException("No existe viaje con ese Id"));

    }


    private void asignarViajeA(Viaje unViaje, Conductor unConductor) {

        // Asignar viaje
        unViaje.asignarConductor(unConductor);

        // "Pausar" las notificaciones

    }

    @Override
    public void agregarObservador(Observer observer) {

    }

    @Override
    public void eliminarObservador(Observer observer) {

    }

    @Override
    public void notificar(Solicitud solicitud) {

    }
}
