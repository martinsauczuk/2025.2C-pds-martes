package p06_decorator.impresoras;


import p06_decorator.impresoras.documentos.Documento;

public final class Impresora implements ProcesadorDeDocumento {

    @Override
    public Documento procesar(Documento unDocumento) {
        System.out.printf("Impriendo documento...%d paginas %n", unDocumento.cantidadDePaginas());
        unDocumento.imprimir();
        return unDocumento;
    }

}
