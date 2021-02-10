package Library.org.iesfm.library;

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

    public void showBooks() {
        System.out.println("Catalogo de la biblioteca:");
        for (Book book : books) {
            book.info();
        }
    }

    @Override
    public void showBooksByGenre(String genre) {
        System.out.println("Los libros disponibles de " + genre + " son: ");
        for (Book book : books) {
            if (book.hasGenre(genre)) {
                book.info();
            }
        }

    }


    @Override
    public void showMembers(int postCode) {
        System.out.println("Los socios de la biblioteaca rsidentes en " + postCode + " son:");
        for (Member member : members) {
            if (member.isFrom(postCode)) {
                member.info();
            }
        }

    }

    @Override
    public void showMemberLends(String nif) {

    }

    @Override
    public void showMemberLends(int numberMember) {

    }

    @Override
    public boolean memberHasLend(int numberMember, int isbn) {
        return false;
    }

    public void showMembers() {
        System.out.println("Los socios de la biblioteca son: ");
        for (Member member : members) {
            member.info();
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
        Library library = (Library) o;
        return Objects.equals(name, library.name) && Arrays.equals(books, library.books) && Arrays.equals(members, library.members) && Arrays.equals(bookLends, library.bookLends);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(books);
        result = 31 * result + Arrays.hashCode(members);
        result = 31 * result + Arrays.hashCode(bookLends);
        return result;
    }
}
