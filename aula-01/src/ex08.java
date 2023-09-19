import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int token;

        do {
            System.out.println("""
                    ----Opções de ficha para a fila----\s
                    1 - Gestante\s
                    2 - Idoso\s
                    3 - PCD\s
                    4 - Nenhuma das alternativas\s
                    ------------------------------------""");
            System.out.print("Escolha uma das opções: ");
            token = scan.nextInt();

            if (token < 1 || token > 4) {
                System.out.println("Digite um número válido!");
            }
        } while (token < 1 || token > 4);

        if (token <= 3) {
            System.out.println("Você está na fila prioritária!");
        } else {
            System.out.println("Você não está na fila prioritária!");
        }
    }
}
