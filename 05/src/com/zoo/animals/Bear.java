package com.zoo.animals;

public class Bear extends Animal {

    public Bear() {

    }

    public Bear(int age, String name, String color, int weight) {
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

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!super.equals(obj)) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        return true;
    }

}
