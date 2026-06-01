import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcTest {

    private Calc calc;

    @BeforeEach
    void setUp() {
        calc = new Calc();
    }

    @Test
    void testGetGop() {
        assertEquals(6, calc.getGop(2, 3));
        assertEquals(0, calc.getGop(0, 5));
        assertEquals(-10, calc.getGop(-2, 5));
    }

    @Test
    void testGetZegop() {
        assertEquals(9, calc.getZegop(3));
        assertEquals(0, calc.getZegop(0));
        assertEquals(25, calc.getZegop(-5));
    }

    @Test
    void getMinus() {
        assertEquals(10, calc.getMinus(12, 2));
    }

    @Test
    void getDevide() {
        assertEquals(2, calc.getDevide(10, 5));
    }

    @Test
    void getDevideWithException() {
        assertThrows(IllegalArgumentException.class, ()->calc.getDevide(1, 0));
    }
}
