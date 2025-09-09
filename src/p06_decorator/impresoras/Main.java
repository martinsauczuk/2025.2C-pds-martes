package p06_decorator.impresoras;


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


        // Impresora + abrochadora
        System.out.println(">>> Impresora + abrochadora");

        //
        //
        System.out.println(doc02);
        System.out.printf("-----------------%n");



        // Impresora + anillado
        System.out.println(">>> Impresora + anillado");

        System.out.println(doc03);
        System.out.printf("-----------------%n");


        // Impresora + anillado
        System.out.println(">>> Impresora + anillado");

        System.out.println(doc04);
        System.out.printf("-----------------%n");








    }

}
