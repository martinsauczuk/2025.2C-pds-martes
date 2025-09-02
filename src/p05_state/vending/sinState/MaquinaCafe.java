package p05_state.vending.sinState;

public class MaquinaCafe {

    private int cantidadAzucarSeleccionada = 3;
    private int contadorCafes = 0;
    private int contadorCortados = 0;

    private String mensaje = "Acerque su tarjeta";

    private boolean yaPago;
    private boolean yaEligio;


    public String indicacionDisplay() {

        if (yaPago) {
            mensaje = "Seleccione su bebida";
        }

        if (yaEligio) {
            mensaje = "Gracias";
        }

        return mensaje;
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
        // "habilitar los botones"
        yaPago = true;
        mensaje = "Ya pagaste, ahora elegi tu bebida";
    }

    public void btnCafeSolo() {
        // preparar cafe solo si ya pagó
        // incrementar el contador de cafe

        if (yaPago) {
            contadorCafes ++;
            yaPago = false;
            mensaje = "Acerque su tarjeta";
        }



    }

    public void btnCafeCortado() {
        // preparar cafe solo si ya pagó
        // incrementar el contador de cafe cortado
    }


}
