package ejerciciosRefactor.aerolinea.tickets;

import ejerciciosRefactor.aerolinea.pasajeros.Pasajero;

public class TicketAereo implements Ticket{

    private Pasajero pasajero;
    private final int precio;
    private final String origen;
    private final String destino;

    public TicketAereo(String origen, String destino, Pasajero pasajero, int precio) {
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public String getDestino() {
        return destino;
    }

    @Override
    public String getOrigen() {
        return origen;
    }
}
