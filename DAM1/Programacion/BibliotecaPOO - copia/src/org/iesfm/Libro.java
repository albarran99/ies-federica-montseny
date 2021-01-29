package org.iesfm;

import java.util.Arrays;
import java.util.Objects;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private String[] genero;

    public Libro(String isbn, String titulo, String autor, String[] genero) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String[] getGenero() {
        return genero;
    }

    public void setGenero(String[] genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(isbn, libro.isbn) &&
                Objects.equals(titulo, libro.titulo) &&
                Objects.equals(autor, libro.autor) &&
                Arrays.equals(genero, libro.genero);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(isbn, titulo, autor);
        result = 31 * result + Arrays.hashCode(genero);
        return result;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero=" + Arrays.toString(genero) +
                '}';
    }
}
