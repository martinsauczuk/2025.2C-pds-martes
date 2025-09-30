package p07_observer.dolarEjemploPpt.observadores;

public class ImportadorApple implements Observador {

    private float conversionUsd = 15000;

    public float precioEnArsDelUltimoIphone() {
        System.out.println("iPhone 17 (127GB) USD799");
        return 799f * conversionUsd * 0.2f;
    }


    @Override
    public void actualizar(float precioUsd) {
        System.out.printf("[Importador]-Me avisaron que cambio el precio USD a %f %n", precioUsd);
        this.conversionUsd = precioUsd;
    }
}
