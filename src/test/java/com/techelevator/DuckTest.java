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
    @Test
    public void test_duck_dispense_works() {
        // Arrange
        Duck duck = new Duck("A1", "Daphie", 1.50, "Duck");
        int initialQuantity = duck.getQuantity();

        // Act
        duck.dispense();
        int remainingQuantity = duck.getQuantity();

        // Assert
        assertEquals(initialQuantity - 1, remainingQuantity);
    }

    @Test
    public void test_duck_get_sound() {
        // Arrange
        Duck duck = new Duck("A1", "Daphie", 1.50, "Duck");
        String expectedSound = "Quack, Quack, Splash!";

        // Act
        String actualSound = duck.getSound();

        // Assert
        assertEquals(expectedSound, actualSound);
    }

    @Test
    public void test_duck_constructor() {
        // Arrange
        String slotLocation = "A1";
        String animalName = "Daphie";
        double price = 1.50;
        String animalType = "Duck";
        String expectedSound = "Quack, Quack, Splash!";

        // Act
        Duck duck = new Duck(slotLocation, animalName, price, animalType);
        String actualSound = duck.getSound();

        // Assert
        assertEquals(slotLocation, duck.getSlotID());
        assertEquals(animalName, duck.getName());
        assertEquals(price, duck.getPrice());
        assertEquals(animalType, duck.getAnimalType());
        assertEquals(expectedSound, actualSound);
    }

}
