import org.junit.Test;
import MainClass.Foo;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.junit.Assert.assertEquals;

public class MainClassTest {
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
    
    ///region SUCCESSFUL EXECUTIONS for method function(MainClass.Foo)
    
    /**
    <pre>
    Test returns from: {@code return 1 / foo.a[Foo.n]; }
 * </pre>
     */
    @Test(timeout = 10000)
    //@org.junit.jupiter.api.DisplayName("function: -> return 1 / foo.a[Foo.n]")
    public void testFunction_Return1DivideFoonOfFooa() throws Throwable  {
        int prevN = MainClass.Foo.n;
        try {
            MainClass.Foo.n = 1;
            MainClass.Foo foo = ((MainClass.Foo) createInstance("MainClass$Foo"));
            int[] intArray = new int[2];
            intArray[0] = -255;
            intArray[1] = -255;
            foo.a = intArray;
            
            int actual = MainClass.function(foo);
            
            assertEquals(0, actual);
        } finally {
            MainClass.Foo.n = prevN;
        }
    }
    ///endregion
    
    ///region ERROR SUITE for method function(MainClass.Foo)
    
    /**
    <pre>
    Test 
 * throws NullPointerException in: return 1 / foo.a[Foo.n];
 * </pre>
     */
    @Test(timeout = 10000, expected = Throwable.class)
    //@org.junit.jupiter.api.DisplayName("function: return 1 / foo.a[Foo.n] : True -> ThrowNullPointerException")
    public void testFunction_ThrowNullPointerException() throws Throwable  {
        MainClass.function(null);
    }
    
