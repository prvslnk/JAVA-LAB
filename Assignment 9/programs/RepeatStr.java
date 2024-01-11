
/*6. Write a JAVA program to read a string and print the count of occurrence of each character
of the string.
Sample Output:
Enter the String: impossible
The Character i has occurred 2 times
The Character m has occurred 1 times
The Character p has occurred 1 times
The Character o has occurred 1 times
The Character s has occurred 2 times
The Character b has occurred 1 times
The Character l has occurred 1 times
The Character e has occurred 1 times 
*/
import java.util.Scanner;

public class RepeatStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        int count = 0;
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            char c1 = str.charAt(i);
            for (int j = i; j < str.length(); j++) {
                char c2 = str.charAt(j);
                if (c1 == c2 && temp.indexOf(c1) == -1) {
                    count = count + 1;
                }
            }
            if (temp.indexOf(c1) == -1) {
                temp = temp + c1;
                System.out.println("The Character " + c1 + " has occurred " +
                        count + " times");
            }
            count = 0;
        }
    }
}
