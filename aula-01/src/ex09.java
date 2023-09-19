import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East"));
        int currentYear = calendar.get(Calendar.YEAR);
        int age;

        do {
            System.out.print("Digite o ano em que você nasceu: ");
            age = scan.nextInt();

            if (age <= 0 || age > currentYear) {
                System.out.println("Digite uma idade válida!");
            }
        } while (age <= 0 || age > currentYear);

        System.out.println("A sua idade é: " + (currentYear - age));
    }
}
