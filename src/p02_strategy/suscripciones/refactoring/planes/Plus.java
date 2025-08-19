package p02_strategy.suscripciones.refactoring.planes;

import p02_strategy.suscripciones.Producto;


/*
    La suscripción Plus tiene envío gratis solo para productos con
    precio mayor o igual a $50.000. Para los demás productos tiene
    un precio del 15% del precio del producto
 */
public class Plus implements PlanDeEnvio{

    private static int MINIMO_ENVIO_GRATIS = 50000;
    private static int PORCENTAJE_PRECIO_PRODUCTO = 2;

    @Override
    public int costoDeEnvioPara(Producto unProducto) {
        return unProducto.getPrecio() >= MINIMO_ENVIO_GRATIS
                ? 0
                : PORCENTAJE_PRECIO_PRODUCTO * unProducto.getPrecio() / 100;
    }
}
