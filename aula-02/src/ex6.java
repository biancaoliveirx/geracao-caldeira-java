import java.util.Scanner;

import static java.lang.System.in;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        System.out.println("Digite uma palavra: ");
        String str = scan.nextLine();
        StringBuilder builder = new StringBuilder(str);
        System.out.println("\nReverso: " + builder.reverse());
    }
}
