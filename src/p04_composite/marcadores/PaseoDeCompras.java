package p04_composite.marcadores;

import java.util.HashSet;

public class PaseoDeCompras implements MarcadorEnMapa {

    private float lat;
    private float lng;

    private String nombreDelLocal;
    private String horario;

    private HashSet<MarcadorEnMapa> hijos = new HashSet();


    public void agregarHijo(MarcadorEnMapa cualquierMarcador) {
        this.hijos.add(cualquierMarcador);
    }

    public void setHorario(String horario) {
        this.horario = horario;
        for (MarcadorEnMapa hijo : this.hijos) {
            hijo.setHorario(this.horario);
        }
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
        return "";
    }

    @Override
    public int cantEstrellas() {
        return 0;
    }
}
