package ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<Tarefa> tarefas;

    public Main () {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa (Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(int index) {
        if(index >= 0 && index < tarefas.size()) {
            tarefas.remove(index);
        } else {
            System.out.println("Índice inválido");
        }
    }

    public void exibirTarefas() {
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i+1) + ". " + tarefas.get(i).toString());
        }
    }

    public static void main(String[] args) {
        Main lista = new Main();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Exibir tarefas");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opcao: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            boolean shouldBreak = false;

            switch (opcao) {
                case 1:
                    if(!shouldBreak) {
                        System.out.println("Título: ");
                        String titulo = sc.nextLine();
                        System.out.println("Data: ");
                        String data = sc.nextLine();
                        System.out.println("Descricao: ");
                        String descricao = sc.nextLine();
                        Tarefa tarefa = new Tarefa(titulo, data, descricao);
                        lista.adicionarTarefa(tarefa);
                        shouldBreak = true;
                    }
                case 2:
                    if(!shouldBreak) {
                        lista.exibirTarefas();
                        System.out.println("Digite o número da tarefa que deseja remover: ");
                        int index = sc.nextInt() - 1; // ajustar de acordo com arrays
                        lista.removerTarefa(index);
                        shouldBreak = true;
                    }
                case 3:
                    if (!shouldBreak) {
                        lista.exibirTarefas();
                        shouldBreak = true;
                    }
                case 4:
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
