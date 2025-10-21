package p08_factoryMethod.creators;

import p08_factoryMethod.materiasPrimas.CapsulaNespresso;
import p08_factoryMethod.materiasPrimas.MateriaPrima;
import p08_factoryMethod.products.Cafe;
import p08_factoryMethod.products.CafeDeCapsula;

import java.util.ArrayList;
import java.util.HashSet;

public class CafeteraNespresso implements CafeCreator {

    private ArrayList<MateriaPrima> capsulasRestantes = new ArrayList<>();

    @Override
    public void cargarMateriaPrima(MateriaPrima materiaPrima) {
        capsulasRestantes.add(materiaPrima);
    }

    @Override
    public Cafe preparar() {
        capsulasRestantes.removeFirst();
        return new CafeDeCapsula();
    }
}
