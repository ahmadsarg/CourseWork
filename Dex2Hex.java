
import java.util.Scanner;

class Dec2Hex
{

    public static int Arg1;

    public static void main(String args[])
    {// Check if an input argument is provided
        if (args.length == 0) {
            System.err.println("Error: Please provide a decimal input.");
            System.exit(1); // Exit the program with an error code
        }

        // Validate and convert the input argument to integer
        int num;
        try {
            num = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            // Handle non-integer inputs gracefully
            System.err.println("Error: Input must be an integer.");
            System.exit(1); // Exit the program with an error code
            return; // This is not strictly necessary, but it helps to emphasize that the program will exit
        }
 
       Arg1 = Integer.parseInt(args[0]);
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem, num;
        num = Arg1;
        String hexadecimal="";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }

        System.out.println("Hexadecimal representation  " + hexadecimal);

    }
}
