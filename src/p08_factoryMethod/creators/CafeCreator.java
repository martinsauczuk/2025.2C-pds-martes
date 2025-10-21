package p08_factoryMethod.creators;

import p08_factoryMethod.materiasPrimas.MateriaPrima;
import p08_factoryMethod.products.Cafe;

public interface CafeCreator {

    void cargarMateriaPrima(MateriaPrima materiaPrima );

    Cafe preparar();

}
