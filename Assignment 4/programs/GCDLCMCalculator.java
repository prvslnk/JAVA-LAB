/* Write a program that will take two integer numbers from the command prompt and find  their GCD and LCM. If the user does not provide exactly two numbers of arguments then the program should display error message.
 */
public class GCDLCMCalculator {
    public static void main(String[] args) {
        // Check if exactly two arguments are provided
        if (args.length != 2) {
            System.out.println("Error: Please provide exactly two integer numbers.");
            return;
        }

        try {
            // Parse command-line arguments to integers
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Calculate and display GCD and LCM
            int gcd = calculateGCD(num1, num2);
            int lcm = calculateLCM(num1, num2);

            System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
            System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid integer numbers.");
        }
    }

    // Function to calculate GCD using Euclidean algorithm
    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    // Function to calculate LCM using the relationship: LCM(a, b) = |a * b| /
    // GCD(a, b)
    private static int calculateLCM(int a, int b) {
        return Math.abs(a * b) / calculateGCD(a, b);
    }
}

// Input Should be java GCDLCMCalculator 24 36
