import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {
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
