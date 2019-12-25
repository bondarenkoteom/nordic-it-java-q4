package com.zoo.animals;

import com.zoo.Animals;

public class Parrot extends Animals {

    private String see;
    private String regard;

    public String getSee() {
        return see;
    }

    public void setSee(String see) {
        this.see = see;
    }

    public String getRegard() {
        return regard;
    }

    public void setRegard(String regard) {
        this.regard = regard;
    }

    public void say() {
        System.out.println("Кеша молодец");
    }

    public void feel() {
        System.out.println("Довольный");
    }

    public void doing() {
        System.out.println("Сидит на жердочке");
    }

}
