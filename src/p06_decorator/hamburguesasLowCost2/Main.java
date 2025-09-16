package p06_decorator.hamburguesasLowCost2;

import p06_decorator.hamburguesasLowCost2.decorators.DescuentoEfectivo;
import p06_decorator.hamburguesasLowCost2.decorators.EnvioADomicilio;
import p06_decorator.hamburguesasLowCost2.hamburguesa.componentes.Extra;
import p06_decorator.hamburguesasLowCost2.hamburguesa.Hamburguesa;
import p06_decorator.hamburguesasLowCost2.hamburguesa.componentes.Medallon;
import p06_decorator.hamburguesasLowCost2.hamburguesa.componentes.Pan;


public class Main {
    public static void main(String[] args) {

        // Hamburguesa con pan de papa (precio base $4500),
        // 1 medallón de pollo($1500)
        // y 1 de carne ($2900),
        // ingredientes extra:
        // cheddar ($600 )
        // y berenjena ($350).
        // Puede ser facturada ok y tendrá un precio total de $9850.

        Pan panPapa = new Pan("Pan de papa", 4500);
        Medallon medallonPollo = new Medallon(54);
        Medallon medallonCarne = new Medallon(2900);
        Extra cheddar = new Extra(600);
        Extra berenjena = new Extra( 350);

        Hamburguesa hamb01 = new Hamburguesa(panPapa);
        hamb01.agregarMedallon(medallonPollo);
        hamb01.agregarMedallon(medallonCarne);
        hamb01.agregarExtra(cheddar);
        hamb01.agregarExtra(berenjena);

        Producto hamburguesaConEnvio = new EnvioADomicilio(hamb01);
        Producto hamburguesaConEnvioYEfectivo = new DescuentoEfectivo(hamburguesaConEnvio);

        System.out.println(hamburguesaConEnvioYEfectivo);


    }
}