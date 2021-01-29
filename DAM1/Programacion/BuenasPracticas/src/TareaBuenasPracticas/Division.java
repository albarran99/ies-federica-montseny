public class Division {

    public static void main(String[] args) {  //metodo que recibe un array de strings que son los args que pasamos al programa directamente en la configuracion

        double num1 = 0; double num2 = 0; double resultado = 0;

        if(args.length != 2) {
            System.out.println("ERROR. El programa no continúa.");
        }
        else {
        num1 = Double.parseDouble(args[0]);  // pone el valor de la posicion 0 del array args dentro de la variable num, y lo convierte a double
        num2 = Double.parseDouble(args[1]);

        if(num2 == 0) System.out.println("ERROR. El segundo numero es 0.");
        else {
            resultado = division(num1, num2);
            imprimirResultado(resultado); // esto seria como poner imprimirResultado(division(num1, num2));
        }
        }
    }

    public static double divisiondedosnumeros(double x, double y) {  // public static double (que devuelve datos de tipo double), se llama division, y se le pasan parametros tipo double (en este caso)
        double resultado = x/y; return resultado;
    }

    public static void Imprimirresultado(double resultadoDivision) {
        System.out.println("El resultado de la división es: " + resultadoDivision);
    }

}

