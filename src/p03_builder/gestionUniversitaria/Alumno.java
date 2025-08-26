package p03_builder.gestionUniversitaria;

import java.util.HashSet;

public class Alumno {

    private final String dni;
    private final String nombres;
    private final String apellido;
    private final String legajo;

    private String genero;
    private String nacionalidad;

    private HashSet<Carrera> carreras = new HashSet<>();

    public Alumno(String dni, String legajo, String nombres, String apellido) {
        this.dni = dni;
        this.legajo = legajo;
        this.nombres = nombres;
        this.apellido = apellido;
    }

    public static class Generador {
        private String dni;
        private String nombres;
        private String apellido;
        private String legajo;

        public Generador nombres(String nombres) {
            this.nombres = nombres;
            return this;
        }
         // ...

        public Alumno build() {
            return new Alumno(this.dni, this.legajo, this.nombres, this.apellido);
        }

    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }


}
