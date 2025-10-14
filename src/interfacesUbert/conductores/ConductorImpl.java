package interfacesUbert.conductores;

import interfacesUbert.notificaciones.Observer;
import interfacesUbert.notificaciones.Solicitud;

public class ConductorImpl implements Conductor, Observer {

    @Override
    public int kmTotales() {
        return 0;
    }

    @Override
    public int puntuacion() {
        return 0;
    }

    @Override
    public String nombre() {
        return "";
    }

    @Override
    public String id() {
        return "";
    }

    @Override
    public void update(Solicitud solicitud) {
        System.out.printf("Soy un conductor y me notificaron del viaje %s de %d kms %n",
                solicitud.getIdViaje(), solicitud.getDistancia());
    }
}
