// Write a java program that will search a number from an array of 10 numbers.

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int ch, ar[];
        ar = new int[10];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            ar[i] = obj.nextInt();
        }
        System.out.println("enter the number to search:");
        ch = obj.nextInt();
        for (int i = 0; i < 10; i++) {
            if (ar[i] == ch) {
                System.out.println(ch + " found at " + (i + 1));

            }

        }

    }
}