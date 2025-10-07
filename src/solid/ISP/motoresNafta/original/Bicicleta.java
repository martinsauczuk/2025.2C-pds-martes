package solid.ISP.motoresNafta.original;

public class Bicicleta implements Vehiculo{
    @Override
    public void acelerar() {

    }

    @Override
    public void frenar() {

    }

    @Override
    public int cuantaNaftaTeQueda() {
        return 0;
    }

    @Override
    public void cargarTanque() {
        // No lleva nafta
    }
}
