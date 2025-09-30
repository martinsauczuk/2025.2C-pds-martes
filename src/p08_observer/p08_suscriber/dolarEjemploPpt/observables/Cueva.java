package p08_observer.p08_suscriber.dolarEjemploPpt.observables;

import p08_observer.p08_suscriber.dolarEjemploPpt.observadores.Observador;

import java.util.HashSet;

public class Cueva implements Observable{

    private HashSet<Observador> observadores = new HashSet<>();


    @Override
    public void agregarObservador(Observador observer) {
        observadores.add(observer);
    }

    @Override
    public void eliminarObservador(Observador observer) {
        observadores.add(observer);
    }

    @Override
    public void notificar() {
        System.out.println("Nofificando el precio del dolar blue");
        observadores.forEach( obs -> obs.actualizar(1644));
    }
}
