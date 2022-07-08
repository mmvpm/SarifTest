package io.github.ideaseeker.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class UtilTest {
    ///region Test suites for executable io.github.ideaseeker.util.Util.square

    ///region

    @Test
    @DisplayName("square: arg_0 > 0 -> return 1")
    public void testSquareReturnsOne() {
        int actual = Util.square(1);

        assertEquals(1, actual);
    }

    @Test
    @DisplayName("square: arg_0 = Int.MIN_VALUE -> throw ArithmeticException")
    public void testSquareThrowsAEWithCornerCase() {
        /* This test fails because executable under testing io.github.ideaseeker.util.Util.square
        produces Runtime exception java.lang.ArithmeticException: integer overflow */
        Util.square(Integer.MIN_VALUE);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable io.github.ideaseeker.util.Util.multiply

    ///region

    @Test
    @DisplayName("multiply: arg_0 < 0, y > 0 -> return -1")
    public void testMultiply() {
        int actual = Util.multiply(-1, 1);

        assertEquals(-1, actual);
    }

    @Test
    @DisplayName("multiply: arg_0 = Int.MIN_VALUE, y = Int.MAX_VALUE -> throw ArithmeticException")
    public void testMultiplyThrowsAEWithCornerCases() {
        /* This test fails because executable under testing io.github.ideaseeker.util.Util.multiply
        produces Runtime exception java.lang.ArithmeticException: integer overflow */
        Util.multiply(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable io.github.ideaseeker.util.Util.bubbleSort

    ///region

    @Test
    @DisplayName("bubbleSort: arg_0 = int[0]")
    public void testBubbleSortWithEmptyPrimitiveArray() {
        int[] intArray = {};

        int[] actual = Util.bubbleSort(intArray);

        assertArrayEquals(intArray, actual);
    }

    @Test
    @DisplayName("bubbleSort: arg_0 = int[10]")
    public void testBubbleSortWithNonEmptyPrimitiveArray() {
        int[] intArray = {
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0
        };

        int[] actual = Util.bubbleSort(intArray);

        assertArrayEquals(intArray, actual);
    }
    ///endregion

    ///region SUCCESSFUL EXECUTIONS for method bubbleSort(int[])

    /**
     * <pre>
     * Test iterates the loop {@code for(int i = 0; i < bound; ++i) } once.
     * Test further does not iterate {@code for(int j = i + 1; j < bound; ++j) }, iterates the loop {@code for(int i = 0; i < bound; ++i) } once,
     *     inside this loop, the test executes conditions:
     *     {@code (array[i] > array[i + 1]): True }
     * Test later returns from: {@code return array; }
     * </pre>
     */
    @Test
    @DisplayName("bubbleSort: array[i] > array[i + 1] : True -> return array")
    public void testBubbleSort_IOfArrayGreaterThanI1OfArray() {
        int[] intArray = {3, 2};

        int[] actual = Util.bubbleSort(intArray);

        assertArrayEquals(intArray, actual);
    }

    /**
     * <pre>
     * Test iterates the loop {@code for(int i = 0; i < bound; ++i) } once.
     * Test next does not iterate {@code for(int j = i + 1; j < bound; ++j) }, iterates the loop {@code for(int i = 0; i < bound; ++i) } once,
     *     inside this loop, the test executes conditions:
     *     {@code (array[i] > array[i + 1]): False }
     * Test then returns from: {@code return array; }
     * </pre>
     */
    @Test
    @DisplayName("bubbleSort: array[i] > array[i + 1] : False -> return array")
    public void testBubbleSort_IOfArrayLessOrEqualI1OfArray() {
        int[] intArray = {2, 2};

        int[] actual = Util.bubbleSort(intArray);

        assertArrayEquals(intArray, actual);
    }
    ///endregion

    ///region ERROR SUITE for method bubbleSort(int[])

    /**
     * <pre>
     * Test
     * throws NullPointerException in: int bound = array.length - 1;
     * </pre>
     */
    @Test
    @DisplayName("bubbleSort: bound = array.length - 1 : True -> ThrowNullPointerException")
    public void testBubbleSort_ThrowNullPointerException() {
        /* This test fails because executable under testing io.github.ideaseeker.util.Util.bubbleSort
        produces Runtime exception java.lang.NullPointerException */
        Util.bubbleSort(null);
    }

    /**
     * <pre>
     * Test iterates the loop {@code for(int i = 0; i < bound; ++i) } once.
     * Test then does not iterate {@code for(int j = i + 1; j < bound; ++j) }, iterates the loop {@code for(int i = 0; i < bound; ++i) } once,
     *     inside this loop, the test executes conditions:
     *     {@code (array[i] > array[i + 1]): True }Test
     * throws ArithmeticException in: int temp = 1 / array[1];
     * </pre>
     */
    @Test
    @DisplayName("bubbleSort: temp = 1 / array[1] : True -> ThrowArithmeticException")
    public void testBubbleSort_ThrowArithmeticException() {
        int[] intArray = {1, 0};
        
        /* This test fails because executable under testing io.github.ideaseeker.util.Util.bubbleSort
        produces Runtime exception java.lang.ArithmeticException: / by zero */
        Util.bubbleSort(intArray);
    }

    /**
     * <pre>
     * Test iterates the loop {@code for(int i = 0; i < bound; ++i) } twice,
     *     inside this loop, the test iterates the loop {@code for(int j = i + 1; j < bound; ++j) } once,
     *         inside this loop, the test executes conditions:
     *     {@code (array[i] > array[j]): True }
     * Test then iterates the loop {@code for(int i = 0; i < bound; ++i) } twice,
     *     inside this loop, the test executes conditions:
     *     {@code (array[i] > array[i + 1]): False }
     *     {@code (array[i] > array[i + 1]): True }
     * throws ArithmeticException in: int temp = 1 / array[1];
     * </pre>
     */
    @Test
    @DisplayName("bubbleSort: temp = 1 / array[1] : True -> ThrowArithmeticException")
    public void testBubbleSort_IOfArrayGreaterThanJOfArray() {
        int[] intArray = {0, -255, -1};
        
        /* This test fails because executable under testing io.github.ideaseeker.util.Util.bubbleSort
        produces Runtime exception java.lang.ArithmeticException: / by zero */
        Util.bubbleSort(intArray);

        int finalIntArray0 = intArray[0];
        int finalIntArray1 = intArray[1];

        assertEquals(-255, finalIntArray0);

        assertEquals(0, finalIntArray1);
    }

    /**
     * <pre>
     * Test iterates the loop {@code for(int i = 0; i < bound; ++i) } twice,
     *     inside this loop, the test iterates the loop {@code for(int j = i + 1; j < bound; ++j) } once,
     *         inside this loop, the test executes conditions:
     *     {@code (array[i] > array[j]): False }
     * Test next iterates the loop {@code for(int i = 0; i < bound; ++i) } twice,
     *     inside this loop, the test executes conditions:
     *     {@code (array[i] > array[i + 1]): False }
     *     {@code (array[i] > array[i + 1]): True }
     * throws ArithmeticException in: int temp = 1 / array[1];
     * </pre>
     */
    @Test
    @DisplayName("bubbleSort: temp = 1 / array[1] : True -> ThrowArithmeticException")
    public void testBubbleSort_IOfArrayLessOrEqualJOfArray() {
        int[] intArray = {0, 0, -1};
        
        /* This test fails because executable under testing io.github.ideaseeker.util.Util.bubbleSort
        produces Runtime exception java.lang.ArithmeticException: / by zero */
        Util.bubbleSort(intArray);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable io.github.ideaseeker.util.Util.f

    ///region

    @Test
    @DisplayName("f: a > 0 -> return 1")
    public void testFReturnsOne() {
        Util util = new Util();

        int actual = util.f(1);

        assertEquals(1, actual);
    }

    @Test
    @DisplayName("f: a = 0 -> throw ArithmeticException")
    public void testFThrowsAEWithCornerCase() {
        Util util = new Util();
        
        /* This test fails because executable under testing io.github.ideaseeker.util.Util.f
        produces Runtime exception java.lang.ArithmeticException: / by zero */
        util.f(0);
    }
    ///endregion

    ///endregion

}
