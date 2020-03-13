package com.zoo.animals;

import com.zoo.exception.MoreKmException;

public class Parrot extends Animal implements Flying {

    public Parrot() {

    }

    public Parrot(int age, String name, String color, int weight) {
        super(age, name, color, weight);

    }

    public void see() {
        System.out.println("Смотрит на посетителей");
    }

    public void regard() {
        System.out.println("Считает посетителей");
    }

    @Override
    public void doing() {
        System.out.println("Сидит на жердочке");

    }

    @Override
    public void say() {
        System.out.println("Кеша молодец");

    }

    @Override
    public void feel() {
        System.out.println("Довольный");
    }

    @Override
    public void fly(int km) throws MoreKmException {
        if (km > 5) {
            throw new MoreKmException("Не может пролететь такое количесво киллометров");
        } else {
            System.out.println("Хочу пролететь " + km + " киллометра");
        }

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!super.equals(obj)) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        return true;
    }

}
