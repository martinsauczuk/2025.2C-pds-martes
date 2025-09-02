package p04_composite.ejemploClase.vendedores;

import java.util.HashSet;

public class EquipoDeVendedores implements Vendedor {

    private HashSet<Vendedor> integrantes = new HashSet<>();
    private String nombreDelEquipo;

    public void agregar(Vendedor unVendedor) {
        this.integrantes.add(unVendedor);
    }

    public String getId() {
        return nombreDelEquipo;
    }

    @Override
    public float cuandoFacturas() {

        float totalEquipo = 0;
        for (Vendedor integrante : this.integrantes) {
            totalEquipo = totalEquipo + integrante.cuandoFacturas();
        }
        return totalEquipo;

    }

    @Override
    public float cuantoGanas() {
        return 0;
    }

    @Override
    public void recibirComision(float unImporte) {

        float cuantoParaCadaIntegrante = unImporte / integrantes.size();

        for (Vendedor integrante : integrantes) {
            integrante.recibirComision(cuantoParaCadaIntegrante);
        }


    }


}
