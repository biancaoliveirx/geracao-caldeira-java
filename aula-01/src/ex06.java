import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;

        do {
            System.out.print("Digite sua idade atual: ");
            age = scan.nextInt();
            if (age <= 0) {
                System.out.println("Por favor adicione uma idade válida! ");
            }
        } while (age <= 0);

        if (age < 16) {
            System.out.println("Você não pode votar!");
        }else if (age <= 17 || age >= 65) {
            System.out.println("Seu voto é facultativo!");
        }else {
            System.out.println("Seu voto é obrigatório!");
        }

    }
}
