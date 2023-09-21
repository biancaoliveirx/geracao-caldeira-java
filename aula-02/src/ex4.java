import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.System.in;

public class ex4 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(in);
        DecimalFormat di = new DecimalFormat("0");
        DecimalFormat dd = new DecimalFormat("0.00");
        double num1, num2, calculo;
        int opcoes;

        System.out.println("Insira um número: ");
        num1 = scan.nextDouble();
        System.out.println("Insira outro número: ");
        num2 = scan.nextDouble();

        do {
            System.out.println("Escolha uma das quatro operações: \n [1] - Adição \n [2] - Subtração \n [3] - Multiplicação \n [4] - Divisão \n [5] - Sair do Sistema");
            opcoes = scan.nextInt();

            switch (opcoes) {
                case 1:
                    calculo = num1 + num2;
                    System.out.println("A adição dos números " + num1 + " e " + num2 + " é igual a: " + di.format(calculo));
                    break;
                case 2:
                    calculo = num1 - num2;
                    System.out.println("A subtração dos números " + num1 + " e " + num2 + " é igual a: " + di.format(calculo));
                    break;
                case 3:
                    calculo = num1 * num2;
                    System.out.println("A multiplicação dos números " + num1 + " e " + num2 + " é igual a: " + di.format(calculo));
                    break;
                case 4:
                    if (num2 != 0) {
                        calculo = Double.valueOf(num1)  / Double.valueOf(num2);
                        System.out.println("A divisão dos números " + num1 + " e " + num2 + " é igual a: " + dd.format(calculo));
                    }
                    break;
                case 5:
                    System.out.println("\nSaindo do sistema...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.\n");

            }
        } while (opcoes < 1 || opcoes > 5); //repete até que o usuário coloque um número válido, caso contrário, cai no default


    }
}
