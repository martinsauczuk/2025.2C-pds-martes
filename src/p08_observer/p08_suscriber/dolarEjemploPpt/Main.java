package p08_observer.p08_suscriber.dolarEjemploPpt;

import p08_observer.p08_suscriber.dolarEjemploPpt.observables.Banco;
import p08_observer.p08_suscriber.dolarEjemploPpt.observadores.ImportadorApple;
import p08_observer.p08_suscriber.dolarEjemploPpt.observadores.ProfesorDeEconomia;

import java.util.Observer;

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
