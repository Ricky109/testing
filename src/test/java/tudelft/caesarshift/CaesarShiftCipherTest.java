package tudelft.caesarshift;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaesarShiftCipherTest {

    @Test
    public void testPositiveShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("def", cipher.caesarShiftCipher("abc", 3));
        assertEquals("xyz", cipher.caesarShiftCipher("uvw", 3));
        assertEquals("cde fgh", cipher.caesarShiftCipher("abc def", 2));
    }

    @Test
    public void testNegativeShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("xyz", cipher.caesarShiftCipher("abc", -3));
        assertEquals("uvw", cipher.caesarShiftCipher("xyz", -3));
        assertEquals("abc def", cipher.caesarShiftCipher("cde fgh", -2));
    }

    @Test
    public void testZeroShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("abc", cipher.caesarShiftCipher("abc", 0));
        assertEquals("hello world", cipher.caesarShiftCipher("hello world", 0));
    }

    @Test
    public void testInvalidCharacters() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("invalid", cipher.caesarShiftCipher("hello!", 3));
        assertEquals("invalid", cipher.caesarShiftCipher("123", 3));
        assertEquals("invalid", cipher.caesarShiftCipher("test$", -3));
    }
}

