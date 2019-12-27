package com.zoo.animals;

public class Lion extends Animal {

    public Lion(int age, String name, String color, int weight) {
        super(age, name, color, weight);
    }

    public void fly() {
        System.out.println("Достала муха");
    }

    public void tail() {
        System.out.println("Машет хвостом");
    }

    public void feel() {
        System.out.println("Агрессивный");
    }

    public void doing() {
        System.out.println("Лежит");
    }

    public void say() {
        System.out.println("Я царь зверей");
    }
}
