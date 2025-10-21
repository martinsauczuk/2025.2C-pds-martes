package p08_factoryMethod.creators;


import p08_factoryMethod.materiasPrimas.MateriaPrima;
import p08_factoryMethod.products.Cafe;
import p08_factoryMethod.products.CafeViajero;

public class CafeteraVending implements CafeCreator {


    @Override
    public void cargarMateriaPrima(MateriaPrima materiaPrima) {

    }

    @Override
    public Cafe preparar() {
        // pasos para preparar

        return new CafeViajero();
    }
}
