package cafeteria;

public class CafeParaLlevar extends Cafe {

    private boolean tieneTapa = false;
    private boolean tieneCartoncito = false;

    //
    @Override
    protected void finalizar() {
        this.tieneCartoncito = true;
        this.tieneTapa = true;
    }
}
