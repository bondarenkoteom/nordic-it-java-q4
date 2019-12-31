package com.zoo.animals;

public class Parrot extends Animal {

    public Parrot(int age, String name, String color, int weight) {
        super(age, name, color, weight);

    }

    public void see() {
        System.out.println("Смотрит на посетителей");
    }

    public void regard() {
        System.out.println("Считает посетителей");
    }

    @Override
    public void doing() {
        System.out.println("Сидит на жердочке");

    }

    @Override
    public void say() {
        System.out.println("Кеша молодец");

    }

    @Override
    public void feel() {
        System.out.println("Довольный");
    }

}
