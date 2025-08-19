package p02_strategy.suscripciones.refactoring;

import p02_strategy.suscripciones.Producto;
import p02_strategy.suscripciones.refactoring.planes.Basic;
import p02_strategy.suscripciones.refactoring.planes.PlanDeEnvio;
import p02_strategy.suscripciones.refactoring.planes.Plus;
import p02_strategy.suscripciones.refactoring.planes.Premium;

public class Main {

    public static void main(String[] args) {

        Producto monitorSamsung = new Producto(20000,"Monitor 24");
        Producto cableHdmi = new Producto(13000,"Cable HDMI reforzado");

        PlanDeEnvio planBasico2025 = new Plus();

        Suscripcion suscripcionMartin = new Suscripcion("msauczuk", new Basic());

        System.out.println("Suscripcion basica ");
        System.out.printf(
                "Precio del producto: $%d, precio envio: $%d \n",
                monitorSamsung.getPrecio(),
                suscripcionMartin.costoDeEnvioPara(monitorSamsung)
        );
        System.out.printf(
                "Precio del producto: $%d, precio envio: $%d \n",
                cableHdmi.getPrecio(),
                suscripcionMartin.costoDeEnvioPara(cableHdmi)
        );
        System.out.println("---------");

        // Actualizamos el plan a Plus
        suscripcionMartin.actualizarPlan(new Plus());

        System.out.println("Suscripcion Plus");
        System.out.printf(
                "Precio del producto: $%d, precio envio: $%d \n",
                monitorSamsung.getPrecio(),
                suscripcionMartin.costoDeEnvioPara(monitorSamsung)
        );
        System.out.printf(
                "Precio del producto: $%d, precio envio: $%d \n",
                cableHdmi.getPrecio(),
                suscripcionMartin.costoDeEnvioPara(cableHdmi)
        );
        System.out.println("---------");

        // Actualizamos el plan a Premium
        System.out.println("Suscripcion Premium");
        System.out.printf(
                "Precio del producto: $%d, precio envio: $%d \n",
                monitorSamsung.getPrecio(),
                suscripcionMartin.costoDeEnvioPara(monitorSamsung)
        );

        System.out.printf(
                "Precio del producto: $%d, precio envio: $%d \n",
                cableHdmi.getPrecio(),
                suscripcionMartin.costoDeEnvioPara(cableHdmi)
        );
        System.out.println("-----------");
    }
}
