package com.example;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var height = input.nextInt();
        var width = input.nextInt();
        var word = input.next();
        var posh = 1;
        var posw = 1;
        String c = word;
        var lenghtw = c.length();

        if (height % 2 == 0) {
            posh = (height / 2);
        } else if (height == 3) {
            posh = 2;
        } else if (posh == 1) {
            posh += 2;
        } else {
            posh = (height / 2) - 1;
        }
        if (width % 2 == 1) {
            posw = ((width - lenghtw) / 2);
        } else {
            posw = ((width - lenghtw) / 2) + 1;
            posw = 1;
        }
        if (c.length() > width - 2) {
            System.out.println("Error");
        }
        if (height <= 3 || width <= 3) {
            System.out.println("Error");
        } else {
            for (var i = 1; i <= height; i++) {
                if (i == 1 || i == height) {
                    for (var j = 0; j < width; j++) {
                        System.out.print("*");
                    }
                    System.out.println();

                } else {
                    for (var a = 0; a < width; a++) {
                        if (a == 0 || a == (width - 1)) {
                            System.out.print("*");
                            if (a == (width - 1)) {
                                System.out.println();
                            }
                        } else if (i == posh && a == posw) {
                            System.out.print(c);
                            a = a + lenghtw - 1;
                        } else {
                            System.out.print(" ");
                        }

                    }
                }
            }
        }
    }
}
