package com.homework;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class ThreadApi {

    public static void main(String[] args) throws InterruptedException {

        var queue = new LinkedBlockingDeque<Integer>();
        var result = new LinkedBlockingDeque<Integer>();

        var executor = Executors.newFixedThreadPool(4);

        for (var i = 1; i <= 2000; i++) {
            queue.add(i);
        }

        for (int i = 0; i < 4; i++) {
            executor.execute(new Thread(new MoveTask(queue, result)));
        }

        executor.awaitTermination(5, TimeUnit.SECONDS);

        System.out.println(queue.size());
        System.out.println(result);
        System.out.println(result.size());
    }

}