package solid.LSP.rectangulo.original;

public class Main {

    public static void main(String[] args) {

        // Mi rectangulo
        Rectangulo unRectangulo = new Rectangulo();
        unRectangulo.setAncho(10);
        unRectangulo.setLargo(5);
        System.out.println(unRectangulo.calcularArea()); // 50

        // Vamos a reemplazarlo por un Cuadrado
        unRectangulo  = new Cuadrado(); // Dijimos que un Cuadrado "es un" Rectangulo
        unRectangulo.setLargo(10);
        unRectangulo.setAncho(5);
        System.out.println(unRectangulo.calcularArea()); // 25

    }

}
