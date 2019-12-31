package com.zoo.animals;

public class Dog extends Animal {

    public Dog(int age, String name, String color, int weight) {
        super(age, name, color, weight);
    }

    public void want() {
        System.out.println("Хочет есть");
    }

    public void search() {
        System.out.println("В поиске еды");
    }

    @Override
    public void doing() {
        System.out.println("Бегает");

    }

    @Override
    public void say() {
        System.out.println("Гав");

    }

    @Override
    public void feel() {
        System.out.println("Голодный");

    }

}