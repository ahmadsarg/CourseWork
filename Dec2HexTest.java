import org.junit.Test;
import static org.junit.Assert.*;

public class Dec2HexTest {

    @Test
    public void testValidInput() {
        assertEquals("Conversion of 255 to hex", "FF", Dec2Hex.convertDecimalToHex(255));
        assertEquals("Conversion of 16 to hex", "10", Dec2Hex.convertDecimalToHex(16));
    }
}
