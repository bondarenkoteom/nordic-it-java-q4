package com.homework;

import java.util.ArrayList;
import java.util.Vector;

public class ThreadQueue {

    public static void main(String[] args) throws InterruptedException {

        var queue = new Vector<Integer>();
        var result = new Vector<Integer>();

        for (var i = 1; i <= 2000; i++) {
            queue.add(i);
        }

        var threads = new ArrayList<Thread>();
        for (int i = 0; i < 4; i++) {
            threads.add(new Thread(new MoveTask(queue, result)));
        }

        for (var thread : threads) {
            thread.start();
        }

        for (var thread : threads) {
            thread.join();
        }

        System.out.println(queue.size());
        System.out.println(result);
        System.out.println(result.size());
    }

}
