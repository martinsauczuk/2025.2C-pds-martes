package p02_strategy.suscripciones.refactoring.planes;

import p02_strategy.suscripciones.Producto;

public class Premium implements PlanDeEnvio {

    /*
    La suscripción premium tiene envíos ilimitados en
    todos los productos
  */
    @Override
    public int costoDeEnvioPara(Producto unProducto) {
        return 0;
    }
}
