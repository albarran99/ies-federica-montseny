public class ejerPrograma {
    static boolean devuelveVerdad(int[] Numeros, int numero){
        boolean Encounter = false;
        for(int number: Numeros){
            if(number == numero ){
                Encounter = true;
                break;

            }
        }
        return Encounter;
    }

//    public static void main(String[] args) {
//         int[] Numeros = {2, 3, 4, 5};
//         int numerio = 3;
//         System.out.println(devuelveVerdad(Numeros[numerio]));
    }
//}
