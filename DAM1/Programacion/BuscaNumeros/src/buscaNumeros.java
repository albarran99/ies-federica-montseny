import java.util.Scanner;

public class buscaNumeros {


    static int numberMax(int[] nums) {
        int numbers = 0;

        for (int i = 0; i < nums.length; ++i) {

            int number = nums[i];

            if (number > numbers) {
                numbers = number;
            }
        }
        return numbers;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("¿Cunatos numeros va a introducir? ");
        int n = scan.nextInt();

        System.out.println("introduce " + n + " numero(s)");
        int[] nums = new int[n];

        for (int i = 0; i < n; ++i) {
            nums[i] = scan.nextInt();
        }
        System.out.println("El mayor es él que está en la posición numero " + numberMax(nums));

    }
}


