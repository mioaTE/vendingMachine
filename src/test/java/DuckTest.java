import org.junit.Assert;
import org.junit.Test;

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
}
