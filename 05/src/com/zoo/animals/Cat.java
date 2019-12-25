package com.zoo.animals;

import com.zoo.Animals;

public class Cat extends Animals {

    private String dirt;
    private String think;

    public String getDirt() {
        return dirt;
    }

    public void setDirt(String dirt) {
        this.dirt = dirt;
    }

    public String getThink() {
        return think;
    }

    public void setThink(String think) {
        this.think = think;
    }

    public void say() {
        System.out.println("Мяу1");
    }

    public void feel() {
        System.out.println("Грустный");
    }

    public void doing() {
        System.out.println("Умывается");
    }

}
