package p08_observer.p08_suscriber.dolarEjemploPpt;

public interface Observable {

    void agregarObservador(Observador observer);

    void eliminarObservador(Observador observer);

    void notificar();

}
