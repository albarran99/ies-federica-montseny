import org.iesfm.zoo.Animal;

import java.util.Scanner;

public class ZooMain {
    private static Scanner scan = new Scanner(System.in);

    private static Zoo pideZooInMemory(){
        System.out.println("I)ntroduce el nombre del Zoo");
        String nombre = scan.next();
        System.out.println("Introduce el tamaño del array");
        Animal[] animales = new Animal[scan.nextInt()];
    }
}
