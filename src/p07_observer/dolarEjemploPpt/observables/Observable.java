package p07_observer.dolarEjemploPpt.observables;

import p07_observer.dolarEjemploPpt.observadores.Observador;

public interface Observable {

    void agregarObservador(Observador observer);

    void eliminarObservador(Observador observer);

    void notificar();

}
