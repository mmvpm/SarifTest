package io.github.ideaseeker;

public class Main {

    public int[] divideAll(int[] array, int divisor) {
        for (int i = 0; i < array.length; ++i) {
            array[i] = divide(array[i], divisor);
        }
        return array;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}
