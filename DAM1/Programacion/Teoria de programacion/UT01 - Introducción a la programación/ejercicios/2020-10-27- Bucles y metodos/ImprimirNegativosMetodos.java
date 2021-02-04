public class ImprimirNegativosMetodos {
    static void imprimeNegativos(int[] numbers) {
        for (int number : numbers) {
            // Si el numero es negativo
            if (number < 0) {
                System.out.println("Es negativo " + number);
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers1 = {-3, 2, -1};
        int[] numbers2 = {-3, -2, -10};
        int[] numbers3 = {3, 2, -15};

        imprimeNegativos(numbers1);
        imprimeNegativos(numbers2);
        imprimeNegativos(numbers3);
    }
}
