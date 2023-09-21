import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float dolar;
        float quotation;

        do {
            System.out.println("Digite um valor em dólares para convertermos em reais: ");
            dolar = scan.nextFloat();
            if (dolar <= 0) {
                System.out.print("Digite um valor válido por gentileza!");
            }
        } while (dolar <= 0);

        do {
            System.out.print("Digite a cotação atual de dólares para reais: ");
            quotation = scan.nextFloat();
            if (quotation < 0) {
                System.out.println("Digite um valor válido por gentileza!");
            }
        } while (quotation < 0);
        System.out.println("O valor de " + dolar + " dólares em Reais é de: " + (dolar * quotation));
    }
}
