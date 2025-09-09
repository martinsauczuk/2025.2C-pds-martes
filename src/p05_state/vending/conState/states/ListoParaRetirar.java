package p05_state.vending.conState.states;

import p05_state.vending.conState.MaquinaCafeVending;

public class ListoParaRetirar implements ExpendedoraState {

    private final MaquinaCafeVending maquinaCafeVending;

    public ListoParaRetirar(MaquinaCafeVending maquinaCafeVending) {
        this.maquinaCafeVending = maquinaCafeVending;
    }

    @Override
    public String indicacionDisplay() {
        return  String.format("Infusión listo con %d de azucar", maquinaCafeVending.getCantidadAzucarSeleccionada());
    }

    @Override
    public void confirmarPago() {
        this.maquinaCafeVending.establecerEstado(new Inactivo(this.maquinaCafeVending));
    }

    @Override
    public void seleccionarCafeSolo() {
        this.maquinaCafeVending.establecerEstado(new Inactivo(this.maquinaCafeVending));
    }

    @Override
    public void seleccionarCafeCortado() {
        this.maquinaCafeVending.establecerEstado(new Inactivo(this.maquinaCafeVending));
    }
}
