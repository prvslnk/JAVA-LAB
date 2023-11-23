
/*  Write a method smallestFactor that accept an integer argument, and return the smallest
factor larger than 1 of this number. It should return the argument itself if it is a prime or it is
1, and return 0 if it is not positive. By calling the method smallestFactor, write the main
method of a program that read a number from the user and completely factorize it. 
 */
import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to factorize:");
        int num = scanner.nextInt();
        while (num > 1) {
            int factor = smallestFactor(num);
            System.out.println(factor);
            num /= factor;
        }
    }

    public static int smallestFactor(int num) {
        if (num <= 0) {
            return 0;
        }
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                return i;
            }
        }
        return num;
    }
}
