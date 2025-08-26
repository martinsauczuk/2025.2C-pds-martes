package p03_builder.gestionUniversitaria;

public class AlumnoBuilder {

    private String dni;
    private String nombres;
    private String apellido;
    private String legajo;
    private String genero;
    private String nacionalidad = "No declarada";


    public AlumnoBuilder declararGenero(String genero) {
        this.genero = genero;
        return this;
    }

    public AlumnoBuilder declararNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
        return this;
    }


    public AlumnoBuilder dni(String dni) {
        this.dni = dni;
        return this;
    }

    public AlumnoBuilder nombres(String nombres) {
        this.nombres = nombres;
        return this;
    }

    public AlumnoBuilder apellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    private String generarLegajo() {
        return "A" + apellido.substring(0, 3);
    }


    public Alumno build() {

        Alumno alumno = new Alumno(this.dni, generarLegajo(), this.nombres, this.apellido);
        alumno.setNacionalidad(this.nacionalidad);
        return alumno;

    }
}
