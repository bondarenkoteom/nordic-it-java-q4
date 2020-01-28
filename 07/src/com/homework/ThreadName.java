package com.homework;

public class ThreadName implements Runnable {

    private int index;

    public ThreadName(int index) {
        this.index = index;
    }

    @Override
    public void run() {
        System.out.println("Поток" + this.index);

    }

}
