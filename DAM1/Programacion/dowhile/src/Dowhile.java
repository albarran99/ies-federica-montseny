public class Dowhile {
    public static void main(String[] args) {
        if (args.length == 1) {
            int iterations = Integer.parseInt(args[0]);
            int i = 0;
            do {
                System.out.println("hola mundo" + i);
                i++;
            }
            while (i < iterations);

        }
    }
}

