package p05_state.vending.conState.states;

import p06_state.vending.conState.MaquinaCafeVending;

public class EsperandoSeleccion implements ExpendedoraState{

    private final MaquinaCafeVending maquinaCafeVending;

    public EsperandoSeleccion(MaquinaCafeVending maquinaCafeVending) {
        this.maquinaCafeVending = maquinaCafeVending;
    }

    @Override
    public String indicacionDisplay() {
        return "Seleccione su producto...";
    }

    @Override
    public void confirmarPago() {
        //
    }

    @Override
    public void seleccionarCafeSolo() {
        System.out.println("Seleccionaste tu cafe solo");
        this.maquinaCafeVending.incrementarContadorCafes();
        this.maquinaCafeVending.establecerEstado(new ListoParaRetirar(this.maquinaCafeVending));
    }

    @Override
    public void seleccionarCafeCortado() {
        System.out.println("Seleccionaste tu cafe cortado");
        this.maquinaCafeVending.incrementarContadorCortados();
        this.maquinaCafeVending.establecerEstado(new ListoParaRetirar(this.maquinaCafeVending));
    }
}
