package p06_decorator.hamburguesasLowCost2.hamburguesa.componentes;

public class Componente {

    private float precio;

    public Componente(float unPrecio) {
        this.precio = unPrecio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
