package com.zoo.animals;

public class Horse extends Animal {

    public Horse(int age, String name, String color, int weight) {
        super(age, name, color, weight);
    }

    public void bug() {
        System.out.println("Пытается не застрять в текстурах");
    }

    public void col() {
        System.out.println("Ищет седло");
    }

    public void feel() {
        System.out.println("Веселая");
    }

    public void doing() {
        System.out.println("Скачет");
    }

    public void say() {
        System.out.println("Где Геральт?");
    }
}
