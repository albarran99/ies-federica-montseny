public class Sumar {

    static int[] parseaArray(String[] strings) {
        int[] numeros = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            String value = strings[i];
            numeros[i] = Integer.parseInt(value);
        }
        return numeros;
    }

    static int suma(int[] numeros) {
        int suma = 0;
//        for (int i = 0; i < numeros.length; i++) {
//            int numero = numeros[i];
//            suma = numero + suma;
//        }

        for (int numero : numeros) {
            suma = numero + suma;
        }
        return suma;
    }

    public static void main(String[] args) {
        // 1. Definir un array de enteros
        // 2. Crear un metodo que devuelva la suma de un array de enteros
        // 3. Invocar el metodo desde el main pasando el array que hemos definido
        // 4. Imprimir el resultado de la suma
        // 5. Definir un metodo que recibe como parametro un array de String y
        // devuelve un array de enteros

        // int[] numeros = {2, 5, 7};
        int[] numeros = parseaArray(args);

        int s = suma(numeros);
        System.out.println(s);

        // System.out.println(suma(numeros));
    }
}
