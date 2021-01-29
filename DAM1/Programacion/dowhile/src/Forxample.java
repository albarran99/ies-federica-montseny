public class Forxample {
    public static void main(String[] args) {
        if (args.length == 1) {
            int iterations = Integer.parseInt(args[0]);
            if (iterations > 0) {
                for (int i = 0; i < iterations; i++) {
                    System.out.println("Hola mundo" + i);
                }
            } else {
                System.out.println("no puede haber numeros negativos");
            }
        } else
            System.out.println("no puede haber numeros negativos");
        {
        }
    }
}

