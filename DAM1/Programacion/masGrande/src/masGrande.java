public class masGrande {

    static int grande(int a, int b, int c) {
        int max;
        if (a > b && a > c) {
            max = a;
        } else if (c > b) {
            max = c;
        } else {
            max = b;
        }
        return max;
    }
    public static void main(String[] args) {
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        int c = Integer.parseInt(args[3]);

        int max = grande(a, b, c);
        System.out.println("El mayor es " + max);

        }
    }