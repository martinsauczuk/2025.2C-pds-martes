package p04_composite.marcadores;

public class Main {

    public static void main(String[] args) {


        LocalComercial nike = new LocalComercial(45.3434f,45.3244f, "Nike", "L a V 10 a 20hs." );

        PaseoDeCompras unicenter = new PaseoDeCompras();
        unicenter.agregarHijo(nike);
        unicenter.setHorario("Lunes a lunes");

        Mapa mapa = new Mapa();
        mapa.agregarMarcador(nike);
        mapa.agregarMarcador(unicenter);


        System.out.println(mapa);




        System.out.println(nike.descripcion());
    }

}
