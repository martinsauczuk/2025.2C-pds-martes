package solid.OSP.productos.original;

public class Cigarrillos extends Producto{

    public Cigarrillos(float precioDeLista, String nombre) {
        super(precioDeLista, nombre);
    }

    @Override
    public float precioConImpuestos() {
        return super.precioConImpuestos() * 1.15f;
    }
}
