package p07_observer.dolarEjemploPpt;

import p07_observer.dolarEjemploPpt.observables.Banco;
import p07_observer.dolarEjemploPpt.observadores.ImportadorApple;
import p07_observer.dolarEjemploPpt.observadores.ProfesorDeEconomia;

public class Main {

    public static void main(String[] args) {

        ImportadorApple store1 = new ImportadorApple();
        ProfesorDeEconomia profe1 = new ProfesorDeEconomia();

        Banco bancoDolar = new Banco();
        bancoDolar.agregarObservador(store1);
        bancoDolar.agregarObservador(profe1);

        bancoDolar.eliminarObservador(profe1);

        bancoDolar.subeElDolar();


    }

}
