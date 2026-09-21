import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainEasyTest {

    @Test
    void add() {
        int a =2;
        int b = 5;
        int expected = 7;

        int actual = MainEasy.add(a,b);

        assertEquals(expected, actual);
    }

    @Test
    void isEven_shouldReturnTrue_by2() {
        assertTrue(MainEasy.isEven(2));
    }

    @Test
    void returnCapital_of_text () {
        assertEquals( "TEXT", MainEasy.turnCapital("text"));
    }

    @Test
    void isPositive_shouldReturnTrue_by3() {
        assertTrue(MainEasy.isPositive(3));
    }
    @Test
    void isPositive_shouldReturnFalse_byNegative5() {
        assertFalse(MainEasy.isPositive(-5));
    }

    @Test
    void multiply_shouldReturn10_byMultiply5And2() {
        assertEquals(10, MainEasy.multiply(5,2));
    }
    @Test
    void multiply_shouldReturn15_byMultiply5And3() {
        assertEquals(15, MainEasy.multiply(5,3));
    }




}