package agh.po.lab3;
import org.junit.Test;
import static org.junit.Assert.*;

public class CodingBatTest {

    @org.junit.Test //warmup-1>close10
    public void close10() {
        CodingBat cb = new CodingBat();
        assertEquals(8, cb.close10(8, 13));
        assertEquals(8, cb.close10(13, 8));
        assertEquals(0, cb.close10(13, 7));
    }

    @org.junit.Test  //warmup-1>makes10
    public void testMakes10() {
        CodingBat cb = new CodingBat();
        assertTrue(cb.makes10(9, 10));
        assertFalse(cb.makes10(9, 9));
        assertTrue(cb.makes10(1, 9));
    }

    @org.junit.Test //Array-2>countEvans
    public void testCountEvens() {
        CodingBat cb = new CodingBat();
        assertEquals(3, cb.countEvens(new int[]{2, 1, 2, 3, 4}));
        assertEquals(3, cb.countEvens(new int[]{2, 2, 0}));
        assertEquals(0, cb.countEvens(new int[]{1, 3, 5}));
    }
    @org.junit.Test
    public void testHelloName() {
        CodingBat cb = new CodingBat();

        assertEquals("Hello Bob!", cb.helloName("Bob"));
        assertEquals("Hello Alice!", cb.helloName("Alice"));
        assertEquals("Hello X!", cb.helloName("X"));
    }
}