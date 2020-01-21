package com.homework;

public class DetailForThread2 implements Runnable {

    private int detail4 = 4;
    private int detail5 = 5;
    private int detail6 = 6;
    private int detail7 = 7;
    private int detail8 = 8;

    private int number;

    public DetailForThread2() {

    }

    public DetailForThread2(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Делаю детали под номером " + " " + detail5 + " " + detail8 + " " + detail4 + " " + detail6
                + " " + detail7 + " " + "Поток-" + this.number);
    }

}
