package com.zoo.animals;

public class Animal {

    private int age;
    private String name;
    private String color;
    private int weight;

    public Animal(int age, String name, String color, int weight) {
        this.age = age;
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public void doing() {
        System.out.println();
    }

    public int getWeight() {
        return weight;
    }

    private void setWeight(int weight) {
        this.weight = weight;
    }

    public void say() {
        System.out.println();
    }

    public void feel() {
        System.out.println();
    }

    public String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
