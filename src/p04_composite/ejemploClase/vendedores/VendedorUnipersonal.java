package p04_composite.ejemploClase.vendedores;

public class VendedorUnipersonal implements Vendedor{

    private float facturacion;
    private float gananciaNeta;
    private final String id;

    public VendedorUnipersonal(String id, float facturacion) {
        this.id = id;
        this.facturacion = facturacion;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public float cuandoFacturas() {
        return facturacion;
    }

    @Override
    public float cuantoGanas() {
        return gananciaNeta;
    }

    @Override
    public void recibirComision(float unImporte) {
        this.gananciaNeta = gananciaNeta + unImporte;
    }

    @Override
    public String toString() {
        return "VendedorUnipersonal{" +
                "ganancia=" + facturacion +
                ", id='" + id + '\'' +
                '}';
    }
}
