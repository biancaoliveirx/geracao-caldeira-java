import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma frase ou palavra: ");
        String wordOrPhrase = scan.nextLine().toLowerCase();

        int counter = 0;

        for (int i = 0; i < wordOrPhrase.length(); i++) {
            char caractere = wordOrPhrase.charAt(i);
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                counter++;
            }
        }
        System.out.println("O número total de vogais na palavra/frase foi de " + counter + " vogais!");
    }
}
