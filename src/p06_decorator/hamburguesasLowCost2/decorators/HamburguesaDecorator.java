package p06_decorator.hamburguesasLowCost2.decorators;

import p06_decorator.hamburguesasLowCost2.Producto;

public abstract class HamburguesaDecorator implements Producto{

    private final Producto producto;

    HamburguesaDecorator(Producto hamburguesa){
        this.producto = hamburguesa;
    }

    @Override
    public float precioTotal(){
        return producto.precioTotal();
    }

    @Override
    public String descripcion() {
        return "";
    }
}
