import java.util.Scanner;

public class CalculaNegativos {

    static int numNegativos(int[] numeros) {
        int numNegativos = 0;
        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];

            if (numero < 0) {
                numNegativos++;
            }
        }
        return numNegativos;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Cuantos numeros vas a introducir...");
        int n = scan.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            numeros[i] = scan.nextInt();
        }

        System.out.println("Ha introducido " + numNegativos(numeros) + " negativos");
    }
}
