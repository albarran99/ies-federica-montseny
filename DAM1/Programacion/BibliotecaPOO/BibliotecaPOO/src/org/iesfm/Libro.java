package org.iesfm;

import java.util.Arrays;
import java.util.Objects;

public class Libro {
    private int isbn;
    private String titulo;
    private String autor;
    private String[] generos;

    public Libro(int isbn, String titulo, String autor, String[] genero) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.generos = genero;
    }

    public void infoLibro() {
        System.out.println("Los libros son " + titulo + " con autor" + autor + " con ISBN" + isbn);
    }

    public boolean esDelGenero(String genero) {
        boolean resultado = false;
        for (int i = 0; i < generos.length; i++) {
            if (generos[i].equalsIgnoreCase(genero)) {
                resultado = true;
            }
        }

        return  resultado;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
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

    public String[] getGeneros() {
        return generos;
    }

    public void setGeneros(String[] generos) {
        this.generos = generos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return isbn == libro.isbn &&
                Objects.equals(titulo, libro.titulo) &&
                Objects.equals(autor, libro.autor) &&
                Arrays.equals(generos, libro.generos);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(isbn, titulo, autor);
        result = 31 * result + Arrays.hashCode(generos);
        return result;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn=" + isbn +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero=" + Arrays.toString(generos) +
                '}';
    }
}
