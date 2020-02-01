package com.homework;

import java.util.concurrent.LinkedBlockingDeque;

public class MoveTask implements Runnable {

    private LinkedBlockingDeque<Integer> queue1;
    private LinkedBlockingDeque<Integer> result;

    public MoveTask(LinkedBlockingDeque<Integer> queue, LinkedBlockingDeque<Integer> result) {
        this.queue1 = queue;
        this.result = result;
    }

    @Override
    public void run() {
        while (moveElement())
            ;
    }

    public boolean moveElement() {
        Integer elem = queue1.pollFirst();

        if (elem != null) {
            result.add(elem);
            return true;
        }
        return false;
    }
}
