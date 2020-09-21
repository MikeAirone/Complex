import org.junit.Test;

import static java.lang.Math.sqrt;
import static org.junit.Assert.*;

public class ComplexTestRad {
    @Test
    public void testRad1() {
        Complex fr1 = new TComplex(2, 1);
        double actual = fr1.rad();
        assertEquals(0.5, actual, 0.1);
    }

    @Test
    public void testRad2() {
        Complex fr1 = new TComplex(1, 0);
        double actual = fr1.rad();
        assertEquals(0, actual, 0.1);
    }

    @Test
    public void testRad3() {
        Complex fr1 = new TComplex(-3, 1);
        double actual = fr1.rad();
        assertEquals(-0.3, actual,0.1);
    }
}