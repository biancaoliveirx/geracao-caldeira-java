import java.util.Scanner;

import static java.lang.System.in;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        System.out.println("Digite uma palavra: ");
        String metade = scan.nextLine();
        System.out.println("\nPrimeira metade: " + metade.substring(0,metade.length()/2));
    }
}
