package ex03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Insira o primeiro número inteiro:");
            int primeiroNum = sc.nextInt();

            System.out.println("Insira o segundo:");
            int segundoNum = sc.nextInt();

            System.out.println("Os números inseridos são: " + primeiroNum + " e " + segundoNum);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, insira apenas números inteiros.");
        } finally {
            sc.close();
        }
    }
}
