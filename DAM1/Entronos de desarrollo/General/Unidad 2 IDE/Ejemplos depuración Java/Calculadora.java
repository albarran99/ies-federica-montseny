import java.util.Scanner;

public class Calculadora {
    static Scanner scan = new Scanner(System.in);

    static void printMenu() {
        System.out.println("Seleccione una operación");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Salir");
    }

    static int chooseOperation() {
        int operation;
        {
            printMenu();
            operation = scan.nextInt();
        }
        while (operation < 1 || operation > 4) ;

        return operation;
    }

    static int askNumber() {
        System.out.println("Introduce un número...");
        return scan.nextInt();
    }


    static void sum(int n1, int n2) {
        int res = n1 + n2;

        System.out.println("El resultado de la suma es " + res);
    }

    static void substract(int n1, int n2) {
        int res = n1 - n2;

        System.out.println("El resultado de la resta es " + res);
    }

    static void multiply(int n1, int n2) {
        int res = n1 * n2;

        System.out.println("El resultado de la multiplicación es " + res);
    }

    static void calculatorLoop() {
        int operation;
        do {
            operation = chooseOperation();
            if (operation == 1) {
                sum(askNumber(), askNumber());
            } else if(operation == 2) {
                substract(askNumber(), askNumber());
            } else if(operation == 3) {
                multiply(askNumber(), askNumber());
            }
        } while (operation != 4);
    }

    public static void main(String[] args) {
        calculatorLoop();
    }
}
