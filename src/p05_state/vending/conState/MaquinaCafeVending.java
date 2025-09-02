package p05_state.vending.conState;

import p06_state.vending.conState.states.EsperandoSeleccion;
import p06_state.vending.conState.states.ExpendedoraState;

public class MaquinaCafeVending {

    private ExpendedoraState estado;
    private int cantidadAzucarSeleccionada = 3;
    private int contadorCafes = 0;
    private int contadorCortados = 0;


    public MaquinaCafeVending() {
        this.estado = new EsperandoSeleccion(this);
    }

    public void incrementarContadorCafes() {
        this.contadorCafes ++;
    }
    public void incrementarContadorCortados() {
        this.contadorCortados ++;

    }

    public String indicacionDisplay() {
        return this.estado.indicacionDisplay();
    }

    public void btnMasAzucar() {
        cantidadAzucarSeleccionada = cantidadAzucarSeleccionada < 5
                ? cantidadAzucarSeleccionada + 1
                : cantidadAzucarSeleccionada;

    }

    public void btnMenosAzucar() {
        cantidadAzucarSeleccionada = cantidadAzucarSeleccionada > 0
                ? cantidadAzucarSeleccionada - 1
                : cantidadAzucarSeleccionada;
    }

    public int getCantidadAzucarSeleccionada() {
        return cantidadAzucarSeleccionada;
    }

    public void acercarTarjetaCredito() {
        this.estado.confirmarPago();
    }

    public void btnCafeSolo() {
        this.estado.seleccionarCafeSolo();
    }

    public void btnCafeCortado() {
        this.estado.seleccionarCafeCortado();
    }

    public void establecerEstado(ExpendedoraState estado) {
        this.estado = estado;
    }
}
