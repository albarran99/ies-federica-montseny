package org.iesfm;

import java.util.Arrays;
import java.util.Objects;

public class Biblioteca {
    private String nombre;
    private Libro[] libro;

    public Biblioteca(String nombre, Libro[] libro) {
        this.nombre = nombre;
        this.libro = libro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Libro[] getLibro() {
        return libro;
    }

    public void setLibro(Libro[] libro) {
        this.libro = libro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Biblioteca that = (Biblioteca) o;
        return Objects.equals(nombre, that.nombre) &&
                Arrays.equals(libro, that.libro);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nombre);
        result = 31 * result + Arrays.hashCode(libro);
        return result;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", libro=" + Arrays.toString(libro) +
                '}';
    }
}
