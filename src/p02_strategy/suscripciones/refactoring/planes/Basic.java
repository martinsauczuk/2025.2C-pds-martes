package p02_strategy.suscripciones.refactoring.planes;

import p02_strategy.suscripciones.Producto;

/*
     Tiene envío gratis para productos de $100.000 o más.
    Envío con precio fijo de $6.000 para el resto de los productos.
 */
public class Basic implements PlanDeEnvio{

    private static int MINIMO_ENVIO_GRATIS = 100000;
    private static int PRECIO_ENVIO = 6000;

    @Override
    public int costoDeEnvioPara(Producto unProducto) {
        return unProducto.getPrecio() >= MINIMO_ENVIO_GRATIS
                ? 0
                : PRECIO_ENVIO;
    }
}
