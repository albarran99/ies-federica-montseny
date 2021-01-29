import java.util.Scanner;
public class Suprimo {

    static  boolean isPrimo(int number){
        boolean esPrimo = true;
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                esPrimo = false;
            }
        }
        return esPrimo;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero entero mayor que 1...");

        int number = scan.nextInt();

        while (number <= 1){
            System.out.println("Introduce un entero mayor que 1...");
            number = scan.nextInt();



        }
        System.out.println(isPrimo(number));

        }

    }


