package com.zoo.animals;

import com.zoo.Animals;

public class Dog extends Animals {

    private String want;
    private String search;

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getWant() {
        return want;
    }

    public void setWant(String want) {
        this.want = want;
    }

    public void say() {
        System.out.println("Гав1");
    }

    public void feel() {
        System.out.println("Голодный");
    }

    public void doing() {
        System.out.println("Бегает");
    }
}