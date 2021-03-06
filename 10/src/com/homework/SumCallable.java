package com.homework;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;

public class SumCallable implements Callable<Integer> {

    private ArrayBlockingQueue<Integer> sum;

    public SumCallable(ArrayBlockingQueue<Integer> sum) {
        this.sum = sum;

    }

    @Override
    public Integer call() throws Exception {
        var sumFinal = 0;
        for (var i = 0; i < sum.size(); i++) {
            if (sum.isEmpty()) {
                return sumFinal;
            } else {
                sumFinal = sumFinal + sum.poll();
            }

        }
        return sumFinal;
    }

}
