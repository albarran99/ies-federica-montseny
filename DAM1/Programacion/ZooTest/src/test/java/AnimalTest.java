import org.iesfm.zoo.Animal;

import org.iesfm.zoo.Zoo;


import org.junit.Assert;
import org.junit.Test;


public class AnimalTest {

    @Test
    public void showAnimalsByCage() {
        Animal[] animals = new Animal[3];

        animals[0] = new Animal("Tigre", "Carnivoro", 119);
        animals[1] = new Animal("Elefante", "Herbivoro", 120);
        animals[2] = new Animal("Oso", "Omnivoro", 122);

        Zoo zoo = new Zoo("Madrid", animals);

        int res = zoo.showAnimalsByCage(119);
        Assert.assertEquals(1, res);
    }

    @Test
    public void showAnimalsByDiet() {
        Animal[] animals = new Animal[3];

        animals[0] = new Animal("Tigre", "Carnivoro", 119);
        animals[1] = new Animal("Elefante", "Herbivoro", 120);
        animals[2] = new Animal("Oso", "Omnivoro", 122);

        Zoo zoo = new Zoo("Madrid", animals);

        int res = zoo.showAnimalsByCage(119);
        Assert.assertEquals(1, res);
    }
}

