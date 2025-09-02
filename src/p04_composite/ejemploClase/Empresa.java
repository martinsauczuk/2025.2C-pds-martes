package p04_composite.ejemploClase;

import p04_composite.ejemploClase.vendedores.Vendedor;


import java.util.HashSet;

public class Empresa {

    private HashSet<Vendedor> vendedores = new HashSet<>();

    public void sumarVendedor(Vendedor unVendedor) {
        this.vendedores.add(unVendedor);
    }

    public float cuantoFacturasEnTotal() {

        float total = 0;
        for (Vendedor vendedor : this.vendedores) {
            total = total + vendedor.cuandoFacturas();
        }
        return total;
    }

    public void repartirRegalias(float cuantoAcadaVendedor) {

        for (Vendedor vendedor : vendedores) {
            vendedor.recibirComision(cuantoAcadaVendedor);
        }

    }
}
