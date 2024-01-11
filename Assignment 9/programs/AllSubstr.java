
/*4. Write a JAVA program to find all substrings of a given string.
Sample Output:
Enter a string to find its sub-strings: shore
Sub-strings of the string "shore" are
 */
import java.util.Scanner;

class AllSubstr {
    public static void main(String args[]) {
        String str1, str2;
        int length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to find its sub-strings: ");
        str1 = sc.nextLine();
        length = str1.length();
        System.out.println("Sub-strings of the string \"" + str1 + "\" are");
        for (int c = 0; c < length; c++) {
            for (int i = 1; i <= length - c; i++) {
                str2 = str1.substring(c, c + i);
                System.out.println(str2);
            }
        }
    }
}
