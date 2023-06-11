import com.techelevator.VendingMachine;
import org.junit.jupiter.api.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    private ByteArrayOutputStream outputStream;
    private PrintStream originalSystemOut;

    @BeforeEach
    public void setUp() {
        outputStream = new ByteArrayOutputStream();
        originalSystemOut = System.out;
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalSystemOut);
    }

    @Test
    @DisplayName("Test vending machine main method")
    public void testVendingMachineMainMethod() {
        // Arrange
        String[] inputLines = {
                "1",          // Choose menu option 1 (Display Vending Machine Items)
                "1",          // Exit the display menu
                "2",          // Choose menu option 2 (Purchase)
                "3",          // Finish the transaction
                "3"           // Choose menu option 3 (Exit)
        };

        String expectedOutput = "**********WELCOME********\n" +
                "************TO***********\n" +
                "***********THE***********\n" +
                "*******VENDO-MATIC*******\n" +
                "\n" +
                "Main Menu:\n" +
                "(1) Display Vending Machine Items\n" +
                "(2) Purchase\n" +
                "(3) Exit\n" +
                "\n" +
                "Please enter your choice: \n" +
                "1\n" +
                "Item 1: $1.00\n" +
                "Item 2: $2.00\n" +
                "Item 3: $3.00\n" +
                "\n" +
                "Enter (1) to exit: \n" +
                "1\n" +
                "\n" +
                "**********WELCOME********\n" +
                "************TO***********\n" +
                "***********THE***********\n" +
                "*******VENDO-MATIC*******\n" +
                "\n" +
                "Main Menu:\n" +
                "(1) Display Vending Machine Items\n" +
                "(2) Purchase\n" +
                "(3) Exit\n" +
                "\n" +
                "Please enter your choice: \n" +
                "2\n" +
                "*************************\n" +
                "* Current Balance: $0.00 *\n" +
                "*************************\n" +
                "\n" +
                "(1) Feed Money\n" +
                "(2) Select Product\n" +
                "(3) Finish Transaction\n" +
                "\n" +
                "Please enter your choice: \n" +
                "3\n" +
                "Change received: $0.00\n" +
                "\n" +
                "Thank you for using Vendo-Matic 800. Have a great day!\n";

        InputProvider inputProvider = new TestInputProvider(inputLines);
        VendingMachine vendingMachine = new VendingMachine(inputProvider);

        // Act
        vendingMachine.main(new String[0]);

        // Assert
        String actualOutput = outputStream.toString();
        assertEquals(expectedOutput, actualOutput);
    }

    private static class TestInputProvider implements InputProvider {
        private final String[] inputLines;
        private int currentIndex;

        public TestInputProvider(String[] inputLines) {
            this.inputLines = inputLines;
            this.currentIndex = 0;
        }

        @Override
        public String provideInput() {
            if (currentIndex >= inputLines.length) {
                throw new IllegalStateException("Not enough input provided.");
            }
            String input = inputLines[currentIndex];
            currentIndex++;
            return input;
        }
    }
}
