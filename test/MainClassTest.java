import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class output {
    ///region SUCCESSFUL EXECUTIONS for method main(java.lang.String[])
    
    /**
    <pre>
    Test invokes:
 *     PrintStream::println once
 * </pre>
     */
    @Test(timeout = 10000)
    //@org.junit.jupiter.api.DisplayName("main: -> PrintStreamPrintln")
    public void testMain_PrintStreamPrintln() throws Throwable  {
        MainClass.main(null);
    }
    ///endregion
    
    ///region SUCCESSFUL EXECUTIONS for method example(int[], int)
    
    /**
    <pre>
    Test executes conditions:
 *     {@code (i == -2): False }
 * returns from: {@code return a[i] + tmp; }
 * </pre>
     */
    @Test(timeout = 10000)
    //@org.junit.jupiter.api.DisplayName("example: i == -2 : False -> return a[i] + tmp")
    public void testExample_INotEqualsNegative2() throws Throwable  {
        int[] intArray = new int[2];
        intArray[0] = -255;
        intArray[1] = -255;
        
        int actual = MainClass.example(intArray, 1);
        
        assertEquals(-254, actual);
    }
    ///endregion
    
    ///region ERROR SUITE for method example(int[], int)
    
    /**
    <pre>
    Test 
 * throws ArithmeticException in: int tmp = 1 / i;
 * </pre>
     */
    @Test(timeout = 10000, expected = Throwable.class)
    //@org.junit.jupiter.api.DisplayName("example: tmp = 1 / i : True -> ThrowArithmeticException")
    public void testExample_ThrowArithmeticException() throws Throwable  {
        MainClass.example(null, 0);
    }
    
    /**
    <pre>
    Test 
 * throws NullPointerException in: return a[i] + tmp;
 * </pre>
     */
    @Test(timeout = 10000, expected = Throwable.class)
    //@org.junit.jupiter.api.DisplayName("example: return a[i] + tmp : True -> ThrowNullPointerException")
    public void testExample_ThrowNullPointerException() throws Throwable  {
        MainClass.example(null, -255);
    }
    
    /**
    <pre>
    Test 
 * throws ArrayIndexOutOfBoundsException in: return a[i] + tmp;
 * </pre>
     */
    @Test(timeout = 10000, expected = Throwable.class)
    //@org.junit.jupiter.api.DisplayName("example: return a[i] + tmp : True -> ThrowArrayIndexOutOfBoundsException")
    public void testExample_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        int[] intArray = new int[1];
        intArray[0] = -255;
        
        MainClass.example(intArray, 32);
    }
    
    /**
    <pre>
    Test 
 * throws ArrayIndexOutOfBoundsException in: return a[i] + tmp;
 * </pre>
     */
    @Test(timeout = 10000, expected = Throwable.class)
    //@org.junit.jupiter.api.DisplayName("example: return a[i] + tmp : True -> ThrowArrayIndexOutOfBoundsException")
    public void testExample_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        int[] intArray = new int[1];
        intArray[0] = -255;
        
        MainClass.example(intArray, -256);
    }
    ///endregion
    
    ///region EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method example(int[], int)
    
    /**
    <pre>
    Test executes conditions:
 *     {@code (i == -2): True }
 * 
 * throws RuntimeException after condition: i == -2
 * </pre>
     */
    @Test(timeout = 10000, expected = Throwable.class)
    //@org.junit.jupiter.api.DisplayName("example: i == -2 -> ThrowRuntimeException")
    public void testExample_IEqualsNegative2() throws Throwable  {
        MainClass.example(null, -2);
    }
    ///endregion
    
}
