public class ImprimeNegativos {

    // Hacer un metodo que reciba como parametro un array de int
    // Quiero que imprima en pantalla el texto "Negativo " + numero
    // Si es negativo
    public static void main(String[] args) {
        int[] numbers = {-3, 2, -1};

        // SOlucion for each
        // Para cada numero
        for (int number : numbers) {
            // Si el numero es negativo
            if (number < 0) {
                System.out.println("Es negativo " + number);
            }
        }

        // Solucion for
        // Definimos una variale que guarda el indice de cada posicion
        // del array
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number < 0) {
                System.out.println("Es negativo " + number);
            }
        }
        // Empiezo en el indice 0
        int i = 0;
        // Itero hasta que el indice sea igual al tamaño del array
        // O sea, hasta que haya mirado en todas las posiciones
        while (i < numbers.length) {
            // saco el valor en la posicion en la que estoy
            int number = numbers[i];
            if (number < 0) {
                System.out.println("Es negativo " + number);
            }
            // Aumento en uno el indice
            i++;
        }
    }

}
