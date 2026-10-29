package agh.po.lab3;
import org.junit.Test;
import static org.junit.Assert.*;

public class CodingBatTest {

    @org.junit.Test
    public void close10() {
        CodingBat cb = new CodingBat();
        assertEquals(8, cb.close10(8, 13));
        assertEquals(8, cb.close10(13, 8));
        assertEquals(0, cb.close10(13, 7));
    }
}