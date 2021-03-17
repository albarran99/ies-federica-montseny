package org.iesfm.library;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Book {
    private int ISBN;
    private String tittle;
    private String author;
    private HashSet<String> genres;

    public Book(int ISBN, String tittle, String author, HashSet<String> genres) {
        this.ISBN = ISBN;
        this.tittle = tittle;
        this.author = author;
        this.genres = genres;
    }

    public boolean hasGenre(String genre) {
       return genres.contains(genre);
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public HashSet<String> getGenres() {
        return genres;
    }

    public void setGenres(HashSet<String> genres) {
        this.genres = genres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return ISBN == book.ISBN && Objects.equals(tittle, book.tittle) && Objects.equals(author, book.author) && Objects.equals(genres, book.genres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN, tittle, author, genres);
    }
}
