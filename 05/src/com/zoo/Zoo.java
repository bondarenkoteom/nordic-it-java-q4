package com.zoo;

import com.zoo.animals.Baer;
import com.zoo.animals.Cat;
import com.zoo.animals.Dog;
import com.zoo.animals.Horse;
import com.zoo.animals.Lion;
import com.zoo.animals.Monkey;
import com.zoo.animals.Parrot;

public class Zoo {

    public static void main(String[] args) {
        var dog = new Dog(5, "Шарик", "Черный", 4);
//        dog.setName("Шарик");
//        dog.setAge(5);
//        dog.setColor("Черный");
//        dog.setWeight(4);
        System.out.println(dog.getAge());
        System.out.println(dog.getName());
        System.out.println(dog.getColor());
        System.out.println(dog.getWeight());
        dog.doing();
        dog.say();
        dog.feel();
        dog.want();
        dog.search();

        System.out.println();

        var cat = new Cat(6, "Мурзик", "Рыжий", 3);
//        cat.setName(Мурзик");
//        cat.setAge(6);
//        cat.setColor("Рыжий");
//        cat.setWeight(3);
        System.out.println(cat.getAge());
        System.out.println(cat.getName());
        System.out.println(cat.getColor());
        System.out.println(cat.getWeight());
        cat.dirt();
        cat.feel();
        cat.doing();
        cat.say();
        cat.think();

        System.out.println();

        var bear = new Baer(15, "Косолапый", "Бурый", 450);
//        bear.setName("Косолапый");
//        bear.setAge(15);
//        bear.setColor("Бурый");
//        bear.setWeight(450);
        System.out.println(bear.getAge());
        System.out.println(bear.getName());
        System.out.println(bear.getColor());
        System.out.println(bear.getWeight());
        bear.feel();
        bear.act();
        bear.doing();
        bear.say();
        bear.paw();

        System.out.println();

        var parrot = new Parrot(2, "Кеша", "Красный", 1);
//        parrot.setName("Кеша");
//        parrot.setAge(2);
//        parrot.setColor("Красный");
//        parrot.setWeight(1);
        System.out.println(parrot.getAge());
        System.out.println(parrot.getName());
        System.out.println(parrot.getColor());
        System.out.println(parrot.getWeight());
        parrot.feel();
        parrot.doing();
        parrot.say();
        parrot.see();
        parrot.regard();

        System.out.println();

        var horse = new Horse(9, "Плотва", "Гнедая", 500);
//        horse.setName("Плотва");
//        horse.setAge(9);
//        horse.setColor("Гнедая");
//        horse.setWeight(500);
        System.out.println(horse.getAge());
        System.out.println(horse.getName());
        System.out.println(horse.getColor());
        System.out.println(horse.getWeight());
        horse.feel();
        horse.bug();
        horse.col();
        horse.doing();
        horse.say();

        System.out.println();

        var monkey = new Monkey(3, "Валера", "Черно-белая", 5);
//        monkey.setName("Валера");
//        monkey.setAge(3);
//        monkey.setColor("Черно-белая");
//        monkey.setWeight(5);
        System.out.println(monkey.getAge());
        System.out.println(monkey.getName());
        System.out.println(monkey.getColor());
        System.out.println(monkey.getWeight());
        monkey.feel();
        monkey.tree();
        monkey.apple();
        monkey.doing();
        monkey.say();

        System.out.println();

        var lion = new Lion(10, "Рычун", "Белый", 150);
//        lion.setName("Рычун");
//        lion.setAge(10);
//        lion.setColor("Белый");
//        lion.setWeight(150);
        System.out.println(lion.getAge());
        System.out.println(lion.getName());
        System.out.println(lion.getColor());
        System.out.println(lion.getWeight());
        lion.fly();
        lion.tail();
        lion.feel();
        lion.doing();
        lion.say();

    }

}
