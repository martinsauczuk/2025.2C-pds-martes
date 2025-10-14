package interfacesUbert.notificaciones;

public class SolicitudImpl implements Solicitud{

    private final String id;
    private final int distancia;

    public SolicitudImpl(String id, int distancia) {
        this.id = id;
        this.distancia = distancia;
    }

    @Override
    public int getDistancia() {
        return distancia;
    }

    @Override
    public String getIdViaje() {
        return id;
    }
}
