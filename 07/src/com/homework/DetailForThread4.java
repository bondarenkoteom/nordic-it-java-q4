package com.homework;

public class DetailForThread4 implements Runnable {

    private int detail11 = 11;
    private int detail12 = 12;
    private int detail13 = 13;
    private int detail14 = 14;
    private int detail15 = 15;

    private int number;

    public DetailForThread4() {

    }

    public DetailForThread4(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Делаю детали под номером " + " " + detail15 + " " + detail11 + " " + detail13 + " "
                + detail12 + " " + detail14 + " " + "Поток-" + this.number);
    }

}
