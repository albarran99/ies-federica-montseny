public class EjemploNombre {

    static void buscanombre (String[] nombres, String name){
        for (int i = 0;i<nombres.length; i++) {
            String nombre = nombres[i];
            if (nombre == name) {
                System.out.println("Buenos dias " + nombre);
            }

        }

    }

    public static void main(String[]args){
        String[] nombres = {"Patricia","Raul","Carlos"};
       buscanombre(nombres, "Raul");
//        String[] nombres = {"Patricia", "Raul", "Carlos"};
//        String name = "Raul";
//        for(int i = 0;i < nombres.length; i++) {
//            String nombre = nombres[i];
//            if(nombre.equals(name)){
//                System.out.println("Buenos dias " + nombre);
//            } else{
//                System.out.println("Hola " + nombre);
//            }
//
//
//        }
    }
}
