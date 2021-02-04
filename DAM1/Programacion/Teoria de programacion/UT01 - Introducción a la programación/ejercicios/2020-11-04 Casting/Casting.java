public class Casting {

    static double average(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];

            sum = sum + number;
        }
        double sumDouble = sum;
        return sumDouble / numbers.length;
    }

    static int max(int[] numbers) {
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];

            if (max < number) {
                max = number;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Introduce algun argumento");
        } else {
            int[] numbers = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                String arg = args[i];
                numbers[i] = Integer.parseInt(arg);
            }

            System.out.println(average(numbers));
        }


    }
}
