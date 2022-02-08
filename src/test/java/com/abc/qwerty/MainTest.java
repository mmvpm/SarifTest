package com.abc.qwerty;

import org.junit.Test;
import com.cba.ytrewq.Util;
import com.abc.qwerty.Main.Number;

import static org.junit.Assert.assertEquals;

public class MainTest {
    ///region SUCCESSFUL EXECUTIONS for method main(java.lang.String[])
    
    /**
    <pre>
    Test returns from: {@code public static void main(String[] args) {
 * } }
 * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("main: -> public static void main(String[] args) { }")
    public void testMain_Return() throws Throwable  {
        Main.main(null);
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
    @Test
    //@org.junit.jupiter.api.DisplayName("getByIndex: index == -2 : False -> return array[index] + tmp")
    public void testGetByIndex_IndexNotEqualsNegative2() throws Throwable  {
        int[] intArray = new int[2];
        intArray[0] = -255;
        intArray[1] = -255;
        
        int actual = Main.getByIndex(intArray, 1);
        
        assertEquals(-254, actual);
    }
    ///endregion
    
    ///region ERROR SUITE for method getByIndex(int[], int)
    
    /**
    <pre>
    Test 
 * throws ArithmeticException in: int tmp = 1 / index;
 * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("getByIndex: tmp = 1 / index : True -> ThrowArithmeticException")
    public void testGetByIndex_ThrowArithmeticException() throws Throwable  {
        /* This test fails because executable under testing com.abc.qwerty.Main.getByIndex
         produces Runtime exception java.lang.ArithmeticException: / by zero */
        Main.getByIndex(null, 0);
    }
    
    /**
    <pre>
    Test 
 * throws NullPointerException in: return array[index] + tmp;
 * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("getByIndex: return array[index] + tmp : True -> ThrowNullPointerException")
    public void testGetByIndex_ThrowNullPointerException() throws Throwable  {
        /* This test fails because executable under testing com.abc.qwerty.Main.getByIndex
         produces Runtime exception java.lang.NullPointerException */
        Main.getByIndex(null, -255);
    }
    
    /**
    <pre>
    Test 
 * throws ArrayIndexOutOfBoundsException in: return array[index] + tmp;
 * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("getByIndex: return array[index] + tmp : True -> ThrowArrayIndexOutOfBoundsException")
    public void testGetByIndex_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        int[] intArray = new int[1];
        intArray[0] = -255;
        
        /* This test fails because executable under testing com.abc.qwerty.Main.getByIndex
         produces Runtime exception java.lang.ArrayIndexOutOfBoundsException: 128 */
        Main.getByIndex(intArray, 128);
    }
    
    /**
    <pre>
    Test 
 * throws ArrayIndexOutOfBoundsException in: return array[index] + tmp;
 * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("getByIndex: return array[index] + tmp : True -> ThrowArrayIndexOutOfBoundsException")
    public void testGetByIndex_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        int[] intArray = new int[1];
        intArray[0] = -255;
        
        /* This test fails because executable under testing com.abc.qwerty.Main.getByIndex
         produces Runtime exception java.lang.ArrayIndexOutOfBoundsException: -256 */
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
    @Test
    //@org.junit.jupiter.api.DisplayName("getByIndex: index == -2 -> ThrowRuntimeException")
    public void testGetByIndex_IndexEqualsNegative2() throws Throwable  {
        /* This test fails because executable under testing com.abc.qwerty.Main.getByIndex
         produces Runtime exception java.lang.RuntimeException */
        Main.getByIndex(null, -2);
    }
    ///endregion
    
    ///region SUCCESSFUL EXECUTIONS for method example(com.cba.ytrewq.Util, com.abc.qwerty.Main.Number)
    
    /**
      */
    @Test
    //@org.junit.jupiter.api.DisplayName("example: ")
    public void testExample() throws Throwable  {
        Util util = new Util();
        Main.Number number = Main.Number.ZERO;
        
        int actual = Main.example(util, number);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region ERROR SUITE for method example(com.cba.ytrewq.Util, com.abc.qwerty.Main.Number)
    
    /**
    <pre>
    Test invokes:
 *     Main$Number::ordinal once
 * 
 * throws NullPointerException in: condition
 * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("example: switch(condition) case:  -> ThrowNullPointerException")
    public void testExample_MainOrdinal() throws Throwable  {
        /* This test fails because executable under testing com.abc.qwerty.Main.example
         produces Runtime exception java.lang.NullPointerException */
        Main.example(null, null);
    }
    
    /**
    <pre>
    Test 
 * throws NullPointerException in: return util.multiply(100000);
 * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("example: return util.multiply(100000) : True -> ThrowNullPointerException")
    public void testExample_ThrowNullPointerException() throws Throwable  {
        Main.Number number = Main.Number.NONZERO;
        
        /* This test fails because executable under testing com.abc.qwerty.Main.example
         produces Runtime exception java.lang.NullPointerException */
        Main.example(null, number);
    }
    
    /**
    <pre>
    Test 
 * throws NullPointerException in: return util.multiply(0);
 * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("example: return util.multiply(0) : True -> ThrowNullPointerException")
    public void testExample_ThrowNullPointerException_1() throws Throwable  {
        Main.Number number = Main.Number.ZERO;
        
        /* This test fails because executable under testing com.abc.qwerty.Main.example
         produces Runtime exception java.lang.NullPointerException */
        Main.example(null, number);
    }
    
    /**
    <pre>
    Test 
 * throws ArithmeticException in: return util.multiply(100000);
 * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("example: return util.multiply(100000) : True -> ThrowArithmeticException")
    public void testExample_ThrowArithmeticException() throws Throwable  {
        Util util = new Util();
        Main.Number number = Main.Number.NONZERO;
        
        /* This test fails because executable under testing com.abc.qwerty.Main.example
         produces Runtime exception java.lang.ArithmeticException: integer overflow */
        Main.example(util, number);
    }
    ///endregion
    
}

