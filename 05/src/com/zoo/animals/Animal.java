package com.zoo.animals;

abstract public class Animal implements Doingable, Speaking, Feeling {

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

    public void eat(double kgs) {
        System.out.println("Съем " + kgs + " килограммa еды");
    }

    public void eat(String title) {
        System.out.println(title + " лучшая еда!");

    }

    public void eat(int kgs) {
        System.out.println("Съем " + kgs + " килограммa еды");
    }

}
