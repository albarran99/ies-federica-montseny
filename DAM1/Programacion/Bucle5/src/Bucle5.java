import java.util.Scanner;

public class Bucle5 {
    public static void main(String[] args) {
        System.out.println("Introduce numeros por favor");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int result = number;
        while (number != 0) {
            System.out.println("Introduce otro numero");
            number = scan.nextInt();
            result = number + result;
        }
        System.out.println("La suma de los numeros introducidos es " + result);

    }
}
