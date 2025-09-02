package p05_state.vending.conState.states;

public interface ExpendedoraState {

    String indicacionDisplay();

    void confirmarPago();

    void seleccionarCafeSolo();

    void seleccionarCafeCortado();
}
