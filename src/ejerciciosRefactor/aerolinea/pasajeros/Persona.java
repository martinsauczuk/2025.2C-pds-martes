package ejerciciosRefactor.aerolinea.pasajeros;

public class Persona implements Pasajero {

    private final int edad;
    private final String nombre;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
