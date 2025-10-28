package ejerciciosRefactor.aerolinea.tickets.creators;

import ejerciciosRefactor.aerolinea.pasajeros.Pasajero;
import ejerciciosRefactor.aerolinea.tickets.Ticket;
import ejerciciosRefactor.aerolinea.tickets.TicketAereo;

public class TicketAereoCreator implements TicketCreator{

    private int precioAdultos;

    @Override
    public Ticket generarPara(Pasajero unPasajero, String origen, String destino) {

        return new TicketAereo(origen, destino, unPasajero, precioPara(unPasajero));
    }

    private int precioPara(Pasajero unPasajero){
        return unPasajero.getEdad() > 18
                ? precioAdultos
                : precioAdultos / 2;
    }

    public void setPrecioAdultos(int precioAdultos) {
        this.precioAdultos = precioAdultos;
    }
}
