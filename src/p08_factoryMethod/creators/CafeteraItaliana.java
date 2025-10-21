package p08_factoryMethod.creators;

import p08_factoryMethod.materiasPrimas.MateriaPrima;
import p08_factoryMethod.products.Cafe;

public class CafeteraItaliana implements CafeCreator {


    @Override
    public void cargarMateriaPrima(MateriaPrima materiaPrima) {

    }

    @Override
    public Cafe preparar() {
        return null;
    }
}
