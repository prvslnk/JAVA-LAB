
/*3. Write a JAVA program to sort an array of names (strings) as per alphabetical order.
Sample Output: If the array of names contains Ram John Harish Anand Ajay
After sorting the output should be Ajay Anand John Harish Ram */
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp, name[] = new String[5];
        System.out.println("Enter five names:");
        for (int i = 0; i < 5; i++) {
            name[i] = sc.nextLine();
        }
        System.out.println("Before sorting names are:");
        for (int i = 0; i < 5; i++) {
            System.out.println(name[i]);
        }
        for (int i = 0; i < name.length - 1; i++) {
            for (int j = i + 1; j < name.length; j++) {
                if (name[i].compareTo(name[j]) > 0) {
                    temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        System.out.println("After sorting names are:");
        for (int i = 0; i < 5; i++) {
            System.out.println(name[i]);
        }
        sc.close();
    }
}