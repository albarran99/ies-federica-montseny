public class FindNumber {
    static boolean buscar(double[] numeros, double numero) {
        boolean encontrado = false;
        for (double n : numeros) {
            if (numero == n) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    public static void main(String[] args) {
        double[] numbers = {2.0, 3.1, -5.0};
        double n = 3.1;

        boolean encontrado = buscar(numbers, n);
        if(encontrado) {
            System.out.println("Encontrado");
        } else {
            System.out.println("No encontrado");
        }
    }
}
