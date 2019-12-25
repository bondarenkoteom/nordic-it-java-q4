package com.zoo.animals;

import com.zoo.Animals;

public class Baer extends Animals {

    private String act;
    private String paw;

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public String getPaw() {
        return paw;
    }

    public void setPaw(String paw) {
        this.paw = paw;
    }

    public void say() {
        System.out.println("Хочу спать");
    }

    public void feel() {
        System.out.println("Сердитый");
    }

    public void doing() {
        System.out.println("Готовиться ко сну");
    }

}
