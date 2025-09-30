package p08_observer.p08_suscriber.dolarEjemploPpt.observadores;

public class ProfesorDeEconomia implements Observador {

    @Override
    public void actualizar(float precioUsd) {
        System.out.printf("[Profesor] Ahora se el precio es %f %n", precioUsd);
    }
}
