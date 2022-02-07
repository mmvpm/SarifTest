package com.cba.ytrewq;

public class Util {

    public int multiply(int a) {
        return multiply(a, a);
    }

    public int multiply(int a, int b) {
        return Math.multiplyExact(a, a);
    }
}
