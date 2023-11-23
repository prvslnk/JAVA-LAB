/*  If one looks at the square numbers and the differences between each adjacent pair of square
numbers a pattern emerges.
squares: 0 1 4 9 16 25 36 49…
differences: 1 3 5 7 9 11 13…
Write a program to print out the square numbers, ten in a line, without using multiplication operator. */

public class p9 {
    public static void main(String[] args) {
        int sum = 0;
        for (int j = 1; j < 19; j = j + 2) {
            sum = sum + j;
            System.out.println(sum);
        }
    }
}
