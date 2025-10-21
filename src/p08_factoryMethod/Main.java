package p08_factoryMethod;


import p08_factoryMethod.creators.CafeCreator;
import p08_factoryMethod.creators.CafeteraNespresso;
import p08_factoryMethod.creators.CafeteraVending;
import p08_factoryMethod.products.Cafe;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Cafe> cafesConsumidos = new HashSet<>();
        CafeCreator creator1 = new CafeteraNespresso();
        CafeCreator vendingPasillo = new CafeteraVending();

        cafesConsumidos.add( creator1.preparar() );
        cafesConsumidos.add( vendingPasillo.preparar());


        int cafeConsumidoTotal = 0;
        for (Cafe cafe : cafesConsumidos) {
           cafeConsumidoTotal = cafeConsumidoTotal + cafe.medida();
        }
        System.out.printf("Consumi %d ml de cafe %n", cafeConsumidoTotal );









    }

}
