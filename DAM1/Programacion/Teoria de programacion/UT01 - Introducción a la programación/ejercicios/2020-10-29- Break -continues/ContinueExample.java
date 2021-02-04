public class ContinueExample {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4};
        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];

            if (numero % 2 == 0) {
                continue;
            }
            System.out.println(numero);
        }

    }
}
