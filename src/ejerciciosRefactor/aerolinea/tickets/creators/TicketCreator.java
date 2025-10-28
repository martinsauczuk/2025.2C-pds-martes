package ejerciciosRefactor.aerolinea.tickets.creators;

import ejerciciosRefactor.aerolinea.pasajeros.Pasajero;
import ejerciciosRefactor.aerolinea.tickets.Ticket;

public interface TicketCreator {

    Ticket generarPara(Pasajero unPasajero, String origen, String destino);

}
