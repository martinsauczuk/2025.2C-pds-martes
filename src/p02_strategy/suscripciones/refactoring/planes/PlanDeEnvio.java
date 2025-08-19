package p02_strategy.suscripciones.refactoring.planes;

import p02_strategy.suscripciones.Producto;

public interface PlanDeEnvio {

    int costoDeEnvioPara(Producto unProducto);

}
