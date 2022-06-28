package com.github.ideaseeker.util

import org.testng.annotations.Test

import org.testng.Assert.assertEquals
import org.testng.internal.junit.ArrayAsserts.assertArrayEquals

class UtilTest {
    ///region Test suites for executable com.github.ideaseeker.util.Util.multiply
    
    ///region SUCCESSFUL EXECUTIONS for method multiply(int, int)
    
    /**
    <pre>
    Test invokes:
 *     Math::multiplyExact once
 * returns from: {@code return Math.multiplyExact(x, y); }
 * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("multiply: MathMultiplyExact -> return Math.multiplyExact(x, y)")
    fun testMultiply_MathMultiplyExact() {
        val actual = Util.multiply(0, 0)
        
        assertEquals(actual, 0)
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.github.ideaseeker.util.Util.f
    
    ///region SUCCESSFUL EXECUTIONS for method f(int)
    
    /**
    <pre>
    Test returns from: {@code return 1 / a; }
 * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("f: -> return 1 / a")
    fun testF_Return1DivideA() {
        val util = Util()
        
        val actual = util.f(1)
        
        assertEquals(actual, 1)
    }
    ///endregion
    
    ///region ERROR SUITE for method f(int)
    
    /**
    <pre>
    Test 
 * throws ArithmeticException in: return 1 / a;
 * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("f: return 1 / a : True -> ThrowArithmeticException")
    fun testF_ThrowArithmeticException() {
        val util = Util()
        
        /* This test fails because executable under testing com.github.ideaseeker.util.Util.f
        produces Runtime exception java.lang.ArithmeticException: / by zero */
        util.f(0)
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.github.ideaseeker.util.Util.square
    
    ///region SUCCESSFUL EXECUTIONS for method square(int)
    
    /**
    <pre>
    Test invokes:
 *     Util::multiply once
 * returns from: {@code return multiply(a, a); }
 * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("square: UtilMultiply -> return multiply(a, a)")
    fun testSquare_UtilMultiply() {
        val actual = Util.square(-256)
        
        assertEquals(actual, 65536)
    }
    ///endregion
    
    ///region ERROR SUITE for method square(int)
    
    /**
    <pre>
    Test invokes:
 *     Util::multiply once
 * 
 * throws ArithmeticException in: return multiply(a, a);
 * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("square: return multiply(a, a) : True -> ThrowArithmeticException")
    fun testSquare_UtilMultiply_1() {
        /* This test fails because executable under testing com.github.ideaseeker.util.Util.square
        produces Runtime exception java.lang.ArithmeticException: integer overflow */
        Util.square(-525219835)
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.github.ideaseeker.util.Util.bubbleSort
    
    ///region SUCCESSFUL EXECUTIONS for method bubbleSort(int[])
    
