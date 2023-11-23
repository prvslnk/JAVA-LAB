
//  Write a java program that will sort an array of N inputted numbers.

import java.util.Scanner;

class p2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = obj.nextInt();
        int ar[];
        ar = new int[n];
        System.out.println("Enter integers:");
        for (int i = 0; i < n; i++) {
            ar[i] = obj.nextInt();

        }
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (ar[j - 1] > ar[j]) {
                    temp = ar[j - 1];
                    ar[j - 1] = ar[j];
                    ar[j] = temp;
                }

            }
        }
        System.out.println("sorted array is:");
        for (int i = 0; i < n; i++) {
            System.err.println(ar[i] + " ");
        }
    }
}