public class Multyply8y2 {
    static int multyplyby2(int a) {
        return a * 2;
    }

    public static void main(String[] args) {
        if (args.length == 2) {

            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            if (b < a) {
                int aux = b;
                b = a;
                a = aux;
            }
            if (a != 0) {
                while (a < b) {
                    a = multyplyby2(a);
                    System.out.println("ahora a es " + a);
                }
                System.out.println("a es " + a);
            }
        }
    }

}

