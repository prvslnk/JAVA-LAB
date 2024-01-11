
/*7. Write a JAVA program to capitalize first letter of each word in an inputted sentence from
keyboard.
Sample Output:
Enter a sentence: india is great
India Is Great */
import java.util.Scanner;

class CapitalizeF {
    public static void main(String[] args) {
        System.out.println("Enter the sentence to capitalize the first letter : ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Scanner stringScanner = new Scanner(string);
        String resultString = "";
        while (stringScanner.hasNext()) {
            String str = stringScanner.next();
            resultString = resultString + str.substring(0, 1).toUpperCase() + str.substring(1) + " ";
        }
        System.out.println("After capitalizing the first letter in each word, result is : " +
                resultString);
    }
}
