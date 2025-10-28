package ejerciciosRefactor.aerolinea;

import ejerciciosRefactor.aerolinea.pasajeros.Mascota;
import ejerciciosRefactor.aerolinea.pasajeros.Pasajero;
import ejerciciosRefactor.aerolinea.pasajeros.Persona;
import ejerciciosRefactor.aerolinea.tickets.TicketAereo;

public class Main {

    public static void main(String[] args) {

        Pasajero unPasajero = new Persona("Martin", 38);
        TicketAereo ticketBUEaBRC = new TicketAereo("BUE", "BRC",unPasajero);
        TicketAereo ticketMascota = new TicketAereo("BUE", "MDZ", new Mascota());

        System.out.printf("Origen: %s. Destino: %s Precio: %d", ticketBUEaBRC.getOrigen(), ticketBUEaBRC.getDestino(), ticketBUEaBRC.getPrecio());

    }


}
