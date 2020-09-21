import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTestSub {
    @Test
    public void testSub1() {
        Complex fr1 = new TComplex(2, 1);
        Complex fr2 = new TComplex(1, 3);
        boolean actual = fr1.sub(fr2).compare(new TComplex(1, -2));
        assertEquals(true, actual);
    }

    @Test
    public void testSub2() {
        Complex fr1 = new TComplex(2, 1);
        boolean actual = fr1.sub(fr1).compare(new TComplex(0, 0));
        assertEquals(true, actual);
    }

    @Test
    public void testSub3() {
        Complex fr1 = new TComplex(2, 1);
        Complex fr2 = new TComplex(-1, -3);
        boolean actual = fr1.sub(fr2).compare(new TComplex(3, 4));
        assertEquals(true, actual);
    }
}