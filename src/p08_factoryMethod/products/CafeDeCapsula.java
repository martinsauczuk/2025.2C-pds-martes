package p08_factoryMethod.products;

public class CafeDeCapsula implements Cafe{

    @Override
    public int medida() {
        return 350;
    }

    @Override
    public boolean contieneCafeina() {
        return true;
    }

    @Override
    public int intensidad() {
        return 10;
    }
}
