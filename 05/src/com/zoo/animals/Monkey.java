package com.zoo.animals;

public class Monkey extends Animal {

    public Monkey() {

    }

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
