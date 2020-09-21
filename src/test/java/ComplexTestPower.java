import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTestPower {
    @Test
    public void testPower1() {
        Complex fr1 = new TComplex(2, 1);
        boolean actual = fr1.power(2).compare(new TComplex(3, 4));
        assertEquals(true, actual);
    }

    @Test
    public void testMul2() {
        Complex fr1 = new TComplex(2, 1);
        boolean actual = fr1.power(5).compare(new TComplex(-38, 41));
        assertEquals(true, actual);
    }

    @Test
    public void testMul3() {
        Complex fr1 = new TComplex(3, 7);
        boolean actual = fr1.power(4).compare(new TComplex(-164, -3360));
        assertEquals(true, actual);
    }

}