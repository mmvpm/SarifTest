package com.abc.qwerty;

import org.junit.Test;
import com.cba.ytrewq.Util;

import static org.junit.Assert.assertEquals;

public class MainTest {
    ///region SUCCESSFUL EXECUTIONS for method main(java.lang.String[])
    
    /**
    <pre>
    Test returns from: {@code public static void main(String[] args) {
 * } }
 * </pre>
     */
    @Test(timeout = 10000)
    //@org.junit.jupiter.api.DisplayName("main: -> public static void main(String[] args) { }")
    public void testMain_Return() throws Throwable  {
        Main.main(null);
    }
    ///endregion
    
    ///region SUCCESSFUL EXECUTIONS for method example(com.cba.ytrewq.Util, boolean)
    
    /**
    <pre>
    Test executes conditions:
 *     {@code (condition): True }
 * invokes:
 *     Util::multiply once
 * returns from: {@code return util.multiply(0); }
 * </pre>
     */
    @Test(timeout = 10000)
    //@org.junit.jupiter.api.DisplayName("example: condition : True -> return util.multiply(0)")
    public void testExample_Condition() throws Throwable  {
        Util util = new Util();
        
        int actual = Main.example(util, true);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region ERROR SUITE for method example(com.cba.ytrewq.Util, boolean)
    
    /**
    <pre>
    Test executes conditions:
 *     {@code (condition): True }
 * invokes:
 *     Util::multiply once
 * 
 * throws NullPointerException in: return util.multiply(0);
 * </pre>
     */
    @Test(timeout = 10000, expected = NullPointerException.class)
    //@org.junit.jupiter.api.DisplayName("example: return util.multiply(0) : True -> ThrowNullPointerException")
    public void testExample_Condition_1() throws Throwable  {
        Main.example(null, true);
    }
    
    /**
    <pre>
    Test executes conditions:
 *     {@code (condition): False }
 * invokes:
 *     Util::multiply once
 * 
 * throws NullPointerException in: return util.multiply(100000);
 * </pre>
     */
    @Test(timeout = 10000, expected = NullPointerException.class)
    //@org.junit.jupiter.api.DisplayName("example: return util.multiply(100000) : True -> ThrowNullPointerException")
    public void testExample_UtilMultiply() throws Throwable  {
        Main.example(null, false);
    }
    
    /**
    <pre>
    Test executes conditions:
 *     {@code (condition): False }
 * invokes:
 *     Util::multiply once
 * 
 * throws ArithmeticException in: return util.multiply(100000);
 * </pre>
     */
    @Test(timeout = 10000, expected = ArithmeticException.class)
    //@org.junit.jupiter.api.DisplayName("example: return util.multiply(100000) : True -> ThrowArithmeticException")
    public void testExample_UtilMultiply_1() throws Throwable  {
        Util util = new Util();
        
        Main.example(util, false);
    }
    ///endregion
    
    ///region SUCCESSFUL EXECUTIONS for method getByIndex(int[], int)
    
    /**
    <pre>
    Test executes conditions:
 *     {@code (index == -2): False }
 * returns from: {@code return array[index] + tmp; }
 * </pre>
     */
    @Test(timeout = 10000)
    //@org.junit.jupiter.api.DisplayName("getByIndex: index == -2 : False -> return array[index] + tmp")
    public void testGetByIndex_IndexNotEqualsNegative2() throws Throwable  {
        int[] intArray = new int[2];
        intArray[0] = 1;
        intArray[1] = 1;
        
        int actual = Main.getByIndex(intArray, 1);
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///region ERROR SUITE for method getByIndex(int[], int)
    
    /**
    <pre>
    Test 
 * throws ArithmeticException in: int tmp = 1 / index;
 * </pre>
     */
    @Test(timeout = 10000, expected = ArithmeticException.class)
    //@org.junit.jupiter.api.DisplayName("getByIndex: tmp = 1 / index : True -> ThrowArithmeticException")
    public void testGetByIndex_ThrowArithmeticException() throws Throwable  {
        Main.getByIndex(null, 0);
    }
    
    /**
    <pre>
    Test 
 * throws NullPointerException in: return array[index] + tmp;
 * </pre>
     */
    @Test(timeout = 10000, expected = NullPointerException.class)
    //@org.junit.jupiter.api.DisplayName("getByIndex: return array[index] + tmp : True -> ThrowNullPointerException")
    public void testGetByIndex_ThrowNullPointerException() throws Throwable  {
        Main.getByIndex(null, -255);
    }
    
    /**
    <pre>
    Test 
 * throws ArrayIndexOutOfBoundsException in: return array[index] + tmp;
 * </pre>
     */
    @Test(timeout = 10000, expected = ArrayIndexOutOfBoundsException.class)
    //@org.junit.jupiter.api.DisplayName("getByIndex: return array[index] + tmp : True -> ThrowArrayIndexOutOfBoundsException")
    public void testGetByIndex_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        int[] intArray = new int[1];
        intArray[0] = 1;
        
        Main.getByIndex(intArray, 128);
    }
    
    /**
    <pre>
    Test 
 * throws ArrayIndexOutOfBoundsException in: return array[index] + tmp;
 * </pre>
     */
    @Test(timeout = 10000, expected = ArrayIndexOutOfBoundsException.class)
    //@org.junit.jupiter.api.DisplayName("getByIndex: return array[index] + tmp : True -> ThrowArrayIndexOutOfBoundsException")
    public void testGetByIndex_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        int[] intArray = new int[1];
        intArray[0] = 1;
        
        Main.getByIndex(intArray, -256);
    }
    ///endregion
    
    ///region EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getByIndex(int[], int)
    
    /**
    <pre>
    Test executes conditions:
 *     {@code (index == -2): True }
 * 
 * throws RuntimeException after condition: index == -2
 * </pre>
     */
    @Test(timeout = 10000, expected = RuntimeException.class)
    //@org.junit.jupiter.api.DisplayName("getByIndex: index == -2 -> ThrowRuntimeException")
    public void testGetByIndex_IndexEqualsNegative2() throws Throwable  {
        Main.getByIndex(null, -2);
    }
    ///endregion
    
}

