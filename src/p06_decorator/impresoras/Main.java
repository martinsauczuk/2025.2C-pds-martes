package p06_decorator.impresoras;


import p06_decorator.impresoras.decorators.AbrochadoraDecorator;
import p06_decorator.impresoras.decorators.AnilladoraDecorator;
import p06_decorator.impresoras.documentos.Documento;
import p06_decorator.impresoras.documentos.DocumentoDeTexto;

public class Main {

    public static void main(String[] args) {

        // Documento
        DocumentoDeTexto doc01 = new DocumentoDeTexto("Doc01",3);
        DocumentoDeTexto doc02 = new DocumentoDeTexto("Doc02",5);
        DocumentoDeTexto doc03 = new DocumentoDeTexto("Doc03", 5);
        DocumentoDeTexto doc04 = new DocumentoDeTexto("Doc04", 2);


        // Impresora solamente
        System.out.println(">> Impresora");
        Impresora impresora = new Impresora();
        impresora.procesar(doc01);
        System.out.println(doc01);
        System.out.printf("-----------------%n");


        // Impresora + Abrochadora
        System.out.println(">>> Impresora + abrochadora");
        ProcesadorDeDocumento impresoraAbrochadora = new AbrochadoraDecorator(impresora);
        impresoraAbrochadora.procesar(doc02);
        System.out.println(doc02);
        System.out.printf("-----------------%n");

        // Impresora + Anilladora
        System.out.println(">>> Impresora + anillado");
        ProcesadorDeDocumento impresoraAnilladora = new AnilladoraDecorator(impresora);
        impresoraAnilladora.procesar(doc03);
        System.out.println(doc03);
        System.out.printf("-----------------%n");


        // Impresora + abrochadora + anillado
        System.out.println(">>> Impresora + abrochadora + anillado");
        ProcesadorDeDocumento impresoraAbrochadoraAnillado = new AnilladoraDecorator(impresoraAbrochadora);
        impresoraAbrochadoraAnillado.procesar(doc04);
        System.out.println(doc04);
        System.out.printf("-----------------%n");


        // Impresora + abrochadora + anillado
        System.out.println(">>> Impresora + abrochadora + anillado");
        ProcesadorDeDocumento mamushka =
                new AnilladoraDecorator(
                    new AbrochadoraDecorator(
                            new Impresora()
                    )
                );
        System.out.println(mamushka);


        // Impresora + abrochadora + anillado "stack"
        System.out.println(">>> Impresora + abrochadora + anillado");
        ProcesadorDeDocumento procesadorStack = new Impresora();
        procesadorStack = new AbrochadoraDecorator(procesadorStack);
        procesadorStack = new AnilladoraDecorator(procesadorStack);



    }

}
