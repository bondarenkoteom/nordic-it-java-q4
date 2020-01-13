package com.homework;

public class IntArray implements Comparable<IntArray> {

    private Integer[] array;

    public IntArray() {

    }

    public IntArray(Integer[] array) {

        this.array = array;
    }

    public Integer[] getArray() {
        return array;
    }

    public void setArray(Integer[] array) {
        this.array = array;
    }

    public Integer getMaxi() {
        var getMax = array[0];
        for (var i = 0; i < array.length; i++) {
            if (getMax < array[i]) {
                getMax = array[i];
            }

        }
        return getMax;

    }

    public Integer getMini() {
        var getMin = array[0];
        for (var i = 0; i < array.length; i++) {
            if (getMin > array[i]) {
                getMin = array[i];
            }
        }
        return getMin;

    }

    @Override
    public int compareTo(IntArray o) {
        Integer a = this.getMaxi() - this.getMini();
        return a.compareTo(o.getMaxi() - o.getMini());
    }

}
