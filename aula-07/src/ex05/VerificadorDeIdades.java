package ex05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VerificadorDeIdades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Por favor, insira sua idade: ");
            int idade = sc.nextInt();

            //Verifica se a idade é válida
            if (idade < 0 || idade > 150) {
                throw new IdadeInvalidaException("Idade inválida: a idade deve estar entre 0 e 150.");
            }

            System.out.println("Sua idade é " + idade + " anos.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: por favor insira um número inteiro.");
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro de validaçãp: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
