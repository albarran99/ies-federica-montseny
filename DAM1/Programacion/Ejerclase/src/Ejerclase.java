import java.util.Scanner;

public class Ejerclase {

    static Scanner sacn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce un numero");
        int number = sacn.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
