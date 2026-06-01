import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalcTest {
    private final Calc calc = new Calc();

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
