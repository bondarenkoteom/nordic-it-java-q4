package com.homework;

public class DetailForThread3 implements Runnable {

    private int detail9 = 9;
    private int detail10 = 10;

    private int number;

    public DetailForThread3() {

    }

    public DetailForThread3(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Делаю детали под номерам " + " " + detail9 + " " + detail10 + " " + "Поток-" + this.number);

    }

}
