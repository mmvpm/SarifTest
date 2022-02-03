import org.junit.Test;

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
    @Test(timeout = 10000, expected = Throwable.class)
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
    @Test(timeout = 10000, expected = Throwable.class)
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
    @Test(timeout = 10000, expected = Throwable.class)
    //@org.junit.jupiter.api.DisplayName("getByIndex: return array[index] + tmp : True -> ThrowArrayIndexOutOfBoundsException")
    public void testGetByIndex_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        int[] intArray = new int[1];
        intArray[0] = -255;
        
        Main.getByIndex(intArray, 16);
    }
    
    /**
    <pre>
    Test 
 * throws ArrayIndexOutOfBoundsException in: return array[index] + tmp;
 * </pre>
     */
    @Test(timeout = 10000, expected = Throwable.class)
    //@org.junit.jupiter.api.DisplayName("getByIndex: return array[index] + tmp : True -> ThrowArrayIndexOutOfBoundsException")
    public void testGetByIndex_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        int[] intArray = new int[1];
        intArray[0] = -255;
        
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
    @Test(timeout = 10000, expected = Throwable.class)
    //@org.junit.jupiter.api.DisplayName("getByIndex: index == -2 -> ThrowRuntimeException")
    public void testGetByIndex_IndexEqualsNegative2() throws Throwable  {
        Main.getByIndex(null, -2);
    }
    ///endregion
    
    ///region SUCCESSFUL EXECUTIONS for method trace1(int)
    
    /**
    <pre>
    Test invokes:
 *     Util::trace2 once
 * returns from: {@code return Util.trace2(a); }
 * </pre>
     */
    @Test(timeout = 10000)
    //@org.junit.jupiter.api.DisplayName("trace1: UtilTrace2 -> return Util.trace2(a)")
    public void testTrace1_UtilTrace2() throws Throwable  {
        int actual = Main.trace1(128);
        
        assertEquals(66564, actual);
    }
    ///endregion
    
    ///region ERROR SUITE for method trace1(int)
    
    /**
    <pre>
    Test invokes:
 *     Util::trace2 once
 * 
 * throws ArithmeticException in: return Util.trace2(a);
 * </pre>
     */
    @Test(timeout = 10000, expected = Throwable.class)
    //@org.junit.jupiter.api.DisplayName("trace1: return Util.trace2(a) : True -> ThrowArithmeticException")
    public void testTrace1_UtilTrace2_1() throws Throwable  {
        Main.trace1(1073741824);
    }
    ///endregion
    
}

