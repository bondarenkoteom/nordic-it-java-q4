package com.zoo.animals;

import com.zoo.Animals;

public class Lion extends Animals {

    private String fly;
    private String tail;

    public String getFly() {
        return fly;
    }

    public void setFly(String fly) {
        this.fly = fly;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public void feel() {
        System.out.println("Агрессивн1ый");
    }

    public void doing() {
        System.out.println("Лежит");
    }

    public void say() {
        System.out.println("Я царь зверей");
    }
}
