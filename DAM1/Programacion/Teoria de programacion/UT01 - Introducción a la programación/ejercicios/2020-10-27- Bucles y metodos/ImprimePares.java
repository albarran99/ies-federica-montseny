public class ImprimePares {

    public static void main(String[] args) {
        int[] numeros = {2, 3, 5, 4, 6};

        for(int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            if(numero % 2 == 0) {
                System.out.println(" El numero " + numero + " es par");
            }
        }

        for(int numero: numeros) {
            if(numero % 2 == 0) {
                System.out.println("El numero " + numero + " es par");
            }
        }

    }
}
