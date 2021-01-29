import java.util.Scanner;

public class scanPar {
    static Scanner scan = new Scanner(System.in);

    static void pares() {
        System.out.println("Ecribe un numero par: ");
        int number = scan.nextInt();
        while (number %2 != 0) {
            System.out.println(number + " No es un numero par, intenta de nuevo: ");
            number = scan.nextInt();
        }
    }


    public static void main(String[] args) {
        String repeat = "S";
        int counter = 0;
        while( repeat.equals("S")){
            pares();
            System.out.println("¿Quieres escribir otro numero par ? (S/N): ");
            repeat = scan.next();
            counter ++;
        }
        System.out.println("Se han introducido " + counter);

    }
}
