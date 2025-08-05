package membresiasGimnasio.tipos;

import membresiasGimnasio.membresias.Membresia;

public class TipoPileta extends TipoDeActividad{

    public boolean puedeSerRealizadaPor(Membresia unaMembresia) {
        return unaMembresia.isTieneRevisacion();
    }

}
