/*  Write a Java thread program to search the minimum number in a given array. The program should read the number of elements in the array, number of threads to be created and the array elements from the user. Each thread should find minimum element in an assigned
block of elements and compare to global minimum element. When all the threads are done, the global variable should contain the minimum element. It should use a Synchronized block to make sure that only one thread is updating the global minimum variable at any given time */

import java.util.Scanner;

class Global {
    public static int min, tno;

    public static synchronized void update(int n) {
        if (tno == 0)
            min = n;
        else {
            if (n < min)
                min = n;
        }
        tno++;
    }
}

class ChildThread extends Thread {
    int m, n, arr[];

    ChildThread(int n1, int n2, int a[]) {
        m = n1;
        n = n2;
        arr = new int[n2 - n1 + 1];
        for (int i = 0; i < n - m + 1; i++)
            arr[i] = a[m + i];
        start();
    }

    public void run() {
        int small = arr[0];
        for (int i = 1; i < n - m + 1; i++) {
            if (arr[i] < small)
                small = arr[i];
        }
        System.out.println(m + "\t" + n + "\t" + small);
        Global.update(small);
    }
}

class MinDemo {
    public static void main(String args[]) {
        int m, n, i, arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array:");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the number of threads to be created:");
        m = sc.nextInt();
        ChildThread ct[] = new ChildThread[m];
        System.out.println("Enter " + n + " elements:");
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for (i = 0; i < m - 1; i++)
            ct[i] = new ChildThread((n / m) * i, (n / m) * (i + 1) - 1, arr);
        ct[i] = new ChildThread((n / m) * i, n - 1, arr);
        try {
            for (i = 0; i < m; i++)
                ct[i].join();
        } catch (InterruptedException e) {
            System.out.print(e);
        }
        System.out.println("Minimum element of the array : " + Global.min);
    }
}