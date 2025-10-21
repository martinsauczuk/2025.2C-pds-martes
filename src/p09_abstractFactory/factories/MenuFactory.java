package p09_abstractFactory.factories;


import p09_abstractFactory.bebidas.Bebida;
import p09_abstractFactory.menues.Menu;
import p09_abstractFactory.plato.Plato;

public interface MenuFactory {

    Plato cocinarPlato();

    Bebida prepararBebida();

    Menu prepararMenuEjecutivo();

}
