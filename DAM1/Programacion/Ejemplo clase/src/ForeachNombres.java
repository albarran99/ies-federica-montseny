public class ForeachNombres {
    static void imprimenombresforeach (String[] nombres, String name){
        for (String nombre: nombres){
            if (nombre == name){
                System.out.println("Buenos dias "+ nombre);
            } else{
                System.out.println("Hola " + nombre);
            }
        }
    }
    public static void main(String[]args){
        String[] nombres = {"Patricia","Raul","Carlos"};
        imprimenombresforeach(nombres, "Raul");
        System.out.println("--------------------------------");
        imprimenombresforeach(nombres, "Patricia");
        System.out.println("--------------------------------");
        imprimenombresforeach(nombres, "Carlos");

    }
}
