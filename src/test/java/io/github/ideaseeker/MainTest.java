package io.github.ideaseeker;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    ///region Test suites for executable io.github.ideaseeker.Main.isSorted

    ///region

    @Test
    @DisplayName("isSorted: array = int[0] -> return true")
    public void testIsSortedReturnsTrueWithEmptyPrimitiveArray() {
        Main main = new Main();
        int[] intArray = {};

        boolean actual = main.isSorted(intArray);

        assertTrue(actual);
    }

    @Test
    @DisplayName("isSorted: array = int[10] -> throw ArrayIndexOutOfBoundsException")
    public void testIsSortedThrowsAIOOBEWithNonEmptyPrimitiveArray() {
        Main main = new Main();
        int[] intArray = {
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0
        };
        
        /* This test fails because executable under testing io.github.ideaseeker.Main.isSorted
        produces Runtime exception java.lang.ArrayIndexOutOfBoundsException: 10 */
        main.isSorted(intArray);
    }
    ///endregion

    ///region SUCCESSFUL EXECUTIONS for method isSorted(int[])

    /**
     * <pre>
     * Test iterates the loop {@code for(int i = 0; i < array.length; ++i) } once,
     *     inside this loop, the test executes conditions:
     *     {@code (array[i] > array[i + 1]): True }
     * returns from: {@code return false; }</pre>
     */
    @Test
    @DisplayName("isSorted: array[i] > array[i + 1] : True -> return false")
    public void testIsSorted_IOfArrayGreaterThanI1OfArray() {
        Main main = new Main();
        int[] intArray = {
                -253, -254, -255, -255, -255, -255, -255, -255,
                -255
        };

        boolean actual = main.isSorted(intArray);

        assertFalse(actual);
    }
    ///endregion

    ///region ERROR SUITE for method isSorted(int[])

    /**
     * <pre>
     * Test
     * throws NullPointerException in: for(int i = 0; i < array.length; ++i)
     * </pre>
     */
    @Test
    @DisplayName("isSorted: for(int i = 0 i < array.length ++i) -> ThrowNullPointerException")
    public void testIsSorted_ThrowNullPointerException() {
        Main main = new Main();
        
        /* This test fails because executable under testing io.github.ideaseeker.Main.isSorted
        produces Runtime exception java.lang.NullPointerException */
        main.isSorted(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable io.github.ideaseeker.Main.square

    ///region

    @Test
    @DisplayName("square: arg_0 > 0 -> return 1")
    public void testSquareReturnsOne() {
        int actual = Main.square(1);

        assertEquals(1, actual);
    }

    @Test
    @DisplayName("square: arg_0 = Int.MIN_VALUE -> throw ArithmeticException")
    public void testSquareThrowsAEWithCornerCase() {
        /* This test fails because executable under testing io.github.ideaseeker.Main.square
        produces Runtime exception java.lang.ArithmeticException: integer overflow */
        Main.square(Integer.MIN_VALUE);
    }
    ///endregion

    ///endregion

}
