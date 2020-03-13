package com.zoo.animals;

import com.zoo.exception.NegativeKgsException;

public abstract class Animal implements Doing, Speaking, Feeling {

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

    public void eat(double kgs) throws NegativeKgsException {
        if (kgs < 0) {
            throw new NegativeKgsException("Не может съесть отрицательное количество еды");
        } else {
            System.out.println("Съем " + kgs + " килограммa еды");
        }

    }

    public void eat(String title) {
        System.out.println(title + " лучшая еда!");

    }

    public void eat(int kgs) throws NegativeKgsException {
        if (kgs < 0) {
            throw new NegativeKgsException("Не может съесть отрицательное количество еды");
        } else {
            System.out.println("Съем " + kgs + " килограммa еды");
        }

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + weight;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Animal other = (Animal) obj;
        if (age != other.age) {
            return false;
        }

        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (weight != other.weight)
            return false;
        return true;
    }

}
