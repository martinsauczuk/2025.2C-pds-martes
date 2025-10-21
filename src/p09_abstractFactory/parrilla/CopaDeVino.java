package p09_abstractFactory.parrilla;


import p09_abstractFactory.bebidas.Bebida;

public class CopaDeVino implements Bebida {

    @Override
    public boolean tieneAlcohol() {
        return true;
    }

    @Override
    public int medidaEnCm3() {
        return 250;
    }
}
