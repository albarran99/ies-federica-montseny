import java.util.Scanner;

public class Bucles6_2 {

    static Scanner scan = new Scanner(System.in);

    static int[] readNumbers() {
        System.out.print("Introduzca el tamaño del array: ");
        int n = scan.nextInt();
        while(n <= 0) {
            System.out.print("El array debe tener al menos un valor, " +
                    "introduzca el tamaño: ");
            n = scan.nextInt();
        }
        int[] numbers = new int[n];

        for(int i=0; i< n; i++) {
            numbers[i] = scan.nextInt();
        }

        return numbers;
    }

    static boolean isValueInArray(int[] array, int value) {
        boolean found = false;
        for(int arrayNumber: array) {
            if(arrayNumber == value) {
                found = true;
                break;
            }
        }

        return found;
    }

    public static void main(String[] args) {
        int[] numbers1 = readNumbers();
        int[] numbers2 = readNumbers();

//        for(int i=0; i<numbers1.length;i++) {
//            int number1 = numbers1[i];
//            for(int j=0; j<numbers2.length; j++) {
//                int number2 = numbers2[j];
//                if(number1 == number2) {
//                    System.out.println(number1);
//                }
//            }
//        }

        for(int i=0; i<numbers1.length;i++) {
            int number = numbers1[i];
            if(isValueInArray(numbers2, number)) {
                System.out.println(number);
            }
        }
    }
}
