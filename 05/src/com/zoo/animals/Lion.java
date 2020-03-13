package com.zoo.animals;

public class Lion extends Animal {

    public Lion() {

    }

    public Lion(int age, String name, String color, int weight) {
        super(age, name, color, weight);
    }

    public void fly() {
        System.out.println("Достала муха");
    }

    public void tail() {
        System.out.println("Машет хвостом");
    }

    @Override
    public void doing() {
        System.out.println("Лежит");
    }

    @Override
    public void say() {
        System.out.println("Я царь зверей");

    }

    @Override
    public void feel() {
        System.out.println("Агрессивный");

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
