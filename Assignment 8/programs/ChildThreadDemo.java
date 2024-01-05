
/*  Write a java program that will create one child thread. The child thread has to display all odd numbers between m and n, and the main thread will display all the even numbers between m and n. The sample output is shown below:  */
import java.util.Scanner;

class ChildThread implements Runnable {
    Thread t;
    int m, n;

    ChildThread(int n1, int n2) {
        m = n1;
        n = n2;
        t = new Thread(this, "Child Thread");
        t.start();
    }

    public void run() {
        try {
            for (int i = m; i <= n; i++) {
                if (i % 2 != 0)
                    System.out.println("Child:" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
    }
}

class ChildThreadDemo {
    public static void main(String args[]) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        new ChildThread(n1, n2); // create a new thread
        try {
            for (int i = n1; i <= n2; i++) {
                Thread.sleep(500);
                if (i % 2 == 0)
                    System.out.println("Parent:" + i);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        sc.close();
    }
}
