package p08_observer.p08_suscriber.dolarEjemploPpt.observables;

import p08_observer.p08_suscriber.dolarEjemploPpt.observadores.Observador;

import java.util.HashSet;

public class Banco implements Observable {

    private HashSet<Observador> observadores = new HashSet<>();
    private float precioUsd;

    @Override
    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificar() {
        for (Observador observador : observadores) {
            observador.actualizar(precioUsd);
        }
    }


    public void subeElDolar() {
        precioUsd = precioUsd + 15f;
        notificar();
    }




}
