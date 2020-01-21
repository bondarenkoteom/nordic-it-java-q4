package com.homework;

public class DetailForThread6 implements Runnable {

    private int detail20 = 20;

    private int number;

    public DetailForThread6() {

    }

    public DetailForThread6(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Делаю детали под номером" + " " + detail20 + " " + "Поток-" + this.number);

    }

}
