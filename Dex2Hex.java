import java.util.logging.Logger;

public class public Dec2Hex {

    private static final Logger logger = Logger.getLogger(Dec2Hex.class.getName());

    public static void main(String args[]) {
        // Check for input argument
        if (args.length == 0) {
            logger.severe("Error: Please provide an input argument.");
            System.exit(1);
        }

        // Parse the input argument as an integer
        try {
            int arg1 = Integer.parseInt(args[0]);

            // Continue with the rest of your code
            String hexadecimal = convertDecimalToHex(arg1);

            logger.info(String.format("Hexadecimal representation is: %s", hexadecimal));

            // Conditionally invoke additional methods based on some criteria
            if (arg1 > 100) {
                performAdditionalOperation(arg1);
            }

            logger.info("THANK YOU");

        } catch (NumberFormatException e) {
            // Handle non-integer inputs
            logger.severe("Error: Input must be an integer.");
            System.exit(1);
        }
    }

    public static String convertDecimalToHex(int num) {
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem;
        String hexadecimal = "";

        logger.info(String.format("Converting the Decimal Value %d to Hex...", num));

        while (num != 0) {
            rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }

        return hexadecimal;
    }

    private static void performAdditionalOperation(int value) {
        // This method will be invoked conditionally
        logger.info(String.format("Performing additional operation for value %d", value));
        // Add your additional operation logic here
    }
}
