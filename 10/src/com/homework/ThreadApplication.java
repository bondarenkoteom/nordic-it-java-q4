package com.homework;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ThreadApplication {

    public static void main(String[] args) throws InterruptedException {

        var sum = new ArrayBlockingQueue<Integer>(2000);
        var randomSum = new Random();
        for (var i = 1; i <= 2000; i++) {
            sum.add(randomSum.nextInt(Integer.MAX_VALUE));

        }

        var executor = Executors.newFixedThreadPool(4);
        var count = 0;
        var randomListSumFuture = new ArrayList<Future<Integer>>();
        for (int i = 0; i < 4; i++) {
            var ListSum = executor.submit(new SumCallable(sum));
            randomListSumFuture.add(ListSum);
        }

        for (var ListSum : randomListSumFuture) {
            try {
                var countSum = ListSum.get();
                System.out.println(countSum);
                count += countSum;
            } catch (ExecutionException e) {
                return;
            }

        }

    }
}
