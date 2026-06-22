package test;

import ktaris.Gegenstand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestA41Gegenstand {
    private Gegenstand gegenstand;

    @BeforeEach
    void setUp() {
        gegenstand = new Gegenstand("TestTyp", 10);
    }

    @Test
    void testConstructor() {
        assertEquals("TestTyp", gegenstand.getTyp());
        assertEquals(10, gegenstand.getFaktor());
    }

    @Test
    void testSetTyp() {
        gegenstand.setTyp("NewTyp");
        assertEquals("NewTyp", gegenstand.getTyp());
    }

    @Test
    void testSetFaktor() {
        gegenstand.setFaktor(20);
        assertEquals(20, gegenstand.getFaktor());
    }

    @Test
    void testSetFaktor2() {
        gegenstand.setFaktor(10);
        gegenstand.setFaktor(0); //darf nicht klappen
        assertEquals(10, gegenstand.getFaktor());
    }

    @Test
    void testToString() {
        assertTrue(gegenstand.toString().contains("TestTyp"), "TestTyp not found");
        assertTrue(gegenstand.toString().contains("10"), "Faktor not found");
    }
}