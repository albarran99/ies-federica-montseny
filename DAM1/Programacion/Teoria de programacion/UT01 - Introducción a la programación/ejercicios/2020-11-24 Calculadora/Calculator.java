import java.util.Scanner;

public class Calculator {
    static Scanner scan = new Scanner(System.in);

    static void multiply(double v1, double v2) {
        double res = v1 * v2;
        System.out.println(v1 + " x " + v2 + " = " + res);
    }

    static void substract(double v1, double v2) {
        double res = v1 - v2;
        System.out.println(v1 + " - " + v2 + " = " + res);
    }

    static void add(double v1, double v2) {
        double res = v1 + v2;
        System.out.println(v1 + " + " + v2 + " = " + res);
    }

    static double average(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    static double max(double[] numbers) {
        double maximum = numbers[0];
        for (double number : numbers) {
            if (number > maximum) {
                maximum = number;
            }
        }
        return maximum;
    }

    static double min(double[] numbers) {
        double minimum = numbers[0];
        for (double number : numbers) {
            if (number < minimum) {
                minimum = number;
            }
        }
        return minimum;
    }

    static double[] askNumbers() {
        System.out.print("Cuántos números desea introducir: ");
        int n = scan.nextInt();
        while (n < 1) {
            System.out.println("Debe introducir al menos un número, cúantos números desea introducir: ");
            n = scan.nextInt();
        }

        double[] numbers = new double[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scan.nextDouble();
        }
        return numbers;
    }

    static void printMenu() {
        System.out.println("Seleccione una operación: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Media");
        System.out.println("5. Máximo");
        System.out.println("6. Mínimo");
        System.out.println("7. Salir");
    }

    static int chooseOperation() {
        printMenu();
        int op = scan.nextInt();
        while (op < 1 || op > 7) {
            System.out.println("Operación inválida");
            printMenu();
            op = scan.nextInt();
        }
        return op;
    }

    static double askNumber() {
        System.out.print("Introduce número: ");
        return scan.nextDouble();
    }

    public static void main(String[] args) {
        int op = chooseOperation();

        while (op != 7) {
            if (op == 1) {
                add(askNumber(), askNumber());
            } else if (op == 2) {
                substract(askNumber(), askNumber());
            } else if (op == 3) {
                multiply(askNumber(), askNumber());
            } else if (op == 4) {
                System.out.println("La media es " + average(askNumbers()));
            } else if (op == 5) {
                System.out.println("El máximo es " + max(askNumbers()));
            } else if (op == 6) {
                System.out.println("El mínimo es " + min(askNumbers()));
            }
            op = chooseOperation();
        }
    }
}
