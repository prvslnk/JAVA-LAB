/*  Write a java program in which main thread should create two child threads (Producer and Consumer). First child thread (Producer) should produce ten random integers between 1 to 100 and the second child thread (Consumer) should check whether the generated number is even or odd. At the end the second child thread (Consumer) hould print total number of even numbers received. Both the threads should wait and notify each other wherever necessary. The sample output is shown below: */

import java.util.Random;

class Q {
    int n, sum = 0;
    boolean valueSet = false;

    synchronized int get() {
        if (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        if (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Number generated by Producer: " + n);
        notify();
    }
}

class Producer implements Runnable {
    Q q;
    Thread t;

    Producer(Q q) {
        this.q = q;
        t = new Thread(this, "Producer");
        t.start();
    }

    public void run() {
        int i = 0, no;
        Random rand = new Random();
        while (i < 10) {
            no = (int) (100 * rand.nextDouble());
            i++;
            q.put(no);
        }
        return;
    }
}

class Consumer implements Runnable {
    Q q;
    Thread t;

    Consumer(Q q) {
        this.q = q;
        t = new Thread(this, "Consumer");
        t.start();
    }

    public void run() {
        int x, i = 0, cnt = 0;
        while (i < 10) {
            i++;
            x = q.get();
            if (x % 2 == 0)
                cnt++;
        }
        System.out.println("Number even numbers received by Consumer: " + cnt);
    }
}

class WaitDemo {
    public static void main(String args[]) {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        try {
            p.t.join();
            c.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
    }
}