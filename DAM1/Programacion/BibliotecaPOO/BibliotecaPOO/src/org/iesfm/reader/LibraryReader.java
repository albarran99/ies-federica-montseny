package org.iesfm.reader;

import org.iesfm.Book;
import org.iesfm.BookLend;
import org.iesfm.Library;
import org.iesfm.Member;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryReader {
    private Scanner scan = new Scanner(System.in);

    private BookReader bookReader = new BookReader();

    private MemberReader memberReader = new MemberReader();

    private BookLendReader bookLendReader = new BookLendReader();

    public Library readLibrary() {
        System.out.println("Introduce el nombre de la libreria");
        String name = scan.nextLine();
        Book[] books = readBooks();
        Member[] members = readMembers();
        BookLend[] bookLends = readBookLends();

        return new Library(name, books,members, bookLends);

    }

    private Book[] readBooks() {
        System.out.println("Introduce el numero de libros");
        int number = readPositiveNumber();
        Book[] books = new Book[number];
        for (int i = 0; i < books.length; i++) {
            books[i] = bookReader.readBook();
        }

        return books;
    }

    private Member[] readMembers() {
        System.out.println("Introduce el numero de socios");
        int number = readPositiveNumber();
        Member[] members = new Member[number];
        for (int i = 0; i < members.length; i++) {
            members[i] = memberReader.readerMember();
        }

        return members;
    }

    private BookLend[] readBookLends(){
        System.out.println("Introduce el numero de prestamos");
        int number = readPositiveNumber();
        BookLend[] booksLends = new BookLend[number];
        for (int i = 0; i < booksLends.length; i++) {
            booksLends[i] = bookLendReader.readBookLend();
        }

        return booksLends;

    }

    private int readPositiveNumber() {
        Integer number = null;
        while (number == null || number < 0) {
            try {
                number = scan.nextInt();
                scan.nextLine();
                if (number < 0) {
                    System.out.println("no puede ser negativo");
                }
            } catch (InputMismatchException e) {
                System.out.println("Tiene que ser un numero");
            }
        }
        return number;
    }

}
