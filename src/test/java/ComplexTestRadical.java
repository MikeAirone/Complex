import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTestRadical {
    @Test
    public void testRadical1() {
        Complex fr1 = new TComplex(1, 0);
        boolean actual = fr1.radical(4, 3).compare(new TComplex(0, -1));
        assertEquals(true, actual);
    }

    @Test
    public void testRadical2() {
        Complex fr1 = new TComplex(2, 1);
        boolean actual = fr1.radical(5, 2).compare(new TComplex(-1, 0.5));
        assertEquals(true, actual);
    }

    @Test
    public void testRadical3() {
        Complex fr1 = new TComplex(3, 7);
        boolean actual = fr1.radical(4, 3).compare(new TComplex(0.4, -1.6));
        assertEquals(true, actual);
    }
}