import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {

    @Test
    void getSumTest() {
        Calc calc = new Calc();
        int ret = calc.getSum(1, 2);
        Assertions.assertEquals(3, ret);
    }
}
