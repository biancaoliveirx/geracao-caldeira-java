import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        int salary;

        do {
            System.out.println("Digite sua idade atual: ");
            age = scan.nextInt();
            if (age < 0) {
                System.out.println("A idade não pode ser negativa. Por favor, digite novamente.");
            }
        } while (age < 0);

        do {
            System.out.println("Digite seu salário atual: ");
            salary = scan.nextInt();
            if (salary < 0) {
                System.out.println("O salário não pode ser negativo. Por favor, digite novamente.");
            }
        } while (salary < 0);

        if (age > 18 && salary > 2000) {
            System.out.println("Você pode comprar um automóvel!");
        } else {
            System.out.println("Você ainda não atende os requisitos para comprar um automóvel!");
        }
    }
}
