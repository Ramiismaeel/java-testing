import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainMediumTest {

    @Test
    void firstLetter_shouldReturnNull_byEmptyText() {
        assertNull(MainMedium.getFirstLetter(""));
    }

    @Test
    void firstLetter_shouldReturnNotNull_byTextTest() {
        assertNotNull(MainMedium.getFirstLetter("test"));
    }

    @Test
    void divide_shouldReturnErrorIllegalArgumentException_byDivideBy0() {
        assertThrows(IllegalArgumentException.class,() -> MainMedium.divide(5,0));
    }

    @Test
    void divide_shouldReturn2_byDivide4by2() {
        assertEquals(2, MainMedium.divide(4,2));
    }
}