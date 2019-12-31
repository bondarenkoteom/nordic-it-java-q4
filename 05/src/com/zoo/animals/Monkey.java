package com.zoo.animals;

public class Monkey extends Animal {

    public Monkey(int age, String name, String color, int weight) {
        super(age, name, color, weight);
    }

    public void tree() {
        System.out.println("Залез на дерево");
    }

    public void apple() {
        System.out.println("Достал яблоко");
    }

    @Override
    public void doing() {
        System.out.println("Скачет");

    }

    @Override
    public void say() {
        System.out.println("Где бананы?");

    }

    @Override
    public void feel() {
        System.out.println("Спокойный");

    }
}
