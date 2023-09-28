import java.util.Scanner;
import java.util.Random;

public class ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] array = new int[10];
        Random random = new Random();

        System.out.print("Insira um número: ");
        int usuarioNumero = scan.nextInt();
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + random.nextInt(10);
        }


        boolean encontrado = false;
        for (int num : array) {
            if (num == usuarioNumero) {
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("O número " + usuarioNumero + " esdtá presente no array");
        } else {
            System.out.println("O número " + usuarioNumero + " nao está presente no array");
        }
        scan.close();
    }
}