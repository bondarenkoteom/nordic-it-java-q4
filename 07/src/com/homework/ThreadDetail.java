package com.homework;

public class ThreadDetail {

    public static void main(String[] args) throws InterruptedException {

        var thread1 = new Thread(new DetailForThread1(1));
        var thread2 = new Thread(new DetailForThread2(2));
        var thread3 = new Thread(new DetailForThread3(3));
        var thread4 = new Thread(new DetailForThread4(4));
        var thread5 = new Thread(new DetailForThread5(5));
        var thread6 = new Thread(new DetailForThread6(6));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        thread3.start();
        thread3.join();

        thread4.start();
        thread5.start();

        thread4.join();
        thread5.join();

        thread6.start();

    }

}
