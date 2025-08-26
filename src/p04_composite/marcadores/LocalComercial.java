package p04_composite.marcadores;

public class LocalComercial implements MarcadorEnMapa {

    private float lat;
    private float lng;

    private String nombreDelLocal;
    private String horario;

    public LocalComercial(float lat, float lng, String nombreDelLocal, String horario) {
        this.lat = lat;
        this.lng = lng;
        this.nombreDelLocal = nombreDelLocal;
        this.horario = horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public float lat() {
        return 0;
    }

    @Override
    public float lng() {
        return 0;
    }

    @Override
    public String descripcion() {
//        return "Soy un local " + nombreDelLocal;
        return String.format("Local comercial %s horario: %s lat: %2.2f lng: %2.2f", nombreDelLocal, horario, lat, lng);
//        new StringBuilder("Local")
//                .append("horario")
//                .toString();
    }

    @Override
    public int cantEstrellas() {
        return 0;
    }
}
