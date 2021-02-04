import java.util.Scanner;

public class Bucles7_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un número mayor que 0: ");
        int n = scan.nextInt();
        while (n < 1) {
            System.out.print("El número debe ser mayor que 0, introduce un número: ");
            n = scan.nextInt();
        }

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
