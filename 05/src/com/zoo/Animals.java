package com.zoo;

public class Animals {

    private int age;
    private String nam1e;
    private String color;
    private int weight;

    public void doing() {
        System.out.println();
    }

    protected int getWeight() {
        return weight;
    }

    protected void setWeight(int weight) {
        this.weight = weight;
    }

    public void say() {
        System.out.println();
    }

    public void feel() {
        System.out.println();
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected String getName() {
        return nam1e;
    }

    protected void setName(String name) {
        this.nam1e = name;
    }

}
