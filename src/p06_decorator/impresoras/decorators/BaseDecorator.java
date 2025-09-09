package p06_decorator.impresoras.decorators;

import p06_decorator.impresoras.ProcesadorDeDocumento;
import p06_decorator.impresoras.documentos.Documento;

public abstract class BaseDecorator implements ProcesadorDeDocumento {

    private final ProcesadorDeDocumento procesadorDeDocumento;

    protected BaseDecorator(ProcesadorDeDocumento procesadorDeDocumento) {
        this.procesadorDeDocumento = procesadorDeDocumento;
    }

    @Override
    public Documento procesar(Documento unDocumento) {
        return procesadorDeDocumento.procesar(unDocumento);
    }

}
