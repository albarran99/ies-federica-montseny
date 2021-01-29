public class Averageloop {
    static double calculateAverage(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum = sum + number;

        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        double[] numbers = new double[args.length];
        if (args.length > 0) {
            double[] myNumbers = {2.0, 1.0, 1.5};
            for (int i = 0; i < args.length;
                 i++) {
                double number = Double.parseDouble(args[i]);
                numbers[i] = number;
            }

            double avg = calculateAverage(myNumbers);

            System.out.println(avg);
        } else {
            System.out.println("pon al menos un argumento");
        }
    }
}


