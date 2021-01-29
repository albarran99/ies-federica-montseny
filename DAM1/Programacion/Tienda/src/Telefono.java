public class Telefono {
    private String modelo;
    private int stock;
    private double precio;

    public Telefono(String Modelo, int stock, double precio) {
        this.modelo = Modelo;
        this.stock = stock;
        this.precio = precio;
    }

    public Telefono(String modelo, double precio) {
        this.modelo = modelo;
        this.stock = 10;
        this.precio = precio;
    }


    public boolean hayStock() {
        return getStock() > 0;
    }

    public void comprar() {
        if (!hayStock()) {
            System.out.println("No hay Stock");
        } else {
            //setStock(getStock() - 1);
            stock--;
            System.out.println("Compraste el " + modelo + " Con precio " + precio + " Todavia quedan " + stock);
        }
    }

    public void comprarMasTelefonos(int cantidad) {
        if (cantidad <= stock) {
            stock = stock - cantidad;
            double precioTotal = precio * cantidad;
            System.out.println("has comprado " + modelo + cantidad +" con precio final " + precioTotal + " Quedan: " + stock);
        } else {
            System.out.println("No hay tantos telefonos");


        }
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void informa() {
        System.out.println("Hay los siguientes moviles " + getModelo() + " Con precio " + getPrecio());
    }

    public int getStock() {
        return stock;

    }
}
