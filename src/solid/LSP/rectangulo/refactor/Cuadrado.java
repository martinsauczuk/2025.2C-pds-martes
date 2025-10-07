package solid.LSP.rectangulo.refactor;

public class Cuadrado implements Cuadrilatero{

    private int lado;

    @Override
    public int calcularArea() {
        return lado * lado;
    }

    @Override
    public void setAncho(int ancho) {
        lado = ancho;
    }

    @Override
    public void setLargo(int largo) {
        lado = largo;
    }
}
