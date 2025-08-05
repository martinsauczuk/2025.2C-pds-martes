package membresiasGimnasio.membresias;

import membresiasGimnasio.Actividad;

public class MembresiaPorTipoDeActividad extends Membresia {

    private String tipoDeActividad;

    public void setTipoDeActividad(String tipoDeActividad) {
        this.tipoDeActividad = tipoDeActividad;
    }

    @Override
    public boolean puedeRealizar(Actividad unaActividad) {
        return unaActividad.cualEsTuTipo().equals(tipoDeActividad);
    }

}
