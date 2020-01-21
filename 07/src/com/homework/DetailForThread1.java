package com.homework;

public class DetailForThread1 implements Runnable {

    private int detail1 = 1;
    private int detail2 = 2;
    private int detail3 = 3;

    private int number;

    public DetailForThread1() {

    }

    public DetailForThread1(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Делаю детали под номером " + " " + detail1 + " " + detail2 + " " + detail3 + " " + "Поток-"
                + this.number);

    }

}
