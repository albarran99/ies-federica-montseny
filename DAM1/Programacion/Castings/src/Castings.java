public class Castings {
        static double CalculateAverage(int[] averages) {
            int sum = 0;
            for (int number : averages) {
                sum = sum + number;


            }
            double sums = sum;
            return sums / averages.length;
        }

        public static void main(String[] args) {
            if (args.length > 0) {
                int[] averages = new int[args.length];
                for (int i = 0; i < averages.length; i++) {
                    int numbers = Integer.parseInt(args[i]);
                    averages[i] = numbers;
                }
                double result = CalculateAverage(averages);

                System.out.println("La media es " + result);
            } else {
                System.out.println("pon los argumentos");
            }
        }
    }

