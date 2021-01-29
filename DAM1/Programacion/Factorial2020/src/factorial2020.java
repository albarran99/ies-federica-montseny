public class factorial2020 {

    static long calcuFactorial(long v2, long v1) {
        long result = 1;
        for (int i = 1; i <= v1 && i <= v2; ++i) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        int v1 = Integer.parseInt(args[0]);
        int v2 = Integer.parseInt(args[1]);
        int result = 0;
        if (v1 < 0 && v2 < 0) {
            System.out.println("No puede ser numeros negativos y menores que 2");
            for (int i = 1; i <= v1 && i <= v2; ++i) {
                ++result;
                calcuFactorial(result, result);

            }
            System.out.println("El factorial de " + v1 + " es " + calcuFactorial(v1, v1));
            System.out.println("El factorial de " + result + " es " + result);
            System.out.println("El factorial de " + v2 + " es " + calcuFactorial(v2, v2));
        }
    }


}


