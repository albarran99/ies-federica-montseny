import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
    static Scanner scan = new Scanner(System.in);

    static boolean checkNumber(int secretNum, int num) {
        boolean guessed = false;
        if (num > secretNum) {
            System.out.println("menor");
        } else if (num < secretNum) {
            System.out.println("mayor");
        } else {
            guessed = true;
        }
        return guessed;
    }

    public static void main(String[] args) {
        Random r = new Random();
        int secretNumber = r.nextInt(100); // Genera un numero aleatorio del 0 al 100
        System.out.println("Adivina un número del 0 al 100");
        boolean guessed = false;
        while (!guessed) {
            int num = scan.nextInt();
            guessed = checkNumber(secretNumber, num);
        }
        System.out.println("exacto!");
    }
}
