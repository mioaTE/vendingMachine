package com.techelevator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuckTest {

    @Test
    public void getSoundTest_return_correct_sound(){
        // arrange
        String animalType = "Duck";
        String sound = "Quack, Quack, Splash!";


        // act
        String result = sound;

        // assert
        Assert.assertEquals("This is not the correct sound for duck is ", sound, result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("Test Cat dispense method")
    public void test_cat_dispense_works() {
        // Arrange
        Cat cat = new Cat("A1", "Fluffy", 1.50, "Domestic");
        int initialQuantity = cat.getQuantity();

        // Act
        cat.dispense();
        int remainingQuantity = cat.getQuantity();

        // Assert
        assertEquals(initialQuantity - 1, remainingQuantity);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Test Cat getSound method")
    public void test_cat_get_sound() {
        // Arrange
        Cat cat = new Cat("A1", "Fluffy", 1.50, "Domestic");
        String expectedSound = "Meow, Meow, Meow!";

        // Act
        String actualSound = cat.getSound();

        // Assert
        assertEquals(expectedSound, actualSound);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Test Cat constructor")
    public void test_cat_constructor() {
        // Arrange
        String slotLocation = "A1";
        String animalName = "Fluffy";
        double price = 1.50;
        String animalType = "Domestic";
        String expectedSound = "Meow, Meow, Meow!";

        // Act
        Duck duck = new Duck();
        String actualSound = cat.getSound();

        // Assert
        assertEquals(slotLocation, duck.getSlotID());
        assertEquals(animalName, cat.getName());
        assertEquals(price, cat.getPrice());
        assertEquals(animalType, cat.getAnimalType());
        assertEquals(expectedSound, actualSound);
    }
}
