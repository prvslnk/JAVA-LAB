
/* 8. Write a JAVA program to check two strings are Anagram or not. 
Sample Output:
Enter the 2 strings to check Anagram : 
Debit card 
Bad credit 
The input strings are Anagram 
 */
import java.util.Arrays;
import java.util.Scanner;

class CheckAnagram {
    public static void main(String[] args) {
        System.out.println("Enter the 2 strings to check Anagram : ");
        Scanner scanner = new Scanner(System.in);
        String sentence1 = scanner.nextLine();
        String sentence2 = scanner.nextLine();
        if (sentence1.replaceAll(" ", "").length() == sentence1.replaceAll(" ", "").length()) {
            char[] characterArray1 = sentence1.toLowerCase().toCharArray(); // Converting string to character array
            char[] characterArray2 = sentence2.toLowerCase().toCharArray();
            Arrays.sort(characterArray1);// Sorting array
            Arrays.sort(characterArray2);
            if (Arrays.equals(characterArray1, characterArray2)) {
                System.out.println("The input strings are Anagram");
            } else {
                System.out.println("The input strings are not Anagram");
            }
        } else {
            System.out.println("The input strings are not Anagram");
        }
    }
}