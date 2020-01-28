package com.homework;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadDetail {

    public static void main(String[] args) throws InterruptedException {
        var count = new AtomicInteger(0);

        for (int i = 0; i < 20; i++) {
            int x = i;

            var thread1 = new Thread() {
                public void run() {
                    System.out.println(x);
                    count.getAndIncrement();
                    System.out.println("Поток - 1");
                }
            };

            var thread2 = new Thread() {
                public void run() {
                    System.out.println(x);
                    count.getAndIncrement();
                    System.out.println("Поток - 2");
                }
            };

            var thread3 = new Thread() {
                public void run() {
                    System.out.println(x);
                    count.getAndIncrement();
                    System.out.println("Поток - 3");
                }
            };

            var thread4 = new Thread() {
                public void run() {
                    System.out.println(x);
                    count.getAndIncrement();
                    System.out.println("Поток - 4");
                }
            };

            var thread5 = new Thread() {
                public void run() {
                    System.out.println(x);
                    count.getAndIncrement();
                    System.out.println("Поток - 5");
                }
            };

            var thread6 = new Thread() {
                public void run() {
                    System.out.println(x);
                    count.getAndIncrement();
                    System.out.println("Поток - 6");
                }
            };

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
}
