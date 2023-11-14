public class Dec2Hex {

    public static void main(String args[]) {
        // Check for input argument
        if (args.length == 0) {
            System.err.println("Error: Please provide an input argument.");
            System.exit(1);
        }

        // Parse the input argument as an integer
        try {
            int decimalInput = Integer.parseInt(args[0]);

            // Convert and print the hexadecimal representation
            String hexadecimal = convertToHex(decimalInput);
            System.out.println("Hexadecimal representation is: " + hexadecimal);
            System.out.println("THANK YOU");

        } catch (NumberFormatException e) {
            // Handle non-integer inputs
            System.err.println("Error: Input must be an integer.");
            System.exit(1);
        }
    }

    // Method to convert decimal to hexadecimal
    public static String convertToHex(int decimal) {
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int remainder;
        int num = decimal;
        StringBuilder hexadecimal = new StringBuilder();

        while (num != 0) {
            remainder = num % 16;
            hexadecimal.insert(0, hexDigits[remainder]);
            num = num / 16;
        }

        return hexadecimal.toString();
    }
}

