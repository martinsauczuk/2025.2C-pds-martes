package p05_state.vending.conState.states;

import p06_state.vending.conState.MaquinaCafeVending;

public class Inactivo implements ExpendedoraState{

    private final MaquinaCafeVending maquinaCafeVending;

    public Inactivo(MaquinaCafeVending maquinaCafeVending) {
        this.maquinaCafeVending = maquinaCafeVending;
    }

    @Override
    public String indicacionDisplay() {
        return "Acerque su tarjeta...";
    }

    @Override
    public void confirmarPago() {
        this.maquinaCafeVending.establecerEstado(new EsperandoSeleccion(this.maquinaCafeVending));
    }

    @Override
    public void seleccionarCafeSolo() {
        //
    }

    @Override
    public void seleccionarCafeCortado() {
        //
    }
}
