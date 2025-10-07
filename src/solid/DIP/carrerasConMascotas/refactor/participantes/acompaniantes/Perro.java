package solid.DIP.carrerasConMascotas.refactor.participantes.acompaniantes;

public class Perro implements Acompaniante{

    public final int edad;
    public final String nombre;

    public Perro(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String tuNombre() {
        return nombre;
    }
}
