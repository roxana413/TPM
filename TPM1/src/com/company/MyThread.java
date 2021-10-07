package com.company;

public class MyThread extends Thread {
    SharedObject shared;
    String type;

    public MyThread(SharedObject shared, String type) {
        this.shared = shared;
        this.type=type;
    }

    public void run (){
        int i = 0;
        while (i < 100000) {
            if(this.type.equals("n"))
            shared.inc();
            else
                shared.dec();
            i++;
            /*try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/

        }
    }

}

