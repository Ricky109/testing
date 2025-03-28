package tudelft.chocolate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChocolateBagsTest4 {
    private final ChocolateBags chocolateBags = new ChocolateBags();

    @Test
    void testNecesidadDeBarrasGrandesYPequenas() {
        int result = chocolateBags.calculate(3, 2, 8); // Se necesitan 1 barra grande (5) y 3 pequeñas (3)
        assertEquals(3, result);
    }

    @Test
    void testSoloBarrasPequenas() {
        int result = chocolateBags.calculate(6, 1, 4); // Se usan solo 4 barras pequeñas
        assertEquals(4, result);
    }
}

