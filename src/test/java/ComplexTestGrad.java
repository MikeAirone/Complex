import org.junit.Test;

import static java.lang.Math.sqrt;
import static org.junit.Assert.*;

public class ComplexTestGrad {
    @Test
    public void testGrad() {
        Complex fr1 = new TComplex(2, 1);
        double actual = fr1.grad();
        assertEquals(26.5, actual, 0.1);
    }

    @Test
    public void testGrad2() {
        Complex fr1 = new TComplex(1, 1);
        double actual = fr1.grad();
        assertEquals(45.0, actual, 0.1);
    }

    @Test
    public void testGrad3() {
        Complex fr1 = new TComplex(-3, 1);
        double actual = fr1.grad();
        assertEquals(-18.4, actual,0.1);
    }
}