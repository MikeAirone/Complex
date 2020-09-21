import org.junit.Test;

import static java.lang.Math.sqrt;
import static org.junit.Assert.*;

public class ComplexTestAbs {
    @Test
    public void testAbs() {
        Complex fr1 = new TComplex(2, 1);
        double actual = fr1.absolute();
        assertEquals(sqrt(5), actual, 0.1);
    }

    @Test
    public void testAbs2() {
        Complex fr1 = new TComplex(1, 0);
        double actual = fr1.absolute();
        assertEquals(1.0, actual, 0.1);
    }

    @Test
    public void testSum3() {
        Complex fr1 = new TComplex(-3, 1);
        double actual = fr1.absolute();
        assertEquals(sqrt(10), actual,0.1);
    }

}