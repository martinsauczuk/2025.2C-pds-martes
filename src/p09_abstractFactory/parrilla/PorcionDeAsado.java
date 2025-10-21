package p09_abstractFactory.parrilla;


import p09_abstractFactory.plato.Plato;

public class PorcionDeAsado implements Plato {

    @Override
    public int calorias() {
        return 6460;
    }

    @Override
    public boolean aptoCeliaco() {
        return true;
    }
}
