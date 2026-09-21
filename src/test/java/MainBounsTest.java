import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MainBounsTest {
    @Test
    void isPrime_shouldReturnTrue_by7() {
        assertTrue(MainBouns.isPrime(7));
    }
    @Test
    void isPrime_shouldReturnFalse_by4() {
        assertFalse(MainBouns.isPrime(4));
    }
    @Test
    void isPrime_shouldReturnTrue_by23() {
        assertTrue(MainBouns.isPrime(24));
    }

    @ParameterizedTest
    @CsvSource({
            "3, true",
            "6, false"

    })
    void isPrime(int input, boolean expected) {
        assertEquals(expected, MainBouns.isPrime(input));
    }
}