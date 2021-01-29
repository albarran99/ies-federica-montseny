package org.iesfm.instituto;

import java.util.Objects;

public class Alumno {
    private String nombre;
    private String apellido;
    private String apellido2;
    private int codigopostal;

    public void infoAlumno() {
        System.out.println("Los alumnos son " + nombre + " " + apellido + " " + apellido2 + " Y tiene de codigo postal " + codigopostal);
    }

    public Alumno(String nombre, String apellido, String apellido2, int codigopostal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.apellido2 = apellido2;
        this.codigopostal = codigopostal;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(int codigopostal) {
        this.codigopostal = codigopostal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return codigopostal == alumno.codigopostal &&
                Objects.equals(nombre, alumno.nombre) &&
                Objects.equals(apellido, alumno.apellido) &&
                Objects.equals(apellido2, alumno.apellido2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, apellido2, codigopostal);
    }
}
