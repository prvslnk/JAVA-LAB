
/*Write a java program to create two threads. First thread should find the square of the number, second thread should find the sum of the digits of the squared number. */
import java.util.Scanner;

class Global {
    public static int num;

    public static void update(int n) {
        num = n;
    }
}

class Child1 extends Thread {
    Child1() {
        start();
    }

    public void run() {
        int n = Global.num;
        Global.update(n * n);
    }
}

class Child2 extends Thread {
    Child2() {
        start();
    }

    public void run() {
        int n = Global.num;
        int r, sum = 0;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            sum += r;
        }
        Global.update(sum);
    }
}

class GlobalDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.print("Sum of the digits of square of " + n + "=");
        Global.update(n);
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        try {
            c1.join();
            c2.join();
        } catch (InterruptedException e) {
            System.out.print(e);
        }
        System.out.println(Global.num);

    }
}
