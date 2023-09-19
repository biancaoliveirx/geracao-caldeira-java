import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Por favor, insira uma temperatura em graus Celsius: ");
        float celsiusTemp = scan.nextFloat();

        System.out.println(celsiusTemp + " graus celsius são equivalente a " + ((celsiusTemp * 9/5) + 32) + " graus fahrenheits");
    }
}
