
//  Write a Java program that will evaluate the following exponential series.
import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value of x and n: ");
        int x = obj.nextInt(), n = obj.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            int fact = 1;
            for (int j = 1; j <= i; j++) {
                fact = fact * j;
            }
            sum = 1 + (sum + Math.pow(x, i) / fact);
        }
        System.out.println(sum);
    }
}