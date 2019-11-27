package com.homework;

import java.util.Scanner;

public class Calcularot {

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var c = input.nextLine();
        while (!c.equals("+") && !c.equals("-") && !c.equals("*") && !c.equals("div") && !c.equals("/")
                && !c.equals("mod") && !c.equals("^")) {
            System.out.println("Ввели непонятное значание, введите еще раз");
            c = input.nextLine();
        }
        var a = input.nextInt();
        var b = input.nextInt();

        switch (c) {
        case "+": {
            sumNumber(a, b);
            break;
        }
        case "-": {
            subNumber(a, b);
            break;
        }
        case "*": {
            multNumber(a, b);
            break;
        }
        case "div": {
            if (b == 0) {
                System.out.println("На ноль делить нельзя");
            } else {
                inDivNumber(a, b);
            }
            break;
        }
        case "/": {
            if (b == 0) {
                System.out.println("На ноль делить нельзя");
            } else {
                divNumber(a, b);
            }
            break;
        }
        case "mod": {
            if (b == 0) {
                System.out.println("На ноль делить нельзя");
            } else {
                remDivNumber(a, b);
            }
            break;
        }
        case "^": {
            if (b > 0) {
                squNumber(a, b);
            } else if (b < 0) {
                minSquNumber(a, b);
                break;
            }

        }
        }
    }

    public static void minSquNumber(int a, int b) {
        var n = 1;
        b *= -1;
        for (var i = 1; i <= b; i += 1)
            n = n * a;
        System.out.println(1 / (float) n);
    }

    public static void squNumber(int a, int b) {
        var n = 1;
        for (var i = 1; i <= b; i += 1)
            n = n * a;
        System.out.println(n);
    }

    public static void remDivNumber(int a, int b) {
        System.out.println("Остаток от деления");
        System.out.println(a % b);
    }

    public static void divNumber(int a, int b) {
        System.out.println("Деление");
        System.out.println((float) a / b);
    }

    public static void inDivNumber(int a, int b) {
        System.out.println("Целочисленое деление");
        System.out.println(a / b);
    }

    public static void multNumber(int a, int b) {
        System.out.println("Умножение");
        System.out.println(a * b);
    }

    public static void subNumber(int a, int b) {
        System.out.println("Вычитание");
        System.out.println(a - b);
    }

    public static void sumNumber(int a, int b) {
        System.out.println("Сложение");
        System.out.println(a + b);
    }
}
