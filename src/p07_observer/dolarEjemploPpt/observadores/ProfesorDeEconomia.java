package p07_observer.dolarEjemploPpt.observadores;

public class ProfesorDeEconomia implements Observador {

    @Override
    public void actualizar(float precioUsd) {
        System.out.printf("[Profesor] Ahora se el precio es %f %n", precioUsd);
    }
}
