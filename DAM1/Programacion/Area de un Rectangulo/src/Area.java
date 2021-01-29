public class Area {
    static double Area(double X1, double x2, double Y1, double Y2) {
        return X * Y;
    }

    public static void main(String[] args) {
        if (args.length != 4) {
                System.out.println("tienes que introducir 4 argumento");
        } else
           // vertice 1
           double X1 =double.parseDouble(args[0]);
           double X2 =double.parseDouble(args[0]);
           // vertice 2
           double Y1 =double.parseDouble(args[0]);
           double Y2 =double.parseDouble(args[0]);

        double X = Math.abs(X1 - x2);

           double Y = Math.abs(Y1 - Y2);

           double calculaArea = X * Y;

           System.out.println("El area es " + calculaArea);

    }
}