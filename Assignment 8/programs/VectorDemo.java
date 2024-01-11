
/*   Write a java program that will compute product of two vector (1D array) using multithreading. The program should read two vectors (of same size) from the user. First thread should multiply the corresponding elements present in the odd index position and second thread should multiply the corresponding elements present in the even index 
position. Main thread should display the result. */

import java.util.Scanner;

class Global {
    public static int R[];

    Global(int s) {
        R = new int[s];
        for (int i = 0; i < s; i++)
            R[i] = 0;
    }

    public static void update(int index, int n) {
        R[index] = n;
    }
}

class Child1 extends Thread {
    int V1[], V2[];
    int size;

    Child1(int V1[], int V2[], int size) {
        this.V1 = V1;
        this.V2 = V2;
        this.size = size;
        start();
    }

    public void run() {
        try {
            for (int i = 1; i < size; i += 2) {
                Global.update(i, V1[i] * V2[i]);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child 1 interrupted.");
        }
    }
}

class Child2 extends Thread {
    int V1[], V2[];
    int size;

    Child2(int V1[], int V2[], int size) {
        this.V1 = V1;
        this.V2 = V2;
        this.size = size;
        start();
    }

    public void run() {
        try {
            for (int i = 0; i < size; i += 2) {
                Global.update(i, V1[i] * V2[i]);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child 2 interrupted.");
        }
    }
}

class VectorDemo {
    public static void main(String args[]) {
        int size;
        int m[], n[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the vectors:");
        size = sc.nextInt();
        m = new int[size];
        n = new int[size];
        new Global(size);
        System.out.println("Enter the first vector:");
        for (int i = 0; i < size; i++)
            m[i] = sc.nextInt();
        System.out.println("Enter the second vector:");
        for (int i = 0; i < size; i++)
            n[i] = sc.nextInt();
        Child1 c1 = new Child1(m, n, 5);
        Child2 c2 = new Child2(m, n, 5);
        try {
            c1.join();
            c2.join();
        } catch (InterruptedException e) {
            System.out.print(e);
        }
        System.out.println("Product of the vectors:");
        for (int i = 0; i < size; i++) {
            System.out.print(Global.R[i] + "\t");
        }
    }
}
