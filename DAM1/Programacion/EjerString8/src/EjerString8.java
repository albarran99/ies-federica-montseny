import java.util.Scanner;

public class EjerString8 {

    static String remueve(String text) {
        String resultado = "";
        for (int i = 0; i < text.length(); i++) {
            char caracter = text.charAt(i);
            if (caracter != 'a' && caracter != 'e' && caracter != 'o' && caracter != 'u' && caracter != 'i') {
                resultado += caracter;
            }
        }

        return resultado;
    }


    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce el texto: ");
        String texto = scan.nextLine();
        String resultado = remueve(texto);

        System.out.println(resultado);

    }
}
