package p06_decorator.impresoras.decorators;

import p06_decorator.impresoras.ProcesadorDeDocumento;
import p06_decorator.impresoras.documentos.Documento;

public class AnilladoraDecorator extends BaseDecorator{

    public AnilladoraDecorator(ProcesadorDeDocumento procesadorDeDocumento) {
        super(procesadorDeDocumento);
    }

    @Override
    public Documento procesar(Documento unDocumento) {
        Documento unDocumentoProcesado = super.procesar(unDocumento);
        System.out.println("Colocando anillado en documento...");
        unDocumentoProcesado.anillar();
        return unDocumentoProcesado;
    }
}
