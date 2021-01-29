public class Imprimepares {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int numbers : numeros) {
            if (numbers % 2 == 0) {
                System.out.println("Es par" + numbers);

            }
        }
    }
}


