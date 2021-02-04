import java.util.Scanner;

public class CuentaPares {

    static Scanner scan = new Scanner(System.in);

    static void pidePares() {
        System.out.print("Escriba un numero par: ");
        int n = scan.nextInt();
        while (n % 2 == 1) {
            System.out.print(n + " no es un número par. Inténtelo de nuevo: ");
            n = scan.nextInt();
        }
    }

    public static void main(String[] args) {
        String continuar = "S";
        int numPares = 0;
        // equalsIgnoreCase comprueba que continuar
        // sea igual a s o S, ignorando mayúsculas o minúsculas
        while (continuar.equalsIgnoreCase("S")) {
            pidePares();
            System.out.print("¿Quiere escribir otro número par? (S/N): ");
            continuar = scan.next();
            numPares++;

        }

        System.out.println("Ha escrito " + numPares + " números pares");
    }
}
