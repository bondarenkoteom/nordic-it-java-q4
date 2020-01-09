package com.zoo.animals;

public class Cat1 extends Animal {

    public Cat1() {

    }

    public Cat1(int age, String name, String color, int weight) {
        super(age, name, color, weight);

    }

    public void dirt() {
        System.out.println("»спачкалас€");
    }

    public void think() {
        System.out.println("ƒумает об охоте на мышь");
    }

    @Override
    public void doing() {
        System.out.println("”мываетс€");

    }

    @Override
    public void feel() {
        System.out.println("√рустный");

    }

    @Override
    public void say() {
        System.out.println("ћ€у");

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        return true;
    }

}
