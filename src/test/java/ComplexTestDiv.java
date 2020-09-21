import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTestDiv {

    @Test
    public void testDiv1() {
        Complex fr1 = new TComplex(2, 1);
        Complex fr2 = new TComplex(1, 3);
        boolean actual = fr1.div(fr2).compare(new TComplex(0.5, -0.5));
        assertEquals(true, actual);
    }

    @Test
    public void testDiv2() {
        Complex fr1 = new TComplex(2, 1);
        boolean actual = fr1.div(fr1).compare(new TComplex(1, 0));
        assertEquals(true, actual);
    }

    @Test
    public void testDiv3() {
        Complex fr1 = new TComplex(2, 1);
        Complex fr2 = new TComplex(-1, -3);
        boolean actual = fr1.div(fr2).compare(new TComplex(-0.5, 0.5));
        assertEquals(true, actual);
    }

}