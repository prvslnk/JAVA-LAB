
/*5. Write a JAVA program to read a string from the key board and print its reverse.
Sample Output:
Enter a string: shore
Reverse of shore is erohs */
import java.util.Scanner;

public class StringRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse: ");
        String str = sc.nextLine();
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("String after reverse:" + reverse);
    }
}