import org.junit.Test;
import static org.junit.Assert.*;

public class Dec2HexTest {

    @Test
    public static void testValidInput() {
        assertEquals("Conversion of 255 to hex", "FF", Dec2Hex.convertDecimalToHex(255));
        assertEquals("Conversion of 16 to hex", "10", Dec2Hex.convertDecimalToHex(16));
        // Add more test cases as needed
    }

    @Test
    public static void testInvalidInput() {
        Dec2Hex.convertDecimalToHex(Integer.parseInt("InvalidInput"));
    }

    @Test
    public static void testAdditionalOperation() {
        // Assuming your additional operation is based on some condition
        // You may need to modify this test based on your specific additional operation logic
        assertEquals("Additional operation for value 150", "ExpectedResult", Dec2Hex.performAdditionalOperation(150));
        // Add more test cases as needed
    }
}
