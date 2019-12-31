package com.zoo.animals;

public class Cat extends Animal {

    public Cat(int age, String name, String color, int weight) {
        super(age, name, color, weight);

    }

    public void dirt() {
        System.out.println("Испачкалася");
    }

    public void think() {
        System.out.println("Думает об охоте на мышь");
    }

    @Override
    public void doing() {
        System.out.println("Умывается");

    }

    @Override
    public void say() {
        System.out.println("Мяу");

    }

    @Override
    public void feel() {
        System.out.println("Грустный");

    }

}
