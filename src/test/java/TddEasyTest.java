import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TddEasyTest {
    //1
    @Test
    void sum_shouldReturn7_when3And4() {
        assertEquals(7, TddEasy.sum(3,4));
    }

    //2
    @Test
    void isEven_shouldReturnTrue_by4() {
        assertTrue(TddEasy.isEven(4));
    }
    @Test
    void isEven_shouldReturnFalse_by3() {
        assertFalse(TddEasy.isEven(3));
    }

    //3
    @Test
    void getFirstChar_shouldReturnH_byHello() {
        assertEquals('h',TddEasy.getFirstChar("hello"));
    }

    @Test
    void getFirstChar_shouldReturnNull_byEmptyText() {
        assertNull(TddEasy.getFirstChar(""));
    }

}