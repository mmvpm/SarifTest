package com.abc.qwerty;

public class Example {

    public int getByIndex(int[] array, int index) {
        int inverted = invert(index);
        return array[inverted];
    }

    private int invert(int index) {
        int inverted = 1 / index;
        return inverted + 1;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
