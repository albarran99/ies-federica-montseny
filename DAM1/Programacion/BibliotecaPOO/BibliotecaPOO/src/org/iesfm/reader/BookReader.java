package org.iesfm.reader;

import org.iesfm.Book;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookReader {

    private Scanner scan = new Scanner(System.in);

    public Book readBook() {
        System.out.println("Introduce los datos de el libro");
        System.out.println("Introduce el ISBN");
        int isbn = readIsbn();
        System.out.println("Introduce el titulo");
        String title = scan.nextLine();
        System.out.println("Introduce un autor");
        String author = scan.nextLine();
        System.out.println("Introduce el genero");
        String[] genre = readGenres();

        return new Book(isbn, title, author, genre);

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

    private String[] readGenres() {
        System.out.println("Introduce el numero de generos");
        int numGenres = readNumGenres();
        String[] genres = new String[numGenres];
        for (int i = 0; i < genres.length; i++) {
            genres[i] = scan.nextLine();
        }
        return genres;

    }

    private int readNumGenres() {
        Integer numgenres = null;
        while (numgenres == null || numgenres < 0) {
            System.out.println("El numero de generos tiene que ser mayor que 0");
            try {
                numgenres = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error, la cantidad de generos es un numero");
                scan.nextLine();
            }
        }
        return numgenres;
    }
}
