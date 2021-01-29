package org.iesfm;

import java.util.Objects;

public class Socio {
    private String nif;
    private String nombre;
    private String apellido;
    private int numeroDeSocio;
    private int codigoPostal;

    public Socio(String nif, String nombre, String apellido, int numeroDeSocio, int codigoPostal) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeSocio = numeroDeSocio;
        this.codigoPostal = codigoPostal;
    }
    public void infoSocio(){
        System.out.println("El socio tiene nombre " + nombre + " con apellido" + apellido + " con numero de socio" + numeroDeSocio + " con un nif" + nif + " y codigo postal" + codigoPostal);
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
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

    public int getNumeroDeSocio() {
        return numeroDeSocio;
    }

    public void setNumeroDeSocio(int numeroDeSocio) {
        this.numeroDeSocio = numeroDeSocio;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Socio socio = (Socio) o;
        return numeroDeSocio == socio.numeroDeSocio &&
                codigoPostal == socio.codigoPostal &&
                Objects.equals(nif, socio.nif) &&
                Objects.equals(nombre, socio.nombre) &&
                Objects.equals(apellido, socio.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, nombre, apellido, numeroDeSocio, codigoPostal);
    }

    @Override
    public String toString() {
        return "Socio{" +
                "nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroDeSocio=" + numeroDeSocio +
                ", codigoPostal=" + codigoPostal +
                '}';
    }
}
