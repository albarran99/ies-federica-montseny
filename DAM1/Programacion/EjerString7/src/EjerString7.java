import java.util.Scanner;

public class EjerString7 {

    static int contarCaracteres(String textoescaneado, char caracter) {
        int count = 0;
        for (int i = 0; i < textoescaneado.length(); i++) {
            char uncaracter = textoescaneado.charAt(i);

            if(uncaracter == caracter){
                count++;
            }
        }
        return count;
    }

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Escribe un texto");
        String texto = scan.nextLine();

        System.out.println("Introduce un carater");

        char caracter = scan.next().charAt(0);

        int cuenta = contarCaracteres(texto, caracter);

        System.out.println("El caracter se repite " + cuenta);
    }
}
