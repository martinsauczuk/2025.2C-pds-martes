package p09_abstractFactory.parrilla;


import p09_abstractFactory.bebidas.Bebida;
import p09_abstractFactory.factories.MenuFactory;
import p09_abstractFactory.menues.Menu;
import p09_abstractFactory.menues.MenuEjecutivo;
import p09_abstractFactory.plato.Plato;

public class Parrilla implements MenuFactory {


    @Override
    public Plato cocinarPlato() {
        // Creacion del plato

        return new PorcionDeAsado();
    }

    @Override
    public Bebida prepararBebida() {
        return new CopaDeVino();
    }

    @Override
    public Menu prepararMenuEjecutivo() {

        MenuEjecutivo menuEjecutivo = new MenuEjecutivo(3000);
        menuEjecutivo.agregarBebida(this.prepararBebida());
        menuEjecutivo.agregarPlato(this.cocinarPlato());
        return menuEjecutivo;

    }
}
