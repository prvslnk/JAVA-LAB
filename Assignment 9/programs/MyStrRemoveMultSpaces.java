/*1. Write a JAVA program to remove multiple spaces in a string. 
Sample Output: If the given string is String With Multiple Spaces The output should be String With Multiple Spaces */

public class MyStrRemoveMultSpaces {
    public static void main(String[] args) {
        String inputString = "String    With    Multiple     Spaces";
        String cleanedString = inputString.replaceAll("\\s+", " ");

        // Printing result
        System.out.println("Original String: " + inputString);
        System.out.println("String with Multiple Spaces Removed: " + cleanedString);
    }
}
