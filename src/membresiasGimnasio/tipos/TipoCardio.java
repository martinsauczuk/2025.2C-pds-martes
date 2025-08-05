package membresiasGimnasio.tipos;

import membresiasGimnasio.membresias.Membresia;

public class TipoCardio extends TipoDeActividad{

    public boolean puedeSerRealizadaPor(Membresia unaMembresia) {
        return unaMembresia.isTieneAptoMedico();
    }

}
