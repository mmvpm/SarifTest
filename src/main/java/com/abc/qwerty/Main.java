package com.abc.qwerty;

public class Main {
    public static int myFunction(int[] array, int index) {
        if (index == -2)
            throw new RuntimeException();
        int tmp = 1 / index;
        return array[index] + tmp;
    }
}
