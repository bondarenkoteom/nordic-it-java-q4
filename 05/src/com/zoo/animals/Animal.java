package com.zoo.animals;

import com.zoo.exception.NegativeKgsException;

abstract public class Animal implements Doing, Speaking, Feeling {

    private int age;
    private String name;
    private String color;
    private int weight;

    public Animal() {

    }

    public Animal(int age, String name, String color, int weight) {
        this.age = age;
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public abstract void doing();

    public abstract void feel();

    public abstract void say();

    public int getWeight() {
        return weight;
    }

    private void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void eat(double kgs) throws NegativeKgsException {
        if (kgs < 0)
            throw new NegativeKgsException("Не может съесть отрицательное количество еды");
        else
            System.out.println("Съем " + kgs + " килограммa еды");
    }

    public void eat(String title) {
        System.out.println(title + " лучшая еда!");

    }

    public void eat(int kgs) throws NegativeKgsException {
        if (kgs < 0)
            throw new NegativeKgsException("Не может съесть отрицательное количество еды");
        else
            System.out.println("Съем " + kgs + " килограммa еды");
    }

}
