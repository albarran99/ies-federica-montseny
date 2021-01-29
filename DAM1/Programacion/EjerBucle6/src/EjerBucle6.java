import java.util.Scanner;

public class EjerBucle6 {
// Esta solucionado por mi en clase de Programacion, con ayuda del profe.

    static void busca (int[] a, int[] b){
        for(int i = 0; i < a.length; i++){
            if (recorreArray(b, a[i])){
                System.out.println("Se encontro el " + a[i] + " En los dos array´s");
            }
        }
    }

    static  boolean recorreArray(int[] numbers , int number){
        boolean result = false;
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] == number){
                result = true;
            }
        }

        return result;
    }

    static  int[] devolverArray(){
        System.out.println("Introduce el tamaño del array..");
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[scan.nextInt()];
        System.out.println("Introduce numeros");
        for(int i = 0; i < numbers.length; ++i){
            numbers[i] = scan.nextInt();
        }

        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers1 = devolverArray();
        int[] numbers2 = devolverArray();
       busca(numbers1, numbers2);
    }
}


