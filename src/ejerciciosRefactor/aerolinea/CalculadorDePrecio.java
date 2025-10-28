package ejerciciosRefactor.aerolinea;

import ejerciciosRefactor.aerolinea.pasajeros.Pasajero;

public class CalculadorDePrecio {

    private int precioBase = 400;

    public int precioPara(Pasajero unPasajeo) {
        return unPasajeo.getEdad() > 18 ? precioBase : precioBase / 2;
    }

}
