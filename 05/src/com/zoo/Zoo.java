package com.zoo;

import com.zoo.animals.Bear;
import com.zoo.animals.Cat;
import com.zoo.animals.Dog;
import com.zoo.animals.Horse;
import com.zoo.animals.Lion;
import com.zoo.animals.Monkey;
import com.zoo.animals.Parrot;
import com.zoo.exception.MoreKmException;
import com.zoo.exception.NegativeKgsException;

public class Zoo {

    public static void main(String[] args) throws NegativeKgsException, MoreKmException {
        var dog = new Dog(5, "Шарик", "Черный", 4);
        System.out.println(dog.getAge());
        System.out.println(dog.getName());
        System.out.println(dog.getColor());
        System.out.println(dog.getWeight());
        dog.doing();
        dog.say();
        dog.feel();
        dog.want();
        dog.search();
        try {
            dog.eat(-1.5);
        }

        catch (NegativeKgsException me) {
            System.out.println(me.getMessage());
        }

        finally {
            System.out.println("Ввести верное значение");
        }

        dog.eat("Чапи");

        System.out.println();

        var cat = new Cat(6, "Мурзик", "Рыжий", 3);
        System.out.println(cat.getAge());
        System.out.println(cat.getName());
        System.out.println(cat.getColor());
        System.out.println(cat.getWeight());
        cat.dirt();
        cat.feel();
        cat.doing();
        cat.say();
        cat.think();
        cat.eat(0.5);
        cat.eat("Вискас");

        System.out.println();

        var bear = new Bear(15, "Косолапый", "Бурый", 450);
        System.out.println(bear.getAge());
        System.out.println(bear.getName());
        System.out.println(bear.getColor());
        System.out.println(bear.getWeight());
        bear.feel();
        bear.act();
        bear.doing();
        bear.say();
        bear.paw();
        bear.eat(15);
        bear.eat("Мед");

        System.out.println();

        var parrot = new Parrot(2, "Кеша", "Красный", 1);
        System.out.println(parrot.getAge());
        System.out.println(parrot.getName());
        System.out.println(parrot.getColor());
        System.out.println(parrot.getWeight());
        parrot.feel();
        parrot.doing();
        parrot.say();
        parrot.see();
        parrot.regard();
        parrot.eat(0.1);
        parrot.eat("Морковь");
        try {
            parrot.fly(6);
        }

        catch (MoreKmException fl) {
            System.out.println(fl.getMessage());
        }

        finally {
            System.out.println("Ввести верное значение");
        }

        System.out.println();

        var horse = new Horse(9, "Плотва", "Гнедая", 500);
        System.out.println(horse.getAge());
        System.out.println(horse.getName());
        System.out.println(horse.getColor());
        System.out.println(horse.getWeight());
        horse.feel();
        horse.bug();
        horse.col();
        horse.doing();
        horse.say();
        try {
            horse.eat(-5);
        }

        catch (NegativeKgsException mee) {
            System.out.println(mee.getMessage());
        }

        finally {
            System.out.println("Ввести верное значение");
        }

        horse.eat("Овес");

        System.out.println();

        var monkey = new Monkey(3, "Валера", "Черно-белая", 5);
        System.out.println(monkey.getAge());
        System.out.println(monkey.getName());
        System.out.println(monkey.getColor());
        System.out.println(monkey.getWeight());
        monkey.feel();
        monkey.tree();
        monkey.apple();
        monkey.doing();
        monkey.say();
        monkey.eat(0.2);
        monkey.eat("Бананы");

        System.out.println();

        var lion = new Lion(10, "Рычун", "Белый", 150);
        System.out.println(lion.getAge());
        System.out.println(lion.getName());
        System.out.println(lion.getColor());
        System.out.println(lion.getWeight());
        lion.fly();
        lion.tail();
        lion.feel();
        lion.doing();
        lion.say();
        lion.eat(25.6);
        lion.eat("Мясо");

    }

}
