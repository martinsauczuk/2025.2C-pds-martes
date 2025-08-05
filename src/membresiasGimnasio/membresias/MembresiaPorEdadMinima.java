package membresiasGimnasio.membresias;

import membresiasGimnasio.Actividad;

public class MembresiaPorEdadMinima extends Membresia{

    @Override
    public boolean puedeRealizar(Actividad unaActividad) {
        return false;
    }
}
