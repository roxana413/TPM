package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //
        long start1 = System.nanoTime();


        int n, m;
        n = 3;
        m = 3;
        SharedObject myShared = new SharedObject();
        for (int i = 0; i <= n; i++)
            new MyThread(myShared, "n").start();
        System.out.println(myShared.get());

        for (int j = 0; j <= m; j++)
            new MyThread(myShared, "m").start();
        System.out.println(myShared.get());
        long end1 = System.nanoTime();
        System.out.println("Elapsed Time in  seconds: " + (end1 - start1)*Math.pow(10,-6));

    }
}
