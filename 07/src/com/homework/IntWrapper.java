package com.homework;

public class IntWrapper {

    private int count;

    public IntWrapper() {
    }

    public IntWrapper(int count) {
        this.count = count;
    }

    public void increment() {
        count = count + 1;

    }

    public int getCount() {
        return count;
    }
}
