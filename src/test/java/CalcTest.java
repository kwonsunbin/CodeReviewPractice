import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        Calc c = new Calc();
        assertEquals(10, c.getMinus(12, 2));
    }

    @Test
    void getDevide() {
        Calc c = new Calc();
        assertEquals(2, c.getDevide(10, 5));
    }
}
