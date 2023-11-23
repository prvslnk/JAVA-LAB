/*  Write a java program that will take input as two +ve integers M and N where M<N.
a). The program will display the numbers between M and N, which are divisible by 3
and 5.
b). Count the numbers which are divisible by 3 and 5(between M and N), then add those
numbers and display.*/

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of M and N");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int c = 0, sum = 0;
        if (m > n) {
            System.out.println("first number should be smaller than second");
        } else {
            for (int i = m; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i);
                    c++;
                    sum = sum + i;
                }

            }
            System.out.println("Sum is " + sum + " Count is " + c);
        }
    }

}
