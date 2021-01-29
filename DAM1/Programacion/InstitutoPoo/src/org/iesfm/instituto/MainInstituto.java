package org.iesfm.instituto;

import java.util.Scanner;

public class MainInstituto {

    static Scanner scan = new Scanner(System.in);

    static Alumno pideAlumno(){
        System.out.println("Introduce el nombre del alumno");
        String nombre = scan.next();
        System.out.println("Introduce el apellido del alumno");
        String apellido = scan.next();
        System.out.println("Introduce segundo apellido del alumno");
        String apellido2 = scan.next();
        System.out.println("Introduce el codigo postal del alumno");
        int codigoPostal = scan.nextInt();

        return new Alumno(nombre, apellido, apellido2, codigoPostal);
    }

    public static void main(String[] args) {

    }
}
