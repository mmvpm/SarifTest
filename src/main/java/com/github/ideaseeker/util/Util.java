package com.github.ideaseeker.util;

public class Util {

    public static int square(int a) {
        return multiply(a, a);
    }

    public static int multiply(int a, int b) {
        return Math.multiplyExact(a, b);
    }

    public static int[] bubbleSort(int[] array) {
        int bound = array.length - 1;
        for (int i = 0; i < bound; ++i) {
            for (int j = i + 1; j < bound; ++j) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < bound; ++i) {
            if (array[i] > array[i + 1]) {
                int temp = 1 / array[0];
            }
        }
        return array;
    }
}

