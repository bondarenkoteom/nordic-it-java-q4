package com.zoo.animals;

public class Baer extends Animal {

    public Baer(int age, String name, String color, int weight) {
        super(age, name, color, weight);
    }

    public void act() {
        System.out.println("Идет в берлогу");
    }

    public void paw() {
        System.out.println("Сосет лапу");
    }

    @Override
    public void doing() {
        System.out.println("Готовиться ко сну");

    }

    @Override
    public void say() {
        System.out.println("Хочу спать");

    }

    @Override
    public void feel() {
        System.out.println("Сердитый");

    }

}
