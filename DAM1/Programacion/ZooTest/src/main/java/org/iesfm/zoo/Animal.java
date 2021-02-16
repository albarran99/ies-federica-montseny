package org.iesfm.zoo;

import java.util.Objects;

public class Animal {
    private String kind;
    private String diet;
    private int cage;

    public Animal(String kind, String diet, int cage) {
        this.kind = kind;
        this.diet = diet;
        this.cage = cage;
    }

    public void info(){
        System.out.println(" El animal es de la especie: " + kind);
        System.out.println(" El animal tiene la alimentacion: " + diet);
        System.out.println(" El animal esta en la jaula: " + cage);
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public int getCage() {
        return cage;
    }

    public void setCage(int cage) {
        this.cage = cage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return cage == animal.cage &&
                kind.equals(animal.kind) &&
                diet.equals(animal.diet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, diet, cage);
    }
}
