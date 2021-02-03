package org.iesfm;

import java.util.Arrays;
import java.util.Objects;

public class Library implements ILibrary {
    private String name;
    private Book[] books;
    private Member[] members;
    private BookLend[] bookLends;

    public Library(String name, Book[] books, Member[] members, BookLend[] bookLends) {
        this.name = name;
        this.books = books;
        this.members = members;
        this.bookLends = bookLends;
    }


    @Override
    public void imprimeLibro() {
        for (int i = 0; i < books.length; i++) {
            Book libro = books[i];
            libro.infoLibro();
        }
    }

    @Override
    public void imprimeLibroPorGenero(String genero) {
        for (int i = 0; i < books.length; i++) {
            Book libro = books[i];
            if (libro.esDelGenero(genero)) {
                libro.infoLibro();
            }
        }
    }

    @Override
    public void imprimeSociosConCodigoPostal(int codigoPostal) {
        for (int i = 0; i < members.length; i++) {
            Member socio = members[i];
            if(socio.getCp() == codigoPostal) {
                socio.info();
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Member[] getMembers() {
        return members;
    }

    public void setMembers(Member[] members) {
        this.members = members;
    }

    public BookLend[] getBookLends() {
        return bookLends;
    }

    public void setBookLends(BookLend[] bookLends) {
        this.bookLends = bookLends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library that = (Library) o;
        return Objects.equals(name, that.name) &&
                Arrays.equals(books, that.books) &&
                Arrays.equals(members, that.members) &&
                Arrays.equals(bookLends, that.bookLends);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(books);
        result = 31 * result + Arrays.hashCode(members);
        result = 31 * result + Arrays.hashCode(bookLends);
        return result;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + name + '\'' +
                ", libros=" + Arrays.toString(books) +
                ", socios=" + Arrays.toString(members) +
                ", prestamos=" + Arrays.toString(bookLends) +
                '}';
    }

}
