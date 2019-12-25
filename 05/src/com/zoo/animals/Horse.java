package com.zoo.animals;

import com.zoo.Animals;

public class Horse extends Animals {

    private String bug;
    private String col;

    public String getBug() {
        return bug;
    }

    public void setBug(String bug) {
        this.bug = bug;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
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
