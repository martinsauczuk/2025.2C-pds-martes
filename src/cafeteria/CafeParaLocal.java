package cafeteria;

public class CafeParaLocal extends Cafe {

    private  boolean tienePlatito;

    // implementar el metodo de la clase abstracta
    @Override
    protected void finalizar() {
        this.tienePlatito = true;
    }
}
