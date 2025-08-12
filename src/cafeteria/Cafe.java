package cafeteria;

public abstract class Cafe {

    private int cantidadCafe = 0;
    private boolean estaListo = false;
    private boolean estaEntregado = false;
    private boolean tieneSobreEndulzante = false;

    public void preparar() {
        this.llenarCafe(330);
        this.agregarSobresEndulzante();
        this.finalizar();
        this.entregarAlCliente();
    }

    // no se negocia
    protected boolean estaListoParaEntregar(){
        return this.estaListo;
    }

    // no se negocia
    protected void llenarCafe(int unaCantidad) {
        this.cantidadCafe = unaCantidad;
    }

    // depende de cada implementacion
    protected abstract void finalizar();

    // no se negocia
    protected void entregarAlCliente() {
        this.estaEntregado = true;
    }

    // no se negocia
    protected void agregarSobresEndulzante() {
        this.tieneSobreEndulzante = true;
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "cantidadCafe=" + cantidadCafe +
                ", estaListo=" + estaListo +
                ", estaEntregado=" + estaEntregado +
                ", tieneSobreEndulzante=" + tieneSobreEndulzante +
                '}';
    }
}
