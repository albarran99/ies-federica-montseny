import java.util.Scanner;

public class NestedLoop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduzca número un mayor que 1");
        int number = scan.nextInt();

        while (number < 1) {
            System.out.println("Introduzca número un mayor que 1");
        }
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < number; j++) {
                sum = i + j;
                System.out.printf("%02d ", sum);
            }
            System.out.println();
        }
    }
}
