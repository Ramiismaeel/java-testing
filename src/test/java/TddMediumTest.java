import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TddMediumTest {

    @Test
    void reverseString_shouldReturnReversedHello_byHello() {
        assertEquals("olleH",TddMedium.reverseString("Hello"));

    }
    @Test
    void reverseString_shouldReturnNull_byEmptyString() {
        assertNull(TddMedium.reverseString(""));

    }

    @Test
    void isPalindrome_shouldReturnTrue_byOtto() {
        assertTrue(TddMedium.isPalindrome("otto"));

    }
    @Test
    void isPalindrome_shouldReturnTrue_byOttoCapitalLetter() {
        assertTrue(TddMedium.isPalindrome("Otto"));

    }
    @Test
    void isPalindrome_shouldReturnFalse_byJava() {
        assertFalse(TddMedium.isPalindrome("Java"));

    }

    @Test
    void countVowels_shouldReturn2_byHello() {
        assertEquals(2, TddMedium.countVowels("Hello"));

    }

    @Test
    void countVowels_shouldReturn0_byBmw() {
        assertEquals(0, TddMedium.countVowels("Bmw"));

    }

}