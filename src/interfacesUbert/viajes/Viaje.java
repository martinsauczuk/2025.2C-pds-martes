package interfacesUbert.viajes;

import interfacesUbert.conductores.Conductor;
import interfacesUbert.pasajeros.Pasajero;

public interface Viaje {

    void asignarPasajero(Pasajero unPasajero);

    void asignarConductor(Conductor unConductor);

    void finalizarViaje();

    String getId();

    int getDistancia();

    EstadoDeViaje estadoDeViaje();

}
