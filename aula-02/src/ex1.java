import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o inicio do seu intervalo:");
        int num1 = Integer.parseInt(scan.nextLine());
        System.out.println("Digite o fim do seu intervalo:");
        int num2 = Integer.parseInt(scan.nextLine());
        for (int i = num1; i <= num2; i++) {
            if (primo(i) && i >= 2) {
                System.out.print(i + ", ");
            }
        }


    }

    private static boolean primo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }
}
