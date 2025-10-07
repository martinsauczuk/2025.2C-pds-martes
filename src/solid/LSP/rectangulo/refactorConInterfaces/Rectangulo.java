package solid.LSP.rectangulo.refactorConInterfaces;

public class Rectangulo implements Cuadrilatero {

    protected int ancho;
    protected int largo;

    @Override
    public int calcularArea() {
        return ancho * largo;
    }

    @Override
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public void setLargo(int largo) {
        this.largo = largo;
    }
}
