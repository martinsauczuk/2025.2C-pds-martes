package p04_composite.ejemploClase;

import p04_composite.ejemploClase.vendedores.EquipoDeVendedores;
import p04_composite.ejemploClase.vendedores.Vendedor;
import p04_composite.ejemploClase.vendedores.VendedorUnipersonal;

public class Main {

    public static void main(String[] args) {

        VendedorUnipersonal matias = new VendedorUnipersonal("V10", 1000);
        VendedorUnipersonal melina = new VendedorUnipersonal("V11", 500);
        VendedorUnipersonal juli = new VendedorUnipersonal("V13", 100);

        Empresa companyCompany = new Empresa();
        companyCompany.sumarVendedor(matias);
        companyCompany.sumarVendedor(melina);
        companyCompany.sumarVendedor(juli);

        //
        VendedorUnipersonal tomas = new VendedorUnipersonal("V123", 300);
        VendedorUnipersonal alvaro = new VendedorUnipersonal("V456",  500);

        // Creamos equipo
        EquipoDeVendedores team665 = new EquipoDeVendedores();
        team665.agregar(tomas);
        team665.agregar(alvaro);

        // Agregamos equipo a la empresa
        companyCompany.sumarVendedor(team665);

        // COmo funciona el equipo
        System.out.println( "Total facturacion del equipo team 665: " + team665.cuandoFacturas());


        System.out.println("facturacion total: " + companyCompany.cuantoFacturasEnTotal());

        System.out.println(matias);
        System.out.println(melina);
        System.out.println(juli);


    }


}
