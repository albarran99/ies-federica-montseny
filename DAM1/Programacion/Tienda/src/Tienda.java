public class Tienda {
    private Telefono[] moviles;

    public Tienda(Telefono[] telefonos) {
        this.moviles = telefonos;
    }

    public boolean hayTelefono(String nombreDeTelefono) {
        boolean telefonoStock = false;

        for (int i = 0; i < moviles.length; i++) {
            Telefono movil = moviles[i];

            if (nombreDeTelefono.equals((movil.getModelo()))) {
                telefonoStock = true;

            }
        }
        return telefonoStock;
    }

    public Telefono getTelefono(String nombreDeElTelefono) {
        Telefono telefonoEncontrado = null;
        for (int i = 0; i < moviles.length; i++) {
            Telefono movil = moviles[i];

            if (movil.getModelo().equals(nombreDeElTelefono)) {
                telefonoEncontrado = movil;

            }
        }
        return telefonoEncontrado;
    }

    public void pedido(String nombreDeElTelefono, int cantidad) {
        if (hayTelefono(nombreDeElTelefono)) {
            Telefono movil = getTelefono(nombreDeElTelefono);

            movil.comprarMasTelefonos(cantidad);
        } else {
            System.out.println("No existe ese telefono en la tienda");
        }
    }

}
