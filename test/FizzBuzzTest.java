import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void testFizzBuzz(){
        String expected = "Fizz";
        String result = FizzBuzz.display(6);
        assertEquals(expected, result);
    }
    @Test
    void testFizzBuzz1(){
        String expected = "Buzz";
        String result = FizzBuzz.display(10);
        assertEquals(expected, result);
    }
    @Test
    void testFizzBuzz2(){
        String expected = "FizzBuzz";
        String result = FizzBuzz.display(15);
        assertEquals(expected, result);
    }
    @Test
    void testFizzBuzz3(){
        String expected = "1";
        String result = FizzBuzz.display(1);
        assertEquals(expected, result);
    }
    @Test
    void testFizzBuzz4(){
        String expected = "error";
        String result = FizzBuzz.display(-1);
        assertEquals(expected, result);
    }

}