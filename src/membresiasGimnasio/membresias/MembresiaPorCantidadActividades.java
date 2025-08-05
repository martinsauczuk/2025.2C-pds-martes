package membresiasGimnasio.membresias;

import membresiasGimnasio.Actividad;

public class MembresiaPorCantidadActividades extends Membresia {

    @Override
    public boolean puedeRealizar(Actividad unaActividad) {
        return false;
    }
}
