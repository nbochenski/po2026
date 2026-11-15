package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CodingBatTest {

    // Warmup-1>close10
    @org.junit.Test
    public void close10() {
        CodingBat cb = new CodingBat();
        assertEquals(8, cb.close10(8, 13));
        assertEquals(8, cb.close10(13, 8));
        assertEquals(0, cb.close10(13, 7));
    }

    // Warmup-1>makes10
    @org.junit.Test
    public void testMakes10() {
        CodingBat cb = new CodingBat();
        assertTrue(cb.makes10(9, 10));
        assertFalse(cb.makes10(9, 9));
        assertTrue(cb.makes10(1, 9));
    }

    // Array-2>countEvens
    @org.junit.Test
    public void testCountEvens() {
        CodingBat cb = new CodingBat();
        assertEquals(3, cb.countEvens(new int[]{2, 1, 2, 3, 4}));
        assertEquals(3, cb.countEvens(new int[]{2, 2, 0}));
        assertEquals(0, cb.countEvens(new int[]{1, 3, 5}));
    }

    // String-1>helloName
    @org.junit.Test
    public void testHelloName() {
        CodingBat cb = new CodingBat();
        assertEquals("Hello Bob!", cb.helloName("Bob"));
        assertEquals("Hello Alice!", cb.helloName("Alice"));
        assertEquals("Hello X!", cb.helloName("X"));
    }

    // Map-2>mapAB2
    @org.junit.Test
    public void testMapAB2() {
        CodingBat cb = new CodingBat();

        Map<String, String> wejscie1 = new HashMap<>();
        wejscie1.put("a", "aaa");
        wejscie1.put("b", "aaa");
        wejscie1.put("c", "apple");
        Map<String, String> oczek1 = new HashMap<>();
        oczek1.put("c", "apple");

        Map<String, String> wejscie2 = new HashMap<>();
        wejscie2.put("a", "aaa");
        wejscie2.put("b", "bbb");
        Map<String, String> oczek2 = new HashMap<>();
        oczek2.put("a", "aaa");
        oczek2.put("b", "bbb");

        Map<String, String> wejscie3 = new HashMap<>();
        wejscie3.put("a", "aaa");
        wejscie3.put("b", "bbb");
        wejscie3.put("c", "aaa");
        Map<String, String> oczek3 = new HashMap<>();
        oczek3.put("a", "aaa");
        oczek3.put("b", "bbb");
        oczek3.put("c", "aaa");

        assertEquals(oczek1, cb.mapAB2(wejscie1));
        assertEquals(oczek2, cb.mapAB2(wejscie2));
        assertEquals(oczek3, cb.mapAB2(wejscie3));
    }

    // Map-2>wordCount
    @org.junit.Test
    public void testWordCount() {
        CodingBat cb = new CodingBat();

        String[] wejscie1 = {"kot", "pies", "kot", "ptak", "pies"};
        Map<String, Integer> oczek1 = new HashMap<>();
        oczek1.put("kot", 2);
        oczek1.put("pies", 2);
        oczek1.put("ptak", 1);

        String[] wejscie2 = {"ptak", "pies", "kot"};
        Map<String, Integer> oczek2 = new HashMap<>();
        oczek2.put("kot", 1);
        oczek2.put("pies", 1);
        oczek2.put("ptak", 1);

        String[] wejscie3 = {"ptak", "ptak", "ptak", "ptak"};
        Map<String, Integer> oczek3 = new HashMap<>();
        oczek3.put("ptak", 4);

        assertEquals(oczek1, cb.wordCount(wejscie1));
        assertEquals(oczek2, cb.wordCount(wejscie2));
        assertEquals(oczek3, cb.wordCount(wejscie3));
    }
}