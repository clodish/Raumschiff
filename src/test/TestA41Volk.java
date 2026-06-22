
import ktaris.Volk;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestA41Volk {
    private Volk volk;

    @BeforeEach
    void setUp() {
        volk = new Volk("TestVolk", 2022);
    }

    @Test
    void testConstructor() {
        assertEquals("TestVolk", volk.getName());
        assertEquals(2022, volk.getGruendung());
    }

    @Test
    void testSetName() {
        volk.setName("NewName");
        assertEquals("NewName", volk.getName());
    }

    @Test
    void testSetGruendung() {
        volk.setGruendung(2023);
        assertEquals(2023, volk.getGruendung());
    }

    @Test
    void testToString() {
        assertTrue(volk.toString().contains("TestVolk"), "TestVolk not found");
        assertTrue(volk.toString().contains("2022"), "Gruendung not found");
    }
}