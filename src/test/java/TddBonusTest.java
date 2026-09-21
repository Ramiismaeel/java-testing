import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TddBonusTest {

    @Test
    void factorial_shouldReturn150_by5() {
        assertEquals(120, TddBonus.factorial(5));
    }
    @Test
    void factorial_shouldReturn1_by0() {
        assertEquals(1, TddBonus.factorial(0));
    }

    @Test
    void fibonacci_shouldReturn8_by6() {
        assertEquals(8, TddBonus.fibonacci(6));
    }
    @Test
    void fibonacci_shouldReturn55_by10() {
        assertEquals(55, TddBonus.fibonacci(10));
    }

    @Test
    void fibonacci2_shouldReturn8_by6() {
        assertEquals(8, TddBonus.fibonacci2(6));
    }
    @Test
    void fibonacci2_shouldReturn55_by10() {
        assertEquals(55, TddBonus.fibonacci2(10));
    }

    @Test
    void mergeArray_shouldReturnAllValues_ofBoth() {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] expected = {1,2,3,4,5,6};
        assertArrayEquals(expected, TddBonus.mergeArray(arr1, arr2));
    }
}