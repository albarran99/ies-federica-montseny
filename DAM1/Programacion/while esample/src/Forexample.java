public class Forexample {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            int v = Integer.parseInt(args[i]);
            sum = sum + v;
        }
        System.out.println(sum /args.length);
    }
}