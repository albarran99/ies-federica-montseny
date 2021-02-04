import java.util.Scanner;

public class Bucles7_2 {

    static Scanner scanner = new Scanner(System.in);

    static int[] readArray() {
        System.out.println("Introduce el tamaño del array...");
        int n = scanner.nextInt();
        while (n <= 0) {
            System.out.println("El tamaño debe ser mayor que cero, introduce el tamaño del array...");
            n = scanner.nextInt();
        }
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }

    static int multiply(int number, int[] numbers) {
        int result = number;
        for(int number2: numbers) {
            result = result * number2;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers1 = readArray();
        int[] numbers2 = readArray();

        for(int number1: numbers1) {
            int result = multiply(number1, numbers2);
            System.out.println(result);
        }
    }
}
