package org.iesfm.library;

import java.util.*;

public class Library implements ILibrary {
    private String name;
    private HashSet<Book> books;
    private LinkedList<Member> members;
    private TreeSet<BookLend> bookLends;

    public Library(String name, HashSet<Book> books, LinkedList<Member> members, TreeSet<BookLend> bookLends) {
        this.name = name;
        this.books = books;
        this.members = members;
        this.bookLends = bookLends;
    }

    @Override
    public Set<Book> findBooks(String genre) {
        HashSet<Book> genreBooks = new HashSet<>();
        for (Book book : books) {
            if (book.hasGenre(genre)) {
                genreBooks.add(book);
            }
        }
        return genreBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<Book> getBooks() {
        return books;
    }

    public void setBooks(HashSet<Book> books) {
        this.books = books;
    }

    public LinkedList<Member> getMembers() {
        return members;
    }

    public void setMembers(LinkedList<Member> members) {
        this.members = members;
    }

    public TreeSet<BookLend> getBookLends() {
        return bookLends;
    }

    public void setBookLends(TreeSet<BookLend> bookLends) {
        this.bookLends = bookLends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Library)) return false;
        Library library = (Library) o;
        return Objects.equals(name, library.name) && Objects.equals(books, library.books) && Objects.equals(members, library.members) && Objects.equals(bookLends, library.bookLends);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, books, members, bookLends);
    }
}
