package com.homework;

import java.util.concurrent.LinkedBlockingDeque;

public class MoveTask implements Runnable {

    private LinkedBlockingDeque<Integer> queue;
    private LinkedBlockingDeque<Integer> result;

    public MoveTask(LinkedBlockingDeque<Integer> queue, LinkedBlockingDeque<Integer> result) {
        this.queue = queue;
        this.result = result;
    }

    @Override
    public void run() {
        while (moveElement())
            ;
    }

    public boolean moveElement() {
        Integer elem = queue.pollFirst();

        if (elem != null) {
            result.add(elem);
            return true;
        }
        return false;
    }
}
