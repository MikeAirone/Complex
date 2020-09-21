import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTestSum {

    @Test
    public void testSum1() {
        Complex fr1 = new TComplex(2, 1);
        Complex fr2 = new TComplex(1, 3);
        boolean actual = fr1.sum(fr2).compare(new TComplex(3, 4));
        assertEquals(true, actual);
    }

    @Test
    public void testSum2() {
        Complex fr1 = new TComplex(2, 1);
        boolean actual = fr1.sum(fr1).compare(new TComplex(4, 2));
        assertEquals(true, actual);
    }

    @Test
    public void testSum3() {
        Complex fr1 = new TComplex(2, 1);
        Complex fr2 = new TComplex(-1, -3);
        boolean actual = fr1.sum(fr2).compare(new TComplex(1, -2));
        assertEquals(true, actual);
    }
}