package org.iesfm;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private int isbn;
    private String title;
    private String author;
    private String[] genres;

    public Book(int isbn, String title, String author, String[] genres) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genres = genres;
    }

    public void info() {
        System.out.println("Los libros son " + title + " con autor" + author + " con ISBN" + isbn);
    }

    public boolean getGenreByGenre(String genero) {
        boolean resultado = false;
        for (int i = 0; i < genres.length; i++) {
            if (genres[i].equalsIgnoreCase(genero)) {
                resultado = true;
            }
        }

        return resultado;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book libro = (Book) o;
        return isbn == libro.isbn &&
                Objects.equals(title, libro.title) &&
                Objects.equals(author, libro.author) &&
                Arrays.equals(genres, libro.genres);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(isbn, title, author);
        result = 31 * result + Arrays.hashCode(genres);
        return result;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn=" + isbn +
                ", titulo='" + title + '\'' +
                ", autor='" + author + '\'' +
                ", genero=" + Arrays.toString(genres) +
                '}';
    }
}
