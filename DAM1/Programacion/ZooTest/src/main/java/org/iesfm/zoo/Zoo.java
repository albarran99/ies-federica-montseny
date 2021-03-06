package org.iesfm.zoo;

import java.util.Arrays;
import java.util.Objects;

public class Zoo implements IZoo {
    private String Zoo;
    private Animal[] animals;

    public int showAnimalsByCage(int cage) {
        int count = 0;
        for (Animal animal : animals) {
            if (animal.getCage() == (cage)) {
                count++;

            }
        }
        return count;
    }

    public int showAnimalsByDiet(String diet) {
        int count = 0;
        for (Animal animal : animals) {
            if (animal.getDiet().equals(diet)) {
                count++;

            }
        }
        return count;
    }

    @Override
    public int showAnimalsByKindAndCage(String kind, int hail) {
        return 0;
    }

    public Zoo(String zoo, Animal[] animals) {
        Zoo = zoo;
        this.animals = animals;
    }

    public String getZoo() {
        return Zoo;
    }

    public void setZoo(String zoo) {
        Zoo = zoo;
    }

    public Animal[] getAmnimals() {
        return animals;
    }

    public void setAmnimals(Animal[] animals) {
        this.animals = animals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Zoo)) return false;
        Zoo zoo = (Zoo) o;
        return Zoo.equals(zoo.Zoo) &&
                Arrays.equals(animals, zoo.animals);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(Zoo);
        result = 31 * result + Arrays.hashCode(animals);
        return result;
    }
}
