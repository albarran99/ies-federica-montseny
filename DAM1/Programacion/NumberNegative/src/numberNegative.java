import java.util.Scanner;

public class numberNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        int counter = 0;
        while (number >= 0){
            System.out.println("Introduce otro numero ");
            number = scan.nextInt();
            counter ++;
        }
        System.out.println("Se han introducido " + counter);



    }

}
