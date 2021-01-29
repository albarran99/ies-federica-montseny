public class maxGet {
    public static int main(String[] args) {
        if (args.length > 0) {
            int[] numbers = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }
            int max = getMax(numbers);
            System.out.println("El valor maximo es:" + max);

        } else {
            System.out.println("tiene que haber un argumento");
        }
    }
        public static int getMax ( int[] myMethod){
            int max = myMethod[0];
            for (int number : myMethod) {
                if (number > max) {
                    max = number;
                }

            }
            return max;

        }


    }
