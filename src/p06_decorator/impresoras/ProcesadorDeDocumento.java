package p06_decorator.impresoras;

import p06_decorator.impresoras.documentos.Documento;

public interface ProcesadorDeDocumento {

    Documento procesar(Documento unDocumento);

}
