package p05_state.vending.conState;

public class Main {

    public static void main(String[] args) {
        MaquinaCafeVending maquinaCafeVending = new MaquinaCafeVending();

        // - azucar
        maquinaCafeVending.btnMenosAzucar();

        // + azucar
        maquinaCafeVending.btnMasAzucar();

        maquinaCafeVending.acercarTarjetaCredito();
        System.out.println(maquinaCafeVending.indicacionDisplay());

        maquinaCafeVending.acercarTarjetaCredito();
        System.out.println(maquinaCafeVending.indicacionDisplay());


        System.out.println();
    }
}
