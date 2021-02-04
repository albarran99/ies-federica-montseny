public class BuscaBreak {

    static boolean busca(int[] numeros, int numero) {
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            int n = numeros[i];
            if(numero == n) {
                encontrado = true;
                break;
            }
        }
        return encontrado;
    }

    static boolean buscaForeach(int[] numeros, int numero) {
        boolean encontrado = false;
        for (int n: numeros) {
            if(numero == n) {
                encontrado = true;
                break;
            }
        }
        return encontrado;
    }

    public static void main(String[] args) {
        int[] numeros = {2, 3, 5, 4};
        if(busca(numeros, 3)) {
            System.out.println("Encontrado");
        } else  {
            System.out.println("No encontrado");
        }
    }
}
