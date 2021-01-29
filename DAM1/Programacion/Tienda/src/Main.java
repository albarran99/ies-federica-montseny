public class Main {
    public static void main(String[] args) {
        Telefono iphone = new Telefono("F310",1000);

        iphone.informa();
        iphone.hayStock();
//        for (int i = 0; i < 10; i++) {
//            iphone.comprar();
//
//        }
//        iphone.comprar();
        iphone.comprarMasTelefonos(3);

        Telefono motoG = new Telefono("Qre09", 400);

        motoG.informa();
        motoG.hayStock();
//        for (int i = 0; i < 10; i++) {
//            motoG.comprar();
//        }
//        motoG.comprar();

        Telefono nokia = new Telefono("ver1.4",200);

        nokia.informa();
        nokia.hayStock();
//        for (int i = 0; i < 10; i++) {
//            nokia.comprar();
//        }
//        nokia.comprar();
        Telefono[] telefonos = {iphone, motoG, nokia};
        Tienda tienda = new Tienda(telefonos);
            tienda.pedido("F310", 3);
        }
    }

