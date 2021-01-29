import java.util.Scanner;

public class Intronumber {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Introduce un Numero ");
        int n = number.nextShort();
        System.out.println("Escribe un numero mayor que " + n);
        int m = number.nextShort();

        do  {
            System.out.println(m + " No es mayor que " + n);
            ++m;
            m = number.nextShort();
        } while (n > m);
        System.out.println("Los numeros que has introducido son " + n + " y " + m);

        }

    }



