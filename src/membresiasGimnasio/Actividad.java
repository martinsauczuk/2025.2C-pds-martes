package membresiasGimnasio;

import membresiasGimnasio.membresias.Membresia;
import membresiasGimnasio.tipos.TipoDeActividad;

public class Actividad {

    private final String nombre;
//    private final String tipoDeActividad;
    private final TipoDeActividad tipoDeActividad;


    public Actividad(String nombre, TipoDeActividad tipoDeActividad) {
        this.nombre = nombre;
        this.tipoDeActividad = tipoDeActividad;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoDeActividad cualEsTuTipo() {
        return this.tipoDeActividad;
    }

    public boolean puedeSerRealizadaPor(Membresia unaMembresia) {
        return this.tipoDeActividad.puedeSerRealizadaPor(unaMembresia);
    }


}
