package com.zoo;

import com.zoo.animals.Dog;

public class Zoo {

    public static void main(String[] args) {
        Animals dog = new Dog();
        dog.setName("�����");
        dog.setAge(5);
        dog.setColor("������");
        dog.setWeight(4);
        System.out.println(dog.getAge());
        System.out.println(dog.getName());
        System.out.println(dog.getColor());
        System.out.println(dog.getWeight());
        dog.feel();
        dog.doing();
        dog.say();

        System.out.println();

        Animals cat = new Cat();
        cat.setName("������");
        cat.setAge(6);
        cat.setColor("�����");
        cat.setWeight(3);
        System.out.println(cat.getAge());
        System.out.println(cat.getName());
        System.out.println(cat.getColor());
        System.out.println(cat.getWeight());
        cat.feel();
        cat.doing();
        cat.say();

        System.out.println();

        Animals bear = new Baer();
        bear.setName("���������");
        bear.setAge(15);
        bear.setColor("�����");
        bear.setWeight(450);
        System.out.println(bear.getAge());
        System.out.println(bear.getName());
        System.out.println(bear.getColor());
        System.out.println(bear.getWeight());
        bear.feel();
        bear.doing();
        bear.say();

        System.out.println();

        Animals parrot = new Parrot();
        parrot.setName("����");
        parrot.setAge(2);
        parrot.setColor("�������");
        parrot.setWeight(1);
        System.out.println(parrot.getAge());
        System.out.println(parrot.getName());
        System.out.println(parrot.getColor());
        System.out.println(parrot.getWeight());
        parrot.feel();
        parrot.doing();
        parrot.say();

        System.out.println();

        Animals horse = new Horse();
        horse.setName("������");
        horse.setAge(9);
        horse.setColor("������");
        horse.setWeight(500);
        System.out.println(horse.getAge());
        System.out.println(horse.getName());
        System.out.println(horse.getColor());
        System.out.println(horse.getWeight());
        horse.feel();
        horse.doing();
        horse.say();

        System.out.println();

        Animals monkey = new Monkey();
        monkey.setName("������");
        monkey.setAge(3);
        monkey.setColor("�����-�����");
        monkey.setWeight(5);
        System.out.println(monkey.getAge());
        System.out.println(monkey.getName());
        System.out.println(monkey.getColor());
        System.out.println(monkey.getWeight());
        monkey.feel();
        monkey.doing();
        monkey.say();

        System.out.println();

        Animals lion = new Lion();
        lion.setName("�����");
        lion.setAge(10);
        lion.setColor("�����");
        lion.setWeight(150);
        System.out.println(lion.getAge());
        System.out.println(lion.getName());
        System.out.println(lion.getColor());
        System.out.println(lion.getWeight());
        lion.feel();
        lion.doing();
        lion.say();

    }

}
