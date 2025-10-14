package interfacesUbert;

public interface Viaje {

    void asignarConductor(Conductor unConductor);

    void finalizarViaje();

    String getId();

    EstadoDeViaje estadoDeViaje();

}
