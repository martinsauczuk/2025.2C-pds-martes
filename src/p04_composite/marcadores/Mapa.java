package p04_composite.marcadores;

import java.util.HashSet;

public class Mapa {

    private HashSet<MarcadorEnMapa> marcadoresEnMapas = new HashSet<>();


    public void agregarMarcador(MarcadorEnMapa marcadorEnMapa) {
        this.marcadoresEnMapas.add(marcadorEnMapa);
    }
}
