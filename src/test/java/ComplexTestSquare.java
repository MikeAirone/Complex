import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTestSquare {
    @Test
    public void testSqu1() {
        Complex fr1 = new TComplex(2, 1);
        boolean actual = fr1.square().compare(new TComplex(3, 4));
        assertEquals(true, actual);
    }

    @Test
    public void testSqu2() {
        Complex fr1 = new TComplex(-1, 1);
        boolean actual = fr1.square().compare(new TComplex(0, -2));
        assertEquals(true, actual);
    }

    @Test
    public void testSqu3() {
        Complex fr1 = new TComplex(-2, -3);
        boolean actual = fr1.square().compare(new TComplex(-5, 12));
        assertEquals(true, actual);
    }

}