    /**
    <pre>
    Test does not iterate {@code for(int i = 0; i < bound; ++i) }, returns from: {@code return array; }
 * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("bubbleSort: -> return array")
    fun testBubbleSort_ReturnArray() {
        val intArray = intArrayOf(-255)
        
        val actual = Util.bubbleSort(intArray)
        
        assertArrayEquals(actual, intArray)
    }
    
    /**
    <pre>
    Test iterates the loop {@code for(int i = 0; i < bound; ++i) } once. 
 * Test afterwards does not iterate {@code for(int j = i + 1; j < bound; ++j) }, iterates the loop {@code for(int i = 0; i < bound; ++i) } once,
 *     inside this loop, the test executes conditions:
 *     {@code (array[i] > array[i + 1]): True }
 * Test further returns from: {@code return array; }
 * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("bubbleSort: array[i] > array[i + 1] : True -> return array")
    fun testBubbleSort_IOfArrayGreaterThanI1OfArray() {
        val intArray = intArrayOf(3, 2)
        
        val actual = Util.bubbleSort(intArray)
        
        assertArrayEquals(actual, intArray)
    }
    
    /**
    <pre>
    Test iterates the loop {@code for(int i = 0; i < bound; ++i) } once. 
 * Test later does not iterate {@code for(int j = i + 1; j < bound; ++j) }, iterates the loop {@code for(int i = 0; i < bound; ++i) } once,
 *     inside this loop, the test executes conditions:
 *     {@code (array[i] > array[i + 1]): False }
 * Test afterwards returns from: {@code return array; }
 * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("bubbleSort: array[i] > array[i + 1] : False -> return array")
    fun testBubbleSort_IOfArrayLessOrEqualI1OfArray() {
        val intArray = intArrayOf(-255, -255)
        
        val actual = Util.bubbleSort(intArray)
        
        assertArrayEquals(actual, intArray)
    }
    ///endregion
    
    ///region ERROR SUITE for method bubbleSort(int[])
    
    /**
    <pre>
    Test 
 * throws NullPointerException in: int bound = array.length - 1;
 * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("bubbleSort: bound = array.length - 1 : True -> ThrowNullPointerException")
    fun testBubbleSort_ThrowNullPointerException() {
        /* This test fails because executable under testing com.github.ideaseeker.util.Util.bubbleSort
        produces Runtime exception java.lang.NullPointerException */
        Util.bubbleSort(null)
    }
    
    /**
    <pre>
    Test iterates the loop {@code for(int i = 0; i < bound; ++i) } once. 
 * Test afterwards does not iterate {@code for(int j = i + 1; j < bound; ++j) }, iterates the loop {@code for(int i = 0; i < bound; ++i) } once,
 *     inside this loop, the test executes conditions:
 *     {@code (array[i] > array[i + 1]): True }Test 
 * throws ArithmeticException in: int temp = 1 / array[1];
 * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("bubbleSort: temp = 1 / array[1] : True -> ThrowArithmeticException")
    fun testBubbleSort_ThrowArithmeticException() {
        val intArray = intArrayOf(1, 0)
        
        /* This test fails because executable under testing com.github.ideaseeker.util.Util.bubbleSort
        produces Runtime exception java.lang.ArithmeticException: / by zero */
        Util.bubbleSort(intArray)
    }
    
    /**
    <pre>
    Test iterates the loop {@code for(int i = 0; i < bound; ++i) } twice,
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
    //@org.junit.jupiter.api.DisplayName("bubbleSort: temp = 1 / array[1] : True -> ThrowArithmeticException")
    fun testBubbleSort_IOfArrayGreaterThanJOfArray() {
        val intArray = intArrayOf(0, -255, -1)
        
        /* This test fails because executable under testing com.github.ideaseeker.util.Util.bubbleSort
        produces Runtime exception java.lang.ArithmeticException: / by zero */
        Util.bubbleSort(intArray)
        
        val finalIntArray0 = intArray[0]
        val finalIntArray1 = intArray[1]
        
        assertEquals(finalIntArray0, -255)
        
        assertEquals(finalIntArray1, 0)
    }
    
    /**
    <pre>
    Test iterates the loop {@code for(int i = 0; i < bound; ++i) } twice,
 *     inside this loop, the test iterates the loop {@code for(int j = i + 1; j < bound; ++j) } once,
 *         inside this loop, the test executes conditions:
 *     {@code (array[i] > array[j]): False }
 * Test later iterates the loop {@code for(int i = 0; i < bound; ++i) } twice,
 *     inside this loop, the test executes conditions:
 *     {@code (array[i] > array[i + 1]): False }
 *     {@code (array[i] > array[i + 1]): True }
 * throws ArithmeticException in: int temp = 1 / array[1];
 * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("bubbleSort: temp = 1 / array[1] : True -> ThrowArithmeticException")
    fun testBubbleSort_IOfArrayLessOrEqualJOfArray() {
        val intArray = intArrayOf(0, 0, -1)
        
        /* This test fails because executable under testing com.github.ideaseeker.util.Util.bubbleSort
        produces Runtime exception java.lang.ArithmeticException: / by zero */
        Util.bubbleSort(intArray)
    }
    ///endregion
    
    ///endregion
    
}
