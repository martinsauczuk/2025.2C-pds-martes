package p06_decorator.hamburguesasLowCost2.decorators;

import p06_decorator.hamburguesasLowCost2.Producto;

public class EnvioADomicilio extends HamburguesaDecorator{

    public EnvioADomicilio(Producto hamburguesa) {
        super(hamburguesa);
    }

    @Override
    public String descripcion() {
        return "";
    }

    @Override
    public float precioTotal() {
        return super.precioTotal();
    }
}
