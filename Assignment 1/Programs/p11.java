/*  Write a method called absDiff, which takes two integers as parameters and returns the
absolute value of the difference between the two integers. Using the method absDiff write a
method called intRoot, which takes an integer as a parameter and returns the integer value
closest to the square root of the parameter. Given a sequence where the ith term is the
closest integer to the square root of i, write a method called printSequence, which takes an
integer n as a parameter and prints on the screen the first n integers in the sequence, ten in a
line. You may use previously written and inbuilt methods. So printSequence(10) would
print on the screen:
1 1 2 2 2 2 3 3 3 3  */
public class p11 {
    public static void main(String[] args) {
        printSequence(10);
    }

    public static int absDiff(int a, int b) {
        return Math.abs(a - b);
    }

    public static int intRoot(int n) {
        int root = (int) Math.sqrt(n);
        if (absDiff(n, root * root) < absDiff(n, (root + 1) * (root + 1))) {
            return root;
        } else {
            return root + 1;
        }
    }

    public static void printSequence(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(intRoot(i) + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
