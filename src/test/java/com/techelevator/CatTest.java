package com.techelevator;

import com.techelevator.Cat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {

    @Test
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

    @Test
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

    @Test
    @DisplayName("Test Cat constructor")
    public void test_cat_constructor() {
        // Arrange
        String slotLocation = "A1";
        String animalName = "Fluffy";
        double price = 1.50;
        String animalType = "Domestic";
        String expectedSound = "Meow, Meow, Meow!";

        // Act
        Cat cat = new Cat(slotLocation, animalName, price, animalType);
        String actualSound = cat.getSound();

        // Assert
        assertEquals(slotLocation, cat.getSlotID());
        assertEquals(animalName, cat.getName());
        assertEquals(price, cat.getPrice());
        assertEquals(animalType, cat.getAnimalType());
        assertEquals(expectedSound, actualSound);
    }
}
