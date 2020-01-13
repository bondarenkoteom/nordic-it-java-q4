package com.homework;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {

        var array1 = new IntArray(new Integer[] { 1, 2, 3, 4 });
        var array2 = new IntArray(new Integer[] { 3, 15, 15, 7 });
        var array3 = new IntArray(new Integer[] { 1, 2, 3, 5 });
        var array4 = new IntArray(new Integer[] { 0, 0, 0, 0 });
        ArrayList<IntArray> arrayMain = new ArrayList<IntArray>();
        arrayMain.add(array1);
        arrayMain.add(array2);
        arrayMain.add(array3);
        arrayMain.add(array4);
        Collections.sort(arrayMain);

        for (IntArray array : arrayMain) {
            for (int a : array.getArray()) {
                System.out.print(a);

            }
            System.out.println();
        }

    }

}
