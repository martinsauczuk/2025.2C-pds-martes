package p06_decorator.hamburguesasLowCost2.hamburguesa;

import p06_decorator.hamburguesasLowCost2.Producto;
import p06_decorator.hamburguesasLowCost2.hamburguesa.componentes.Extra;
import p06_decorator.hamburguesasLowCost2.hamburguesa.componentes.Medallon;
import p06_decorator.hamburguesasLowCost2.hamburguesa.componentes.Pan;

import java.util.ArrayList;

public class Hamburguesa implements Producto {

    private final Pan pan;
    private ArrayList<Medallon> medallones = new ArrayList<>();
    private ArrayList<Extra> extras = new ArrayList<>();

    public Hamburguesa(Pan unPan) {
        this.pan = unPan;
    }

    public void agregarMedallon(Medallon medallon){
        medallones.add(medallon);
    }

    public void agregarExtra(Extra extra){
        extras.add(extra);
    }

    public void eliminarMedallon(Medallon medallon){
        medallones.remove(medallon);
    }

    public void eliminarExtra(Extra extra){
        extras.remove(extra);
    }

    public boolean esValida(){
        return this.getCantMedallones() >= this.getCantExtras() && !this.medallones.isEmpty();
    }

    private int getCantMedallones(){
        return medallones.size();
    }

    private int getCantExtras(){
        return extras.size();
    }

    public float calcularPrecio() {
        return this.pan.getPrecio() + this.getPrecioMedallones() + this.getPrecioExtras();
    }


    private float getPrecioMedallones(){
        float precio = 0;
        for (Medallon medallon : medallones){
            precio += medallon.getPrecio();
        }
        return precio;
    }

    private float getPrecioExtras(){
        float precio = 0;
        for (Extra extra : extras){
            precio += extra.getPrecio();
        }
        return precio;
    }

    public boolean facturar(){
        return esValida();
    }

    @Override
    public float precioTotal() {
        return this.calcularPrecio();
    }

    @Override
    public String descripcion() {
        return "";
    }
}
