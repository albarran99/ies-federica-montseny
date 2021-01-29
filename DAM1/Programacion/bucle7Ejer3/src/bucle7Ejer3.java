import java.util.Scanner;

public class bucle7Ejer3 {

    static int[] pideArray() {
        System.out.println("Introduce la longutud del array");
        Scanner scan = new Scanner(System.in);
        int[] numbers1 = new int[scan.nextInt()];
        System.out.println("Introduce numeros en la array");
        for (int i = 0; i < numbers1.length; ++i) {
            numbers1[i] = scan.nextInt();
        }
        return numbers1;
    }


    public static void main(String[] args) {
        int[] numbers1 = pideArray();
        int[] numbers2 = pideArray();
        for (int i = 0; i < numbers1.length; ++i) {
           int number1 = numbers1[i];
           int result = number1;
            for (int j = 0;j < numbers2.length; ++j) {
                int number2 = numbers2[j];
                 result = result * number2;


            }
            System.out.println("La multiplucacion es " + result);
        }
    }
}

