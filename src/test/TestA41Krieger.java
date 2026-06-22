import ktaris.Krieger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



class TestA41Krieger {
    private Krieger krieger;

    @BeforeEach
    void setUp() {
        krieger = new Krieger("TestKrieger", 30);
    }

    @Test
    void testConstructor() {
        assertEquals("TestKrieger", krieger.getName());
        assertEquals(30, krieger.getAlter());
    }

    @Test
    void testSetName() {
        krieger.setName("NewName");
        assertEquals("NewName", krieger.getName());
    }

    @Test
    void testSetAlter() {
        krieger.setAlter(35);
        assertEquals(35, krieger.getAlter());
    }

    @Test
    void testgetMacht() {
        assertEquals(1, krieger.getMacht());
    }

    @Test
    void testToString() {
        assertTrue(krieger.toString().contains("TestKrieger"), "TestKrieger not found");
        assertTrue(krieger.toString().contains("30"), "Alter not found");
    }
}