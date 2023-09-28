import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
                int[] numeros = new int[5];
                int soma = 0;

                for(int i = 0; i < 5; i++) {
                    System.out.print("Insira o número inteiro que ficará na posicao " + (i + 1) + ": ");
                    numeros[i] = scan.nextInt(); // Armazena o número inserido no array
                    soma += numeros[i]; // Adiciona o número inserido à soma
                }

                // Calcula a média dos números
                double media = (double) soma / 5;

                scan.close();

                // Imprime a soma e a média dos números
                System.out.println("Soma: " + soma);
                System.out.println("Média: " + media);
            }
        }

