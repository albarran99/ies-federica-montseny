public class ForExample {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};
        int sum = 0;
        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            sum = sum + numero;
        }

        System.out.println(sum);
    }
}
