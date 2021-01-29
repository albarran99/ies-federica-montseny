public class Average {
    public static void main(String[] args) {
        double[] numberArray = {2.1, 4.2, 5.3};
        double item = 0;

        for (int i = 0; i < numberArray.length; i++) {
            item = item + numberArray[i];
        }
        item = item / numberArray.length;
        System.out.println("la media es...: " + item);
    }
}

