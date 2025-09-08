package samsungtdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

//import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_result_Fizz_Buzz_at_3() {
        int number = 3;
        //Arrange
        List<String> expected = List.of(new String[]{"1","2","Fizz"});

        //Act
        List<String> actual = FizzBuzz.solve(number);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void should_result_Fizz_Buzz_at_5() {
        int number = 5;
        //Arrange
        List<String> expected = List.of(new String[]{"1","2","Fizz","4","Buzz"});

        //Act
        List<String> actual = FizzBuzz.solve(number);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void should_result_Fizz_Buzz_at_15() {
        int number = 15;
        //Arrange
        List<String> expected = List.of(new String[]{"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"});

        //Act
        List<String> actual = FizzBuzz.solve(number);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void should_result_Fizz_Buzz_negative_input() {
        //Arrange
        int number = 0;

        //Act
        Exception ex = assertThrows(IllegalArgumentException.class, () -> FizzBuzz.solve(number));

        //Assert
        assertEquals("Number must larger or equals to 1", ex.getMessage());
    }

    @Test
    public void should_result_not_has_Buzz_at_index_15() {
        //Arrange
        int number = 15;
        String unexpected = "Buzz";

        //Act
        List<String> actual = FizzBuzz.solve(number);

        //Assert
        assertNotEquals(unexpected, actual.get(14), "15 should be FizzBuzz, not Buzz");
    }

}
