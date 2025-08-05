package membresiasGimnasio.membresias;

import membresiasGimnasio.Actividad;

public class MembresiaFull extends Membresia {

    @Override
    public boolean puedeRealizar(Actividad unaActividad) {

        return unaActividad.cualEsTuTipo().puedeSerRealizadaPor(this);

    }

}
