import com.techelevator.Cat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {

    @Test
    @DisplayName("Test Cat dispense method")
    public void testCatDispense() {
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
    public void testCatGetSound() {
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
    public void testCatConstructor() {
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
        assertEquals(slotLocation, cat.getSlotLocation());
        assertEquals(animalName, cat.getAnimalName());
        assertEquals(price, cat.getPrice());
        assertEquals(animalType, cat.getAnimalType());
        assertEquals(expectedSound, actualSound);
    }
}
