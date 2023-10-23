package ex06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaReservas sistemaReservas = new SistemaReservas();

        while (true) {
            System.out.println("1. Reservar passagem.");
            System.out.println("2. Cancelar reserva.");
            System.out.println("3. Exibir reservas");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            boolean shouldBreak = false;

            switch (opcao) {
                case 1:
                    if (!shouldBreak) {
                        System.out.println("Nome: ");
                        String nome = sc.nextLine();
                        System.out.println("Local: ");
                        String local = sc.nextLine();
                        System.out.println("CPF: ");
                        String cpf = sc.nextLine();
                        System.out.println("Data de entrada: ");
                        String dataEntrada = sc.nextLine();
                        System.out.println("Data de saída: ");
                        String dataSaida = sc.nextLine();
                        Reserva reserva = new Reserva(nome, local, cpf, dataEntrada, dataSaida );
                        sistemaReservas.adicionarReserva(reserva);
                        shouldBreak = true;
                    }
                case 2:
                    if (!shouldBreak) {
                        System.out.println("Informe o CPF para cancelar a reserva: ");
                        String cpfParaCancelar = sc.nextLine();
                        sistemaReservas.cancelarReserva(cpfParaCancelar);
                        shouldBreak = true;
                    }
                case 3:
                    if (!shouldBreak) {
                        sistemaReservas.exibirReservas();
                        shouldBreak = true;
                    }
                case 4:
                    if (!shouldBreak) {
                        sc.close();
                        System.exit(0);
                    }
                default:
                    if (!shouldBreak) {
                        System.out.println("Opção inválida!");
                        shouldBreak = true;
                    }
            }

            if (shouldBreak) {
                continue;
            }
        }
    }
}
