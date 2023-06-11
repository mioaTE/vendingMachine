import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PenguinTest {

    @Test
    @DisplayName("Test Penguin dispense method")
    public void testPenguinDispense() {
        // Arrange
        Penguin penguin = new Penguin("B2", "Chilly", 2.25, "Antarctic");
        int initialQuantity = penguin.getQuantity();

        // Act
        penguin.dispense();
        int remainingQuantity = penguin.getQuantity();

        // Assert
        assertEquals(initialQuantity - 1, remainingQuantity);
    }

    @Test
    @DisplayName("Test Penguin getSound method")
    public void testPenguinGetSound() {
        // Arrange
        Penguin penguin = new Penguin("B2", "Chilly", 2.25, "Antarctic");
        String expectedSound = "Squawk, Squawk, Whee!";

        // Act
        String actualSound = penguin.getSound();

        // Assert
        assertEquals(expectedSound, actualSound);
    }

    @Test
    @DisplayName("Test Penguin constructor")
    public void testPenguinConstructor() {
        // Arrange
        String slotLocation = "B2";
        String animalName = "Chilly";
        double price = 2.25;
        String animalType = "Antarctic";
        String expectedSound = "Squawk, Squawk, Whee!";

        // Act
        Penguin penguin = new Penguin(slotLocation, animalName, price, animalType);
        String actualSound = penguin.getSound();

        // Assert
        assertEquals(slotLocation, penguin.getSlotLocation());
        assertEquals(animalName, penguin.getAnimalName());
        assertEquals(price, penguin.getPrice());
        assertEquals(animalType, penguin.getAnimalType());
        assertEquals(expectedSound, actualSound);
    }
}
