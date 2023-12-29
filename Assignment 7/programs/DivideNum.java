
/* Question 4:  Write a java program to read two numbers x and y and calculate x/(x-y). The 
program should check the value of x-y. Before dividing with x, it should throw an 
exception if x-y is zero. In the exception handler the program should display 
appropriate message to the user.
 */
import java.util.Scanner;

public class DivideNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the value of x: ");
            double x = scanner.nextDouble();

            System.out.print("Enter the value of y: ");
            double y = scanner.nextDouble();

            if (Math.abs(x - y) < 1e-10) {
                throw new ArithmeticException("Cannot divide by zero (x - y is zero).");
            }

            double result = x / (x - y);
            System.out.println("Result of x / (x - y): " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Please enter values such that x - y is not zero.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid numeric values.");
        } finally {
            scanner.close();
        }
    }
}
