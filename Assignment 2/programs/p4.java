
/*  Java Program to Interchange Elements of First and Last in a Matrix Across Rows
Input 1: 1 1 5 0
 2 3 7 2
 8 9 1 3
 6 7 8 2
Output 1: 6 7 8 2
 2 3 7 2
 8 9 1 3
 1 1 5 0  */
import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[][] ar = new int[4][4];
        System.out.println("enter the values");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                ar[i][j] = obj.nextInt();
            }
        }
        for (int j = 0; j < 4; j++) {
            int temp = ar[0][j];
            ar[0][j] = ar[3][j];
            ar[3][j] = temp;
        }
        System.out.println("OUTPUT:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }

}