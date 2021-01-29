public class EjerPrograma4 {

    static void imprimEnPantalla(String[] moviles, int[] stock, int[] precio) {
        System.out.println("Los productos disponibles son: ");
        for (int i = 0; i < moviles.length; i++) {
            if (stock[i] > 0) {
                System.out.println(i + " Hay disponibles " + moviles[i] + " Con un precio " + precio[i]);
            }
        }

    }

    public static void main(String[] args) {
        String[] moviles = {"Iphone", "MotoG"};
        int[] stock = {2, 3};
        int[] precio = {1000, 200};
        imprimEnPantalla(moviles, stock, precio);

    }
}
