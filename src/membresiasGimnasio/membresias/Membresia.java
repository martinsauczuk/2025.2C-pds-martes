package membresiasGimnasio.membresias;

import membresiasGimnasio.Actividad;

// ESTA CLASE NO SE INSTANCIE NUNCA: solucionado
public abstract class Membresia {

    private String id;
    private String dni;

    private boolean tieneRevisacion;
    private boolean tieneAptoMedico;

    public boolean isTieneAptoMedico() {
        return tieneAptoMedico;
    }

    public boolean isTieneRevisacion() {
        return tieneRevisacion;
    }

    public String getDni() {
        return dni;
    }

    public String getId() {
        return id;
    }

    // OBLIGAR A HACER UNA SOBREESCRITURA: solucionado
    public abstract boolean puedeRealizar(Actividad unaActividad);
}
