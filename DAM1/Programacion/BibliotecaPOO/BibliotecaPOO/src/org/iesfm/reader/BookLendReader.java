package org.iesfm.reader;

import org.iesfm.BookLend;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookLendReader {

    private Scanner scan = new Scanner(System.in);

    public BookLend readBookLend() {
        System.out.println("Introduce el ISBN");
        int isbn = readIsbn();
        System.out.println("Introduce la fecha del prestamo");
        String dateLend = scan.nextLine();
        System.out.println("Introduce el nif de el socio");
        String nifLend = scan.nextLine();
        System.out.println("Introduce la fecha de devolucion de el libro");
        String retrieveDateLend = scan.nextLine();

        return new BookLend(isbn, dateLend, nifLend, retrieveDateLend);
    }

    private int readIsbn() {
        Integer isbn = null;
        while (isbn == null) {
            try {
                isbn = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("El isbn es un numero");
                scan.nextLine();
            }
        }
        return isbn;
    }
}
