package p06_decorator.impresoras.decorators;

import p06_decorator.impresoras.ProcesadorDeDocumento;
import p06_decorator.impresoras.documentos.Documento;

public class AbrochadoraDecorator extends BaseDecorator {

    public AbrochadoraDecorator(ProcesadorDeDocumento procesadorDeDocumento) {
        super(procesadorDeDocumento);
    }

    @Override
    public Documento procesar(Documento unDocumento) {
        Documento unDocumentoProcesado = super.procesar(unDocumento);
        System.out.println("Colocando ganchito en documento...");
        unDocumentoProcesado.abrochar();
        return unDocumentoProcesado;
    }
}
