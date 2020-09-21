import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTestMul {

    @Test
    public void testMul1() {
        Complex fr1 = new TComplex(2, 1);
        Complex fr2 = new TComplex(1, 3);
        boolean actual = fr1.mul(fr2).compare(new TComplex(-1, 7));
        assertEquals(true, actual);
    }

    @Test
    public void testMul2() {
        Complex fr1 = new TComplex(2, 1);
        boolean actual = fr1.mul(fr1).compare(new TComplex(3, 4));
        assertEquals(true, actual);
    }

    @Test
    public void testMul3() {
        Complex fr1 = new TComplex(2, 1);
        Complex fr2 = new TComplex(-1, -3);
        boolean actual = fr1.mul(fr2).compare(new TComplex(1, -7));
        assertEquals(true, actual);
    }

}