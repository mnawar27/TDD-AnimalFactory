package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    public void testSetName() {
        String initialName = "Whiskers";
        String newName = "Fluffy";
        Cat cat = new Cat(initialName, new Date(2000, 1, 1), 1);

        cat.setName(newName);

        Assert.assertEquals(newName, cat.getName());
    }

    // TODO - Create tests for `speak`
    @Test
    public void testSpeak() {
        Cat cat = new Cat("Whiskers", new Date(2000, 1, 1), 1);

        String result = cat.speak();

        Assert.assertEquals("meow!", result);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate() {
        Date initialBirthDate = new Date(2000, 1, 1);
        Date newBirthDate = new Date(2010, 5, 10);
        Cat cat = new Cat("Whiskers", initialBirthDate, 1);

        cat.setBirthDate(newBirthDate);  // Set a new birthDate using the setBirthDate method

        // Assert
        Assert.assertEquals(newBirthDate, cat.getBirthDate());
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat() {
        Cat cat = new Cat("Whiskers", new Date(2000, 1, 1), 1);
        Food food = new Food();

        Integer initialMeals = cat.getNumberOfMealsEaten();
        cat.eat(food);

        Assert.assertEquals(Integer.valueOf(initialMeals + 1), Integer.valueOf(cat.getNumberOfMealsEaten()));

    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId() {
        Cat cat = new Cat("Whiskers", new Date(2000, 1, 1), 1);
        Assert.assertEquals(Integer.valueOf(1), cat.getId());
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testCatIsInstanceOfAnimal() {
        Cat cat = new Cat("Whiskers", new Date(2000, 1, 1), 1);
        Assert.assertTrue(cat instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testCatIsInstanceOfMammal() {
        Cat cat = new Cat("Whiskers", new Date(2000, 1, 1), 1);
        Assert.assertTrue(cat instanceof Mammal);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
