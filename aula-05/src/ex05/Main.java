package ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaImpressao sistemaImpressao = new SistemaImpressao();

        while (true) {
            System.out.println("1. Adicionar documento à fila");
            System.out.println("2. Imprimir próximo documento");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção: ");
            int opcao = sc.nextInt();

            boolean shouldBreak = false;

            switch (opcao) {
                case 1:
                    if (!shouldBreak){
                        sc.nextLine();
                        System.out.println("Nome do documento: ");
                        String nome = sc.nextLine();
                        System.out.println("Número de páginas: ");
                        int numeroPaginas = sc.nextInt();
                        Documento documento = new Documento(nome, numeroPaginas);
                        sistemaImpressao.adicionarDocumento(documento);
                        shouldBreak = true;
                    }
                case 2:
                    if (!shouldBreak) {
                        sistemaImpressao.imprimirProximoDocumento();
                        shouldBreak = true;
                    }
                case 3:
                    if (!shouldBreak) {
                        System.out.println("Saindo...");
                        sc.close();
                        System.exit(0);
                    }
                default:
                    if (!shouldBreak) {
                        System.out.println("Opção inválida");
                        shouldBreak = true;
                    }
                    if (shouldBreak) {
                        continue;
                    }
            }
        }
    }
}
