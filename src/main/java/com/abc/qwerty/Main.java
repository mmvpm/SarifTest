package com.abc.qwerty;

import com.cba.ytrewq.Util;

public class Main {

    public static int example(Util util, boolean condition) {
        if (condition)
            return util.multiply(0);
        else
            return util.multiply(100000);
    }

    public static int getByIndex(int[] array, int index) {
        if (index == -2)
            throw new RuntimeException();
        int tmp = 1 / index;
        return array[index] + tmp;
    }

    public static void main(String[] args) {}
}
