
/*  Write a java program to create a user-defined exception called NameFormatException. The program should read a name from the user and throw NameFormatException if the entered name contains any character other than the 
English alphabets. */
import java.util.Scanner;

class NameFormatException extends Exception {
    public NameFormatException(String message) {
        super(message);
    }
}

public class ValidName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your name: ");
            String enteredName = scanner.nextLine();

            validateNameFormat(enteredName);

            System.out.println("Name validation successful. Entered name: " + enteredName);
        } catch (NameFormatException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void validateNameFormat(String name) throws NameFormatException {
        if (!name.matches("[a-zA-Z]+")) {
            throw new NameFormatException("Invalid name format. Name should contain only English alphabets.");
        }
    }
}
