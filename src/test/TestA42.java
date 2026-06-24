import ktaris.Gegenstand;
import ktaris.Krieger;
import ktaris.Volk;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestA42 {
    private Krieger krieger;
    private Gegenstand gegenstand;
    private Volk volk;

    @BeforeEach
    void setUp() {
        krieger = new Krieger("TestKrieger", 30);
        volk = new Volk("TestVolk", 2022);
        gegenstand = new Gegenstand("TestGegenstand", 10);
    }

    @Test
    void testAddGegenstand() {
        krieger.addGegenstand(gegenstand);
        assertTrue(krieger.getGegenstand().contains(gegenstand));
    }

    @Test
    void testRemoveGegenstand() {
        krieger.addGegenstand(gegenstand);
        krieger.removeGegenstand(gegenstand);
        assertFalse(krieger.getGegenstand().contains(gegenstand));
    }

    @Test
    void testSetChef() {
        volk.setChef(krieger);
        assertEquals(krieger, volk.getChef());
    }

    @Test
    void testAddKrieger() {
        volk.addKrieger(krieger);
        assertEquals(krieger, volk.getChef());
    }

    @Test
    void testRemoveKrieger() {
        volk.addKrieger(krieger);
        volk.removeKrieger(krieger);
        assertNull(volk.getChef());
    }

    @Test
    void testRemoveKrieger2() {
        Krieger k2 = new Krieger("TestKrieger2", 60);

        volk.addKrieger(krieger);
        volk.addKrieger(k2);
        volk.removeKrieger(krieger);
        assertEquals(k2, volk.getChef());
    }

    @Test
    void testRemoveKrieger3() {
        Krieger k2 = new Krieger("TestKrieger2", 60);

        volk.addKrieger(krieger);
        volk.addKrieger(k2);
        volk.removeKrieger(k2);
        assertEquals(krieger, volk.getChef());
    }
}
