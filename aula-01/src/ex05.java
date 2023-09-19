import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um horário (24H)");
        System.out.print("Horas: ");
        int hours = scan.nextInt();
        System.out.print("Minutos: ");
        int minutes = scan.nextInt();
        System.out.print("Segundos: ");
        int seconds = scan.nextInt();
        int secondsPassed = (hours * 60 * 60) + (minutes * 60) + seconds;

        System.out.printf("Já passaram-se " + secondsPassed + " Segundos desde a 00:00. E faltam exatos " + (86400 - secondsPassed) + " para a meia-noite.");
    }
}
