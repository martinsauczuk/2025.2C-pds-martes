package interfacesUbert;

public interface Viaje {

    void asignarPasajero(Pasajero unPasajero);

    void asignarConductor(Conductor unConductor);

    void finalizarViaje();

    String getId();

    EstadoDeViaje estadoDeViaje();

}
