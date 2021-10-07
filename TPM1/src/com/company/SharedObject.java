package com.company;

public class SharedObject {
    int count = 0;

    public synchronized int get() {
        return count;
    }

    public synchronized void inc() {
        count++;
    }
    public synchronized void dec()
    {
        count--;
    }

}

