import java.util.Scanner;

public class Bucles7_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
//            for(int j = 1; j <= n; j++) {
//                if(j <= spaces) {
//                    System.out.print(" ");
//                } else {
//                    System.out.print(j - spaces);
//                }
//            }
            System.out.println();
        }
    }
}
