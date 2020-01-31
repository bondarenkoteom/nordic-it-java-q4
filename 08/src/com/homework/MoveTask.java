package com.homework;

import java.util.Vector;

public class MoveTask implements Runnable {

    private Vector<Integer> queue;
    private Vector<Integer> result;

    public MoveTask(Vector<Integer> queue, Vector<Integer> result) {
        this.queue = queue;
        this.result = result;
    }

    @Override
    public void run() {
        while (moveElement());
    }

    public boolean moveElement() {
        Integer elem;
        synchronized (MoveTask.class) {
            if (queue.isEmpty()) {
                return false;
            } else {
                elem = queue.remove(0);
            }
            result.add(elem);
            return true;
        }
    }
}
