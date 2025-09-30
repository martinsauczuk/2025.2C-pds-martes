package p08_observer.p08_suscriber.dolarEjemploPpt;

import java.util.HashSet;

public class EntidadBancaria implements Observable {

    private HashSet<Observador> observadores = new HashSet<>();
    private


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
            observador.actualizar();
        }
    }


}
