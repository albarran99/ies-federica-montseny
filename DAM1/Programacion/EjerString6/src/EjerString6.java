import java.util.Scanner;

public class EjerString6 {

    static double avreage (double[] numbers){
        double sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];

        }
        return  sum / numbers.length;
    }

    static double[] parseNumbers(String numbersStr) {
        String[] numbersArrayStr = numbersStr.split(",");
        double[] numbersDouble = new double[numbersArrayStr.length];
        for (int i = 0; i < numbersDouble.length; i++) {
            double num = Double.parseDouble(numbersArrayStr[i].trim());
            numbersDouble[i] = num;
        }
        return numbersDouble;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("introduce numeros decimales separados por coma");
        String numbersStr = scan.nextLine();
        double[] numbers = parseNumbers(numbersStr);
        System.out.println(avreage(numbers));
    }
}
