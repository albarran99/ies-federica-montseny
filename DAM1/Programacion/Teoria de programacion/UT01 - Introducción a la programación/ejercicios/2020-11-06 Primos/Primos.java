import java.util.Scanner;

public class Primos {

    static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                // break;
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduzca entero mayor de 1...");
        int number = scan.nextInt();
        while (number <= 1) {
            System.out.println("Introduzca un entero mayor de 1...");
            number = scan.nextInt();
        }

        int number2 = scan.nextInt();

        if(isPrime(number) && isPrime(number2)) {
            System.out.println("son primos");
        } else if (!isPrime(number) && isPrime(number2)) {
            System.out.println("El primero no es primo");
        } else if (isPrime(number) && !isPrime(number2)) {
            System.out.println("El segundo no es primo");
        } else {
            System.out.println("No son primos");
        }

        System.out.println(isPrime(number));

    }
}
