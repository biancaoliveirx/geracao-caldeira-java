import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        do {
            System.out.print("Digite um número inteiro não negativo: ");
            num = scan.nextInt();
            if (num <= 0) {
                System.out.println("Digite um valor válido por gentileza!");
            }
        } while (num <= 0);

        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("O fatorial de " + num + " é: " + factorial);
    }
}
