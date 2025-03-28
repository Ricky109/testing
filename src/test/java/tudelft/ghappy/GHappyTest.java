package tudelft.ghappy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GHappyTest {
    private final GHappy gHappy = new GHappy();

    @Test
    void testAllHappyG() {
        assertTrue(gHappy.gHappy("xxggxx"));
    }

    @Test
    void testLonelyG() {
        assertFalse(gHappy.gHappy("xxgxx"));
    }

    @Test
    void testMixedG() {
        assertFalse(gHappy.gHappy("xxggyygxx"));
    }

    @Test
    void testOnlyGs() {
        assertTrue(gHappy.gHappy("gggggg"));
    }

    @Test
    void testSingleG() {
        assertFalse(gHappy.gHappy("g"));
    }
}

