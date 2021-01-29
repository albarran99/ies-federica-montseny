import java.util.Scanner;

public class MainVhehiculos {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       Vehiculo[] vehiculos = pideVehiculos();
       for (int i = 0; i < vehiculos.length; i++){
            Vehiculo vehiculo = vehiculos[i];
           System.out.println("Las matriculas son " + vehiculo.getMatricula());
       }

    }

    static Vehiculo[] pideVehiculos(){
        System.out.println("Introduce el tamaño de la lista");
        Vehiculo[] listaVehiculos = new Vehiculo[scanner.nextInt()];
        for(int i = 0; i < listaVehiculos.length; i++){
            listaVehiculos[i] = pideVehiculo();
        }

        return listaVehiculos;
    }

    static Vehiculo pideVehiculo() {
        System.out.println("Introduce un tipo de vehiculo");
        String tipo = scanner.next();
        System.out.println("Introduce una velocidad");
        double velociada = scanner.nextDouble();
        System.out.println("Intrduce un color");
        String color = scanner.next();
        System.out.println("Introduce una matricula");
        String matricula = scanner.next();

        Vehiculo vehiculo = new Vehiculo(tipo, velociada, color, matricula);
        return vehiculo;
    }
}
