package com.abc.qwerty;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExampleTest {
    ///region Test suites for executable com.abc.qwerty.Example.getByIndex

    ///region SUCCESSFUL EXECUTIONS for method getByIndex(int[], int)

    /**
     * <pre>
     * Test invokes:
     *     Example::invert once
     * returns from: {@code return array[inverted]; }
     * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("getByIndex: ExampleInvert -> return array[inverted]")
    public void testGetByIndex_ExampleInvert() throws Throwable {
        Example example = new Example();
        int[] array = new int[2];
        array[0] = -255;
        array[1] = -255;

        int actual = example.getByIndex(array, -128);

        assertEquals(-255, actual);
    }
    ///endregion

    ///region ERROR SUITE for method getByIndex(int[], int)

    /**
     * <pre>
     * Test
     * throws ArrayIndexOutOfBoundsException in: return array[inverted];
     * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("getByIndex: return array[inverted] : True -> ThrowArrayIndexOutOfBoundsException")
    public void testGetByIndex_ThrowArrayIndexOutOfBoundsException() throws Throwable {
        Example example = new Example();
        int[] array = new int[0];
        
        /* This test fails because executable under testing com.abc.qwerty.Example.getByIndex
         produces Runtime exception java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0 */
        example.getByIndex(array, 16);
    }

    /**
     * <pre>
     * Test
     * throws NullPointerException in: return array[inverted];
     * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("getByIndex: return array[inverted] : True -> ThrowNullPointerException")
    public void testGetByIndex_ThrowNullPointerException() throws Throwable {
        Example example = new Example();
        
        /* This test fails because executable under testing com.abc.qwerty.Example.getByIndex
         produces Runtime exception java.lang.NullPointerException */
        example.getByIndex(null, -255);
    }

    /**
     * <pre>
     * Test
     * throws ArithmeticException in: int inverted = invert(index);
     * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("getByIndex: inverted = invert(index) : True -> ThrowArithmeticException")
    public void testGetByIndex_ThrowArithmeticException() throws Throwable {
        Example example = new Example();
        
        /* This test fails because executable under testing com.abc.qwerty.Example.getByIndex
         produces Runtime exception java.lang.ArithmeticException: / by zero */
        example.getByIndex(null, 0);
    }
    ///endregion

    ///endregion

}
