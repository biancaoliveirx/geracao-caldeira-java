package ex05;

import java.util.LinkedList;

public class SistemaImpressao {
    private LinkedList<Documento> filaImpressao;

    public SistemaImpressao() {
        this.filaImpressao = new LinkedList<>();
    }

    public void adicionarDocumento(Documento documento) {
        filaImpressao.add(documento);
        System.out.println("Documento adicionado à fila: " + documento);
    }

    public  void imprimirProximoDocumento() {
        if (!filaImpressao.isEmpty()) {
            Documento documento = filaImpressao.remove();
            System.out.println("Imprimindo documento: " + documento);
            //simula a impressao do documento
        } else {
            System.out.println("A fila de impressão está vazia!");
        }
    }
}
