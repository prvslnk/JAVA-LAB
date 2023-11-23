/*  Write a java program that will count the number of primes between 37 and 129.
 */
public class p5 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 37; i <= 129; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println("The number of primes between 37 and 129 is: " + count);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
