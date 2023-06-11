import com.techelevator.Pony;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PonyTest {

    @Test
    public void getSound_should_return_sound(){
        //arrange
        Pony pony = new Pony("T1", "Test Pony", 1.00, "Pony");
        //act
        String actual = pony.getSound();
        String expected = "Neigh, Neigh, Yay!";
        //assert
        Assert.assertEquals("it should return 'Neigh, Neigh, Yay!'", expected, actual);
    }

    @Test
    public void dispense_should_subtract1_from_quantity(){
        //arrange
        Pony pony = new Pony("T1", "Test Pony" , 1.00, "Pony");
        int initialQuantity = pony.getQuantity();

        // Act
        pony.dispense();
        int remainingQuantity = pony.getQuantity();

        // Assert
        Assert.assertEquals("it should return initialQuantity -1",initialQuantity - 1, remainingQuantity);
    }

    @Test
    public void pony_test_constructor() {
        // Arrange
        String slotLocation = "T1";
        String animalName = "Test Pony";
        double price = 1.00;
        String animalType = "Pony";


        // Act
        Pony pony = new Pony(slotLocation, animalName, price, animalType);


        // Assert
        assertEquals(slotLocation, pony.getSlotID());
        assertEquals(animalName, pony.getName());
        assertEquals(price, pony.getPrice());
        assertEquals(animalType, pony.getAnimalType());
        assertEquals("Neigh, Neigh, Yay!", pony.getSound());
    }
}
