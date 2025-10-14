package interfacesUbert;

import interfacesUbert.conductores.ConductorImpl;
import interfacesUbert.pasajeros.Viajero;
import interfacesUbert.plataforma.PlataformaDeViajes;
import interfacesUbert.plataforma.Ubert;

public class Main {

    public static void main(String[] args) {

        // Creamos la plataforma
        Ubert ubert = new Ubert();

        // Creamos los pasajeros
        Viajero martin = new Viajero();

        // Creamos los conductores
        ConductorImpl conductor1 = new ConductorImpl();
        ConductorImpl conductor2 = new ConductorImpl();

        // sumamos los conductores
        ubert.agregarObservador(conductor1);
        ubert.agregarObservador(conductor2);

        // Pedimos un viaje para Martin
        ubert.pedirViajePara(martin, 25);



    }
}
