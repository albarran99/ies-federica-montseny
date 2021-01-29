import java.util.Random;
import java.util.Scanner;

public class Adivinenumber {
    public static void main(String[] args) {
        System.out.println("Juguemos a adivinar el numero tienes que poner el numero exacto");
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        int numberAdiv = r.nextInt(100);
        boolean find = false;
        while (!find) {
            int numberUser = scan.nextInt();

            if (numberAdiv < numberUser) {
                System.out.println("El numero es menor");

            } else if (numberAdiv > numberUser) {
                System.out.println("El numero es mayor");

            } else {
                find = true;
            }


        }
        System.out.println("Exacto");
    }
}
