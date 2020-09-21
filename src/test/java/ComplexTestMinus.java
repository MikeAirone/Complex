import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTestMinus {
    @Test
    public void testMinus1() {
        Complex fr1 = new TComplex(2, 1);
        boolean actual = fr1.minus().compare(new TComplex(-2, -1));
        assertEquals(true, actual);
    }

    @Test
    public void testMinus2() {
        Complex fr1 = new TComplex(-1, 1);
        boolean actual = fr1.minus().compare(new TComplex(1, -1));
        assertEquals(true, actual);
    }

    @Test
    public void testMinus3() {
        Complex fr1 = new TComplex(-1, -3);
        boolean actual = fr1.minus().compare(new TComplex(1, 3));
        assertEquals(true, actual);
    }
}