package com.abc.qwerty;

import com.cba.ytrewq.Util;

public class Main {

    public enum Number {
        ZERO,
        NONZERO
    }

    public static int example(Util util, Number condition) {
        switch (condition) {
            case ZERO:
                return util.multiply(0);
            case NONZERO:
                return util.multiply(100000);
            default:
                return 0;
        }
    }

    public static int getByIndex(int[] array, int index) {
        if (index == -2)
            throw new RuntimeException();
        int tmp = 1 / index;
        return array[index] + tmp;
    }

    public static void main(String[] args) {

    }
}
