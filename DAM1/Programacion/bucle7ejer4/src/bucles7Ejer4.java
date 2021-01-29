import java.util.Scanner;

public class bucles7Ejer4 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero positivo");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        while (number <= 0) {
            System.out.println("Debe ser un numero positivo");
            number = scan.nextInt();
        }
        for (int i = number; i > 0; --i) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);

            }
            System.out.println();

        }

    }
}
