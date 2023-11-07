package ex05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculavel calculadora = new CalculadoraSimples();

        try {
            System.out.print("Por favor, insira o primeiro número inteiro: ");
            int primeiroNumero = sc.nextInt();

            System.out.print("Por favor, insira o segundo número inteiro: ");
            int segundoNumero = sc.nextInt();

            System.out.println("Escolha a operação (ADICAO, SUBTRACAO, DIVISAO OU MULTIPLICACAO.");
            Operacao operacao = Operacao.valueOf(sc.next().toUpperCase());

            int resultado;
            switch (operacao) {
                case ADICAO:
                    resultado = calculadora.adicionar(primeiroNumero, segundoNumero);
                    break;
                case SUBTRACACAO:
                    resultado = calculadora.subtrair(primeiroNumero, segundoNumero);
                    break;
                case MULTIPLICACAO:
                    resultado = calculadora.multiplicar(primeiroNumero, segundoNumero);
                    break;
                case DIVISAO:
                    resultado = calculadora.dividir(primeiroNumero, segundoNumero);
                    break;
                default:
                    throw new  UnsupportedOperationException("Operação não suportada.");
            }
            System.out.println("Resultado: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor insira um numero inteiro.");
        } catch (ArithmeticException e) {
            System.out.println("Erro de aritmética: " + e.getLocalizedMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Operação invalida, por favor escolha entre ADICAO,SUBTRACAO, MULTIPLICACAO OU DIVISAO.");
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
