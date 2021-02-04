import java.util.Random;

public class While2Example {

    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        // Esto sirve para generar numeros aleatorios
        Random r = new Random();
        // Esto genera un entero de 0 a 100
        int num = r.nextInt(100);
        while (num > 50) {
            // Creo otro numero aleatorio de 0 a 100
            num = r.nextInt(100);
        }
        System.out.println(num);

        for (int j = 0; j < 5; j++) {
            System.out.println(j);

        }

        String[] cars = {"Volvo", "Ford", "Seat"};
        for (String car : cars) {
            System.out.println(car);
        }

        int[] numbers = {1, 2, 3};

        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }

        System.out.println(sum);
    }
}
