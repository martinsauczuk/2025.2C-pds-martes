package membresiasGimnasio;

import membresiasGimnasio.membresias.MembresiaFull;
import membresiasGimnasio.membresias.MembresiaPorEdadMinima;
import membresiasGimnasio.membresias.MembresiaPorTipoDeActividad;
import membresiasGimnasio.tipos.TipoCardio;
import membresiasGimnasio.tipos.TipoDeActividad;
import membresiasGimnasio.tipos.TipoPileta;

public class Main {


    public static void main(String[] args) {

        TipoDeActividad piletaConRevision = new TipoPileta();
        TipoDeActividad sinRestriccion = new TipoDeActividad();
        TipoDeActividad cardioConAptoMedico = new TipoCardio();

        Actividad natacion1 = new Actividad("Natacion", piletaConRevision );
        Actividad musculacion1 = new Actividad("Musculacion", sinRestriccion);
        Actividad crosfit = new Actividad("Crossfit", cardioConAptoMedico );

        MembresiaFull full1 = new MembresiaFull();
        System.out.println("full1 puede realizar: " + full1.puedeRealizar(natacion1)); //

        MembresiaPorTipoDeActividad membresiaParaPileta = new MembresiaPorTipoDeActividad();
        membresiaParaPileta.setTipoDeActividad("Pileta");

//        Membresia unaMembresia = new Membresia();
//        unaMembresia.puedeRealizar(natacion1);

        MembresiaPorEdadMinima membresiaAdultos = new MembresiaPorEdadMinima();
        membresiaAdultos.puedeRealizar(natacion1);
    }





}
