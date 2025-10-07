package solid.ISP.motoresNafta.refactor;


public class Automovil implements Vehiculo, Naftero {

    private int cantidadNafta;

    @Override
    public void acelerar() {

    }

    @Override
    public void frenar() {

    }

    @Override
    public int cuantaNaftaTeQueda() {
        return cantidadNafta;
    }

    @Override
    public void cargarTanque() {

    }
}
