import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero positivo...");
        int numero = scan.nextInt();
        System.out.println("Introduce otro numero positivo...");
        int otroNumero= scan.nextInt();
        System.out.println("Ha introducido el " + numero);
        System.out.println("Ha introducido el otro " + otroNumero);
    }
}
