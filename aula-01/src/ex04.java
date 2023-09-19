import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float salarioMinimo = 1320;
        System.out.print("Digite o seu Salário: ");
        float salario = scan.nextFloat();
        float quantidadeDeSalariosMinimos = salario / salarioMinimo;

        System.out.println("O usuário recebe um total de " + (int) quantidadeDeSalariosMinimos + " salário(s) mínimo(s).");
    }
}
