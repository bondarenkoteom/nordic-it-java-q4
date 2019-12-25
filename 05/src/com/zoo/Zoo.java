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
        var dog = new Dog();
        dog.setName("Шарик");
        dog.setAge(5);
        dog.setColor("Черный");
        dog.setWeight(4);
        dog.feel();
        dog.setWant("Хочет есть");
        dog.setSearch("В поиске еды");
        System.out.println(dog.getAge());
        System.out.println(dog.getName());
        System.out.println(dog.getColor());
        System.out.println(dog.getWeight());
        System.out.println(dog.getWant());
        System.out.println(dog.getSearch());
        dog.doing();
        dog.say();

        System.out.println();

        var cat = new Cat();
        cat.setName("Мурзик");
        cat.setAge(6);
        cat.setColor("Рыжий");
        cat.setWeight(3);
        cat.setDirt("Испачкалася");
        cat.setThink("Думает об охоте на мышь");
        System.out.println(cat.getAge());
        System.out.println(cat.getName());
        System.out.println(cat.getColor());
        System.out.println(cat.getWeight());
        System.out.println(cat.getDirt());
        System.out.println(cat.getThink());
        cat.feel();
        cat.doing();
        cat.say();

        System.out.println();

        var bear = new Baer();
        bear.setName("Косолапый");
        bear.setAge(15);
        bear.setColor("Бурый");
        bear.setWeight(450);
        bear.setAct("Идет в берлогу");
        bear.setPaw("Сосет лапу");
        System.out.println(bear.getAge());
        System.out.println(bear.getName());
        System.out.println(bear.getColor());
        System.out.println(bear.getWeight());
        System.out.println(bear.getAct());
        System.out.println(bear.getPaw());
        bear.feel();
        bear.doing();
        bear.say();

        System.out.println();

        var parrot = new Parrot();
        parrot.setName("Кеша");
        parrot.setAge(2);
        parrot.setColor("Красный");
        parrot.setWeight(1);
        parrot.setSee("Смотрит на посетителей");
        parrot.setRegard("Считает посетителей");
        System.out.println(parrot.getAge());
        System.out.println(parrot.getName());
        System.out.println(parrot.getColor());
        System.out.println(parrot.getWeight());
        System.out.println(parrot.getSee());
        System.out.println(parrot.getRegard());
        parrot.feel();
        parrot.doing();
        parrot.say();

        System.out.println();

        var horse = new Horse();
        horse.setName("Плотва");
        horse.setAge(9);
        horse.setColor("Гнедая");
        horse.setWeight(500);
        horse.setBug("Пытается не застрять в текстурах");
        horse.setCol("Ищет седло");
        System.out.println(horse.getAge());
        System.out.println(horse.getName());
        System.out.println(horse.getColor());
        System.out.println(horse.getWeight());
        System.out.println(horse.getBug());
        System.out.println(horse.getCol());
        horse.feel();
        horse.doing();
        horse.say();

        System.out.println();

        var monkey = new Monkey();
        monkey.setName("Валера");
        monkey.setAge(3);
        monkey.setColor("Черно-белая");
        monkey.setWeight(5);
        monkey.setTree("Залез на дерево");
        monkey.setApple("Достал яблоко");
        System.out.println(monkey.getAge());
        System.out.println(monkey.getName());
        System.out.println(monkey.getColor());
        System.out.println(monkey.getWeight());
        System.out.println(monkey.getTree());
        System.out.println(monkey.getApple());
        monkey.feel();
        monkey.doing();
        monkey.say();

        System.out.println();

        var lion = new Lion();
        lion.setName("Рычун");
        lion.setAge(10);
        lion.setColor("Белый");
        lion.setWeight(150);
        lion.setFly("Достала муха");
        lion.setTail("Машет хвостом");
        System.out.println(lion.getAge());
        System.out.println(lion.getName());
        System.out.println(lion.getColor());
        System.out.println(lion.getWeight());
        System.out.println(lion.getFly());
        System.out.println(lion.getTail());
        lion.feel();
        lion.doing();
        lion.say();

    }

}
