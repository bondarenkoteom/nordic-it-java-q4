package com.zoo.animals;

import com.zoo.Animals;

public class Monkey extends Animals {

    private String tree;
    private String apple;

    public String getTree() {
        return tree;
    }

    public void setTree(String tree) {
        this.tree = tree;
    }

    public String getApple() {
        return apple;
    }

    public void setApple(String apple) {
        this.apple = apple;
    }

    public void feel() {
        System.out.println("Спокойн1ый");
    }

    public void doing() {
        System.out.println("Кушает");
    }

    public void say() {
        System.out.println("Где бананы?");
    }
}
