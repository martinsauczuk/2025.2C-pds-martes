package p08_observer.p08_suscriber.dolarEjemploPpt;

public class ImportadorApple implements Observador {

    private float conversionUsd;

    public float precioEnArsDelUltimoIphone() {
        System.out.println("iPhone 17 (127GB) USD799");
        return 799f * conversionUsd * 0.2f;
    }

    @Override
    public void actualizar() {

    }
}
