package interfacesUbert.viajes;

import interfacesUbert.conductores.Conductor;
import interfacesUbert.pasajeros.Pasajero;


public class ViajeImpl implements Viaje {

    private EstadoDeViaje estado;
    private Conductor conductor;
    private final Pasajero pasajero;
    private final String id;
    private final int distancia;

    public ViajeImpl(String id, Pasajero pasajero, int distancia) {
        this.pasajero = pasajero;
        this.id = id;
        this.distancia = distancia;
        estado = EstadoDeViaje.PENDIENTE;
    }

    @Override
    public void asignarPasajero(Pasajero unPasajero) {
        //
    }

    @Override
    public void asignarConductor(Conductor unConductor) {
        conductor = unConductor;
        estado = EstadoDeViaje.INICIADO;
    }

    @Override
    public void finalizarViaje() {
        estado = EstadoDeViaje.FINALIZADO;
    }

    @Override
    public String getId() {
        return "";
    }

    @Override
    public int getDistancia() {
        return 8;
    }

    @Override
    public EstadoDeViaje estadoDeViaje() {
        return estado;
    }
}
