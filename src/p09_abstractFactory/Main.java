package p09_abstractFactory;


import p09_abstractFactory.factories.MenuFactory;
import p09_abstractFactory.menues.Menu;
import p09_abstractFactory.menues.MenuEjecutivo;
import p09_abstractFactory.parrilla.Parrilla;

public class Main {

    public static void main(String[] args) {

        // Creadores
        MenuFactory parrilla = new Parrilla();

        Menu menuEjecutivoParrilla = new MenuEjecutivo(30000);
        menuEjecutivoParrilla.agregarPlato( parrilla.cocinarPlato() );
        menuEjecutivoParrilla.agregarBebida( parrilla.prepararBebida() );

        Menu menuDeLaParrilla = parrilla.prepararMenuEjecutivo();


        Menu menuEjecutivoSaludable = new MenuEjecutivo(2000);
        menuEjecutivoSaludable.agregarPlato(parrilla.cocinarPlato());



    }


}
