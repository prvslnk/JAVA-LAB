
//  Write a java program that will compute GCD of two numbers.
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int n1 = obj.nextInt(), n2 = obj.nextInt();

        int gcd = 1;

        for (int i = 1; i <= n1 && i <= n2; ++i) {

            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }

        System.out.println("GCD of " + n1 + " and " + n2 + " is " + gcd);
    }
}
