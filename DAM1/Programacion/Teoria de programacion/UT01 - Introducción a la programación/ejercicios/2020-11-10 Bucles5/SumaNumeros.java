import java.util.Scanner;

public class SumaNumeros {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean zero = false;
        int sum = 0;
        System.out.println("Introduzca números...");
        while (!zero) {
            int number = scan.nextInt();
            // Actualizo el valor de zero al resultado de
            // comparar number == 0, es decir que tendrá
            // valor true si number es 0 y false en otro caso
            zero = number == 0;
            sum = sum + number;
        }
        System.out.println("La suma es " + sum);
    }
}
