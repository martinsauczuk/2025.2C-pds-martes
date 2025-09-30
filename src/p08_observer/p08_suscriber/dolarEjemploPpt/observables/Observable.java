package p08_observer.p08_suscriber.dolarEjemploPpt.observables;

import p08_observer.p08_suscriber.dolarEjemploPpt.observadores.Observador;

public interface Observable {

    void agregarObservador(Observador observer);

    void eliminarObservador(Observador observer);

    void notificar();

}
