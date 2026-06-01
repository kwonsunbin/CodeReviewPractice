import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcTest {

    private Calc calc;


    @BeforeEach
    void setUp() {
        calc = new Calc();
    }

    @Test
    void getSumTest() {
        int ret = calc.getSum(1, 2);
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
        assertThrows(IllegalArgumentException.class, () -> calc.getDevide(1, 0));
    }

    @Test
    void 세_양수의_합() {
        assertThat(calc.getSumSum(1, 2, 3)).isEqualTo(6);
    }

    @Test
    void 음수_포함_합() {
        assertThat(calc.getSumSum(-1, -2, -3)).isEqualTo(-6);
    }

    @Test
    void 모두_0이면_0() {
        assertThat(calc.getSumSum(0, 0, 0)).isEqualTo(0);
    }

    @Test
    void 양수_음수_혼합() {
        assertThat(calc.getSumSum(10, -3, 5)).isEqualTo(12);
    }
}
