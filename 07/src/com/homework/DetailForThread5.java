package com.homework;

public class DetailForThread5 implements Runnable {

    private int detail16 = 16;
    private int detail17 = 17;
    private int detail18 = 18;
    private int detail19 = 19;

    private int number;

    public DetailForThread5() {

    }

    public DetailForThread5(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Делаю детали под номером " + " " + detail19 + " " + detail17 + " " + detail18 + " "
                + detail16 + "  " + "Поток-" + this.number);

    }

}
