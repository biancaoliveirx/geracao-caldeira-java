package ex04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<ListaCompras> listaCompras;

    public Main() {
        listaCompras = new ArrayList<>();
    }

    public void adicionarCompra(ListaCompras novaCompra) {
        this.listaCompras.add(novaCompra);
    }

    public void removerCompra (int index) {
        if (index >= 0 && index < listaCompras.size() ) {
            listaCompras.remove(index);
        } else {
            System.out.println("Índice inválito");
        }
    }

    public void exibirCompras(int index) {
        for (int i = 0; i < listaCompras.size(); i++) {
            System.out.println((i+1) + ". " + listaCompras.get(i).toString());
        }
    }

    public static void main(String[] args) {
        Main lista = new Main();
        ListaCompras listaComprasAtual = new ListaCompras();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adicionar compra");
            System.out.println("2. Remover compra");
            System.out.println("3. Exibir compras");
            System.out.println("4. Total das compras");
            System.out.println("5. Sair");
            System.out.println("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            boolean shouldBreak = false;

            switch (opcao) {
                case 1:
                    if (!shouldBreak) {
                        System.out.println("Produto: ");
                        String nome = sc.nextLine();
                        System.out.println("Validade: ");
                        String validade = sc.nextLine();
                        System.out.println("Valor: ");
                        double preco = sc.nextDouble();
                        Produto produto = new Produto(nome, validade, preco);
                        listaComprasAtual.adicionarProduto(produto);
                        shouldBreak = true;
                    }
                case 2:
                    if(!shouldBreak) {
                        int index = 0;
                        lista.exibirCompras(index);
                        System.out.println("Digite o número da tarefa que deseja remover: ");
                        index = sc.nextInt() - 1;
                        lista.exibirCompras(index);
                        shouldBreak = true;
                    }
                case 3:
                    if (!shouldBreak) {
                        System.out.println(listaComprasAtual);
                        shouldBreak = true;
                    }
                case 4:
                    if (!shouldBreak) {
                        System.out.println("Custo total: " + listaComprasAtual.calcularCustoTotal());
                        shouldBreak = true;
                    }
                case 5:
                    if(!shouldBreak) {
                        sc.close();
                        System.exit(0);
                    }
                default:
                    if (!shouldBreak) {
                        System.out.println("Opçao inválida.");
                        shouldBreak = true;
                    }
                    System.out.println("Opçao inválida.");
            }

            if (shouldBreak) {
                continue;
            }
        }
    }
}

