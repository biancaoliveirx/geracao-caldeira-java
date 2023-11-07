package ex02;

import java.util.Scanner;

public class MensagemDoDia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um dia da semana (ex: SEGUNDA, TERCA,...): ");
        String entrada = sc.next().toUpperCase();

        try {
            DiaDaSemana diaEscolhido = DiaDaSemana.valueOf(entrada);
            imprimirMensagem(diaEscolhido);
        } catch (IllegalArgumentException e) {
            System.out.println("Dia da semana inválido");
        }

        sc.close();
    }

    public static void imprimirMensagem(DiaDaSemana dia) {
        switch (dia) {
            case SEGUNDA:
                System.out.println("Começando a semana com energia!");
                break;
            case TERCA:
                System.out.println("Segundo dia, ainda com fôlego!");
                break;
            case QUARTA:
                System.out.println("Metade da semana, já é quarta-feira!");
                break;
            case QUINTA:
                System.out.println("Quinta-feira, já estamos quase lá!");
                break;
            case SEXTA:
                System.out.println("Sextou! O fim de semana está chegando!");
                break;
            case SABADO:
                System.out.println("Finalmente sábado, dia de descansar!");
                break;
            case DOMINGO:
                System.out.println("Domingo, um dia para aproveitar antes da nova semana!");
                break;
            default:
                System.out.println("Parece que esse dia não existe...");
                break;
        }
    }
}