package p04_composite.vendedores;

public class Vendedor {

    private float facturacion;
    private float gananciaNeta;
    private final String id;

    public Vendedor(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public float cuandoFacturas() {
        return facturacion;
    }

    public float cuantoGanas() {
        return gananciaNeta;
    }

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
