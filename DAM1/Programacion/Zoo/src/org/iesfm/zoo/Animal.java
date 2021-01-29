package org.iesfm.zoo;

import java.util.Objects;

public class Animal {
    private String especie;
    private int edad;
    private String jaula;
    private String Alimentacion;

    public Animal(String especie, int edad, String jaula, String alimentacion) {
        this.especie = especie;
        this.edad = edad;
        this.jaula = jaula;
        Alimentacion = alimentacion;
    }

    public void infoAnimal() {
        System.out.println("Este animal es un " + especie + " con una edad de " + edad + " esta en la jaula " + jaula + " y se alimenta de " + Alimentacion);
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setJaula(String jaula) {
        this.jaula = jaula;
    }

    public void setAlimentacion(String alimentacion) {
        Alimentacion = alimentacion;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public String getJaula() {
        return jaula;
    }

    public String getAlimentacion() {
        return Alimentacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return edad == animal.edad &&
                Objects.equals(especie, animal.especie) &&
                Objects.equals(jaula, animal.jaula) &&
                Objects.equals(Alimentacion, animal.Alimentacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(especie, edad, jaula, Alimentacion);
    }
}
