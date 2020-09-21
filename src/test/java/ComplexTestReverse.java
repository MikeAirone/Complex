import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTestReverse {
    @Test
    public void testRev1() {
        Complex fr1 = new TComplex(2, 1);
        boolean actual = fr1.reverse().compare(new TComplex(0.4, -0.2));
        assertEquals(true, actual);
    }

    @Test
    public void testRev2() {
        Complex fr1 = new TComplex(-2, 1);
        boolean actual = fr1.reverse().compare(new TComplex(-0.4, -0.2));
        assertEquals(true, actual);
    }

    @Test
    public void testRev3() {
        Complex fr1 = new TComplex(-1, -3);
        boolean actual = fr1.reverse().compare(new TComplex(-0.1, 0.3));
        assertEquals(true, actual);
    }

}