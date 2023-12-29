
/* Question 3:  Write an exception handling java program to read two numbers n1,n2 and calculate and print the result of n1/n2. If n2 is Zero (0) then it will be handled by 
exception handler and again ask the value of n2. In the exception handler the program should display appropriate message to the user.
 */
import java.util.Scanner;

public class Handler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number (n1): ");
            int n1 = scanner.nextInt();

            int n2;
            do {
                System.out.print("Enter the second number (n2): ");
                n2 = scanner.nextInt();

                if (n2 == 0) {
                    System.out.println("Error: Cannot divide by zero. Please enter a non-zero value for n2.");
                }
            } while (n2 == 0);

            double result = (double) n1 / n2;
            System.out.println("Result of n1/n2: " + result);
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid integer values.");
        } finally {
            scanner.close();
        }
    }
}
