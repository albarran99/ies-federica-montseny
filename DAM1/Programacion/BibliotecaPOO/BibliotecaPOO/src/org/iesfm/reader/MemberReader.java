package org.iesfm.reader;

import org.iesfm.Member;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MemberReader {
    private Scanner scan = new Scanner(System.in);

    public Member readerMember() {
        System.out.println("Introduce el nif de el socio");
        String nif = scan.nextLine();
        System.out.println("Introduce el nombre de el socio");
        String name = scan.nextLine();
        System.out.println("Introduce el apellido de el socio");
        String surname = scan.nextLine();
        System.out.println("Introduce el numero de socio");
        int numberMember = readPositiveNumber();
        System.out.println("Introduce el codigo postal del socio");
        int cp = readPositiveNumber();

        return new Member(nif, name, surname, numberMember, cp);
    }

    private int readPositiveNumber() {
        Integer positiveNumber = null;
        while (positiveNumber == null || positiveNumber < 0) {
            try {
                positiveNumber = scan.nextInt();
                scan.nextLine();
                if (positiveNumber < 0) {
                    System.out.println("No puede ser un numero negativo");
                }
            } catch (InputMismatchException e) {
                System.out.println("El positiveNumber es un numero");
                scan.nextLine();
            }
        }
        return positiveNumber;
    }


}



