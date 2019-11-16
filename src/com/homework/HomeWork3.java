package com.homework;

import java.util.Scanner;

public class HomeWork3 {

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
			System.out.println("Сложение");
			System.out.println(a + b);
			break;
		}
		case "-": {
			System.out.println("Вычитание");
			System.out.println(a - b);
			break;
		}
		case "*": {
			System.out.println("Умножение");
			System.out.println(a * b);
			break;
		}
		case "div": {
			if (b == 0) {
				System.out.println("На ноль делить нельзя");
			} else {
				System.out.println("Целочисленое деление");
				System.out.println(a / b);
			}
			break;
		}
		case "/": {
			if (b == 0) {
				System.out.println("На ноль делить нельзя");
			} else {
			System.out.println("Деление");
			System.out.println((float) a / b);
			}
			break;
		}
		case "mod": {
			if (b == 0) {
				System.out.println("На ноль делить нельзя");
			} else {
			System.out.println("Остаток от деления");
			System.out.println(a % b);
			}
			break;
		}
		case "^": {
			if (b > 0) {
				var n = 1;
				for (var i = 1; i <= b; i += 1)
					n = n * a;
				System.out.println(n);
			} else if (b < 0) {
				var n = 1;
				b *= -1;
				for (var i = 1; i <= b; i += 1)
					n = n * a;
				System.out.println(1 / (float) n);
				break;
			}

		}
		}
	}
}
