import org.iesfm.zoo.Animal;

import org.iesfm.zoo.Zoo;


import org.junit.Assert;
import org.junit.Test;


public class AnimalTest {

    @Test
    public void showAnimalsByCage() {
        Animal[] animals = new Animal[3];

        Animal animal1 = new Animal("Tigre", "Carnivoro", 119);
        Animal animal2 = new Animal("Elefante", "Herbivoro", 120);
        Animal animal3 = new Animal("Oso", "Omnivoro", 122);

        Zoo zoo = new Zoo("Madrid", animals);

        int res = zoo.showAnimalsByCage(119);
        Assert.assertEquals(1, res);
    }
}

