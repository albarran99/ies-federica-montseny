public class arayNmber {
    public static void main(String[] args) {
        double number = 0;
        double[] list = new double[0];
        list = new double[]{1.2, 2.0, 3.5};
        for (int i =0; i < list.length; i++) {
        for (int i =0; i < list.length; i++) {
            number = Double.parseDouble(args[0]);
            if (args.length != 1) {
            System.out.println("solo un valor por favor");
        } else if (number == 1.2) {
                System.out.println("Encontrado");
            } else if (number == 2.0) {
                System.out.println("Encontrado");
            } else if (number == 3.5) {
                System.out.println("Encontrado");
            } else {
                System.out.println("No encontrado");
            }
            break;
       }
    }

}




