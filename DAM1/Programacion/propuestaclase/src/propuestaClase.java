import java.util.Scanner;

public class propuestaClase {

    static int sumaDeNumeros(int number1, int number2) {
        int result = number1 + number2;


        return result;

    }

    public static void main(String[] args) {
        System.out.println("Que operacion quere realizar '(+|-|*)'");
        Scanner scan = new Scanner(System.in);
        String operation = scan.nextLine();
        if (operation.equals("+")) {
            System.out.println("Introduce dos numeros para sumarlos");
            int number1 = scan.nextInt();
            int number2 = scan.nextInt();
            int result = sumaDeNumeros(number1, number2);
            System.out.println("El resultado es " + result);

        } else if (operation.equals("-")) {
            System.out.println("Introduce dos numeros para restar");
            scan.nextLine();

        } else if (operation.equals("*")) {
            System.out.println("Introduce dos numeros para multiplicar");
            scan.nextLine();
        }


    }
}
