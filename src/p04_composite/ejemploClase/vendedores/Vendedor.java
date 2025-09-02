package p04_composite.ejemploClase.vendedores;

public interface Vendedor {

    String getId();

    float cuandoFacturas();

    float cuantoGanas();

    void recibirComision(float unImporte);

}
