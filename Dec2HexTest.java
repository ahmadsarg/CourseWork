import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Dec2HexTest {

    @Test
    public void testConvertToHex() {
        assertEquals("7D", Dec2Hex.convertToHex(125));
        assertEquals("156", Dec2Hex.convertToHex(342));
        assertEquals("0", Dec2Hex.convertToHex(0));
        assertEquals("Error: Input must be a non-negative integer.", Dec2Hex.convertToHex(-42));
        assertEquals("Error: Input must be an integer.", Dec2Hex.convertToHex(Integer.parseInt("abc")));
    }
}
