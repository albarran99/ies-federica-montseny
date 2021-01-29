package org.iesfm;

import java.util.Objects;

public class Prestamo {
    private String isbn;
    private String fechaPrestamo;
    private String nifSocio;
    private String fechaDeDevolucion;

    public Prestamo(String isbn, String fechaPrestamo, String nifSocio, String fechaDeDevolucion) {
        this.isbn = isbn;
        this.fechaPrestamo = fechaPrestamo;
        this.nifSocio = nifSocio;
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getNifSocio() {
        return nifSocio;
    }

    public void setNifSocio(String nifSocio) {
        this.nifSocio = nifSocio;
    }

    public String getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public void setFechaDeDevolucion(String fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prestamo prestamo = (Prestamo) o;
        return Objects.equals(isbn, prestamo.isbn) &&
                Objects.equals(fechaPrestamo, prestamo.fechaPrestamo) &&
                Objects.equals(nifSocio, prestamo.nifSocio) &&
                Objects.equals(fechaDeDevolucion, prestamo.fechaDeDevolucion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, fechaPrestamo, nifSocio, fechaDeDevolucion);
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "isbn='" + isbn + '\'' +
                ", fechaPrestamo='" + fechaPrestamo + '\'' +
                ", nifSocio='" + nifSocio + '\'' +
                ", fechaDeDevolucion='" + fechaDeDevolucion + '\'' +
                '}';
    }
}