    /**
    <pre>
    Test 
 * throws ArrayIndexOutOfBoundsException in: return 1 / foo.a[Foo.n];
 * </pre>
     */
    @Test(timeout = 10000, expected = Throwable.class)
    //@org.junit.jupiter.api.DisplayName("function: return 1 / foo.a[Foo.n] : True -> ThrowArrayIndexOutOfBoundsException")
    public void testFunction_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        int prevN = MainClass.Foo.n;
        try {
            MainClass.Foo.n = 128;
            MainClass.Foo foo = ((MainClass.Foo) createInstance("MainClass$Foo"));
            int[] intArray = new int[1];
            intArray[0] = -255;
            foo.a = intArray;
            
            MainClass.function(foo);
        } finally {
            MainClass.Foo.n = prevN;
        }
    }
    
    /**
    <pre>
    Test 
 * throws NullPointerException in: return 1 / foo.a[Foo.n];
 * </pre>
     */
    @Test(timeout = 10000, expected = Throwable.class)
    //@org.junit.jupiter.api.DisplayName("function: return 1 / foo.a[Foo.n] : True -> ThrowNullPointerException")
    public void testFunction_ThrowNullPointerException_1() throws Throwable  {
        int prevN = MainClass.Foo.n;
        try {
            MainClass.Foo.n = -255;
            MainClass.Foo foo = ((MainClass.Foo) createInstance("MainClass$Foo"));
            setField(foo, "a", null);
            
            MainClass.function(foo);
        } finally {
            MainClass.Foo.n = prevN;
        }
    }
    
    /**
    <pre>
    Test 
 * throws ArithmeticException in: return 1 / foo.a[Foo.n];
 * </pre>
     */
    @Test(timeout = 10000, expected = Throwable.class)
    //@org.junit.jupiter.api.DisplayName("function: return 1 / foo.a[Foo.n] : True -> ThrowArithmeticException")
    public void testFunction_ThrowArithmeticException() throws Throwable  {
        int prevN = MainClass.Foo.n;
        try {
            MainClass.Foo.n = 1;
            MainClass.Foo foo = ((MainClass.Foo) createInstance("MainClass$Foo"));
            int[] intArray = new int[2];
            intArray[0] = -255;
            foo.a = intArray;
            
            MainClass.function(foo);
        } finally {
            MainClass.Foo.n = prevN;
        }
    }
    
    /**
    <pre>
    Test 
 * throws ArrayIndexOutOfBoundsException in: return 1 / foo.a[Foo.n];
 * </pre>
     */
    @Test(timeout = 10000, expected = Throwable.class)
    //@org.junit.jupiter.api.DisplayName("function: return 1 / foo.a[Foo.n] : True -> ThrowArrayIndexOutOfBoundsException")
    public void testFunction_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        int prevN = MainClass.Foo.n;
        try {
            MainClass.Foo.n = -256;
            MainClass.Foo foo = ((MainClass.Foo) createInstance("MainClass$Foo"));
            int[] intArray = new int[1];
            intArray[0] = -255;
            foo.a = intArray;
            
            MainClass.function(foo);
        } finally {
            MainClass.Foo.n = prevN;
        }
    }
    ///endregion
    
    ///region SUCCESSFUL EXECUTIONS for method callCallExample(boolean, int[], int)
    
    /**
    <pre>
    Test returns from: {@code return callExample(condition, a, i); }
 * </pre>
     */
    @Test(timeout = 10000)
    //@org.junit.jupiter.api.DisplayName("callCallExample: -> return callExample(condition, a, i)")
    public void testCallCallExample_ReturnCallExample() throws Throwable  {
        int[] intArray = new int[2];
        intArray[0] = 1;
        intArray[1] = 1;
        
        int actual = MainClass.callCallExample(true, intArray, 1);
        
        assertEquals(2, actual);
    }
    
    /**
    <pre>
    Test returns from: {@code return callExample(condition, a, i); }
 * </pre>
     */
    @Test(timeout = 10000)
    //@org.junit.jupiter.api.DisplayName("callCallExample: -> return callExample(condition, a, i)")
    public void testCallCallExample_ReturnCallExample_1() throws Throwable  {
        int[] intArray = new int[2];
        intArray[0] = -255;
        intArray[1] = -255;
        
        int actual = MainClass.callCallExample(false, intArray, 0);
        
        assertEquals(-254, actual);
    }
    ///endregion
    
    ///region EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method callCallExample(boolean, int[], int)
    
    /**
    <pre>
    Test invokes:
 *     MainClass::callExample once
 * 
 * throws RuntimeException in: return callExample(condition, a, i);
 * </pre>
     */
    @Test(timeout = 10000, expected = Throwable.class)
    //@org.junit.jupiter.api.DisplayName("callCallExample: return callExample(condition, a, i) : True -> ThrowRuntimeException")
    public void testCallCallExample_MainClassCallExample() throws Throwable  {
        MainClass.callCallExample(true, null, -2);
    }
    ///endregion
    
    ///region ERROR SUITE for method callCallExample(boolean, int[], int)
    
    /**
    <pre>
    Test 
 * throws ArithmeticException in: return callExample(condition, a, i);
 * </pre>
     */
    @Test(timeout = 10000, expected = Throwable.class)
    //@org.junit.jupiter.api.DisplayName("callCallExample: return callExample(condition, a, i) : True -> ThrowArithmeticException")
    public void testCallCallExample_ThrowArithmeticException() throws Throwable  {
        MainClass.callCallExample(false, null, -1);
    }
    
    /**
    <pre>
    Test 
 * throws ArrayIndexOutOfBoundsException in: return callExample(condition, a, i);
 * </pre>
     */
    @Test(timeout = 10000, expected = Throwable.class)
    //@org.junit.jupiter.api.DisplayName("callCallExample: return callExample(condition, a, i) : True -> ThrowArrayIndexOutOfBoundsException")
    public void testCallCallExample_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        int[] intArray = new int[1];
        intArray[0] = 1;
        
        MainClass.callCallExample(false, intArray, -256);
    }
    
    /**
    <pre>
    Test 
 * throws ArrayIndexOutOfBoundsException in: return callExample(condition, a, i);
 * </pre>
     */
    @Test(timeout = 10000, expected = Throwable.class)
    //@org.junit.jupiter.api.DisplayName("callCallExample: return callExample(condition, a, i) : True -> ThrowArrayIndexOutOfBoundsException")
    public void testCallCallExample_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        int[] intArray = new int[1];
        intArray[0] = 1;
        
        MainClass.callCallExample(true, intArray, 128);
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
        intArray[0] = 1;
        intArray[1] = 1;
        
        int actual = MainClass.example(intArray, 1);
        
        assertEquals(2, actual);
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
        intArray[0] = 1;
        
        MainClass.example(intArray, 64);
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
        intArray[0] = 1;
        
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
    
    ///region SUCCESSFUL EXECUTIONS for method callExample(boolean, int[], int)
    
    /**
    <pre>
    Test executes conditions:
 *     {@code (condition): True }
 * invokes:
 *     MainClass::example once
 * returns from: {@code return example(a, i); }
 * </pre>
     */
    @Test(timeout = 10000)
    //@org.junit.jupiter.api.DisplayName("callExample: condition : True -> return example(a, i)")
    public void testCallExample_Condition() throws Throwable  {
        int[] intArray = new int[2];
        intArray[0] = 1;
        intArray[1] = 1;
        
        int actual = MainClass.callExample(true, intArray, 1);
        
        assertEquals(2, actual);
    }
    
    /**
    <pre>
    Test executes conditions:
 *     {@code (condition): False }
 * invokes:
 *     MainClass::example once
 * returns from: {@code return example(a, i + 1); }
 * </pre>
     */
    @Test(timeout = 10000)
    //@org.junit.jupiter.api.DisplayName("callExample: condition : False -> return example(a, i + 1)")
    public void testCallExample_NotCondition() throws Throwable  {
        int[] intArray = new int[2];
        intArray[0] = -255;
        intArray[1] = -255;
        
        int actual = MainClass.callExample(false, intArray, 0);
        
        assertEquals(-254, actual);
    }
    ///endregion
    
    ///region ERROR SUITE for method callExample(boolean, int[], int)
    
    /**
    <pre>
    Test executes conditions:
 *     {@code (condition): False }
 * invokes:
 *     MainClass::example once
 * 
 * throws ArithmeticException in: return example(a, i + 1);
 * </pre>
     */
    @Test(timeout = 10000, expected = Throwable.class)
    //@org.junit.jupiter.api.DisplayName("callExample: return example(a, i + 1) : True -> ThrowArithmeticException")
    public void testCallExample_NotCondition_1() throws Throwable  {
        MainClass.callExample(false, null, -1);
    }
    
    /**
    <pre>
    Test executes conditions:
 *     {@code (condition): True }
 * 
 * throws ArrayIndexOutOfBoundsException in: return example(a, i);
 * </pre>
     */
    @Test(timeout = 10000, expected = Throwable.class)
    //@org.junit.jupiter.api.DisplayName("callExample: return example(a, i) : True -> ThrowArrayIndexOutOfBoundsException")
    public void testCallExample_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        int[] intArray = new int[1];
        intArray[0] = 1;
        
        MainClass.callExample(true, intArray, -256);
    }
    
    /**
    <pre>
    Test executes conditions:
 *     {@code (condition): True }
 * 
 * throws ArrayIndexOutOfBoundsException in: return example(a, i);
 * </pre>
     */
    @Test(timeout = 10000, expected = Throwable.class)
    //@org.junit.jupiter.api.DisplayName("callExample: return example(a, i) : True -> ThrowArrayIndexOutOfBoundsException")
    public void testCallExample_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        int[] intArray = new int[1];
        intArray[0] = 1;
        
        MainClass.callExample(true, intArray, 128);
    }
    ///endregion
    
    ///region EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method callExample(boolean, int[], int)
    
    /**
    <pre>
    Test executes conditions:
 *     {@code (condition): True }
 * invokes:
 *     MainClass::example once
 * 
 * throws RuntimeException in: return example(a, i);
 * </pre>
     */
    @Test(timeout = 10000, expected = Throwable.class)
    //@org.junit.jupiter.api.DisplayName("callExample: return example(a, i) : True -> ThrowRuntimeException")
    public void testCallExample_Condition_1() throws Throwable  {
        MainClass.callExample(true, null, -2);
    }
    ///endregion
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return getUnsafeInstance().allocateInstance(clazz);
    }
    private static void setField(Object object, String fieldName, Object fieldValue) throws Exception {
        Class<?> clazz = object.getClass();
        java.lang.reflect.Field field;
    
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
                field = null;
            }
        } while (field == null);
        
        java.lang.reflect.Field modifiersField = java.lang.reflect.Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}

