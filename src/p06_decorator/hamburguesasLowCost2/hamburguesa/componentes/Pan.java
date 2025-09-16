package p06_decorator.hamburguesasLowCost2.hamburguesa.componentes;

public class Pan {

    private String tipoPan;
    private float precio;

    public Pan(String tipoPan, float precio) {
        this.tipoPan = tipoPan;
        this.precio = precio;
    }

    public String getTipoPan() {
        return tipoPan;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
