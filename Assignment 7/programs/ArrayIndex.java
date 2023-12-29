/*  Question 2: Write an exception handling java program to print the index position of an existing interger array. The index value will be entered by user. It will be handled by 
exception handler if index position is greated then the size of array. In the exception handler the program should display appropriate message to the user.
 */

import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = { 10, 20, 30, 40, 50 };

        try {
            System.out.print("Enter the index position: ");
            int index = scanner.nextInt();

            if (index >= 0 && index < numbers.length) {
                System.out.println("Value at index " + index + ": " + numbers[index]);
            } else {
                throw new ArrayIndexOutOfBoundsException("Index out of bounds");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Please enter a valid index position within the array size.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid integer index.");
        } finally {
            scanner.close();
        }
    }
}
