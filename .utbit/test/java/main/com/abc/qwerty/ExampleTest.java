package com.abc.qwerty;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest {
    ///region Test suites for executable com.abc.qwerty.Example.main

    ///region SUCCESSFUL EXECUTIONS for method main(java.lang.String[])

    /**
     <pre>
     Test invokes:
     *     PrintStream::println once
     * </pre>
     */
    @Test
    @DisplayName("main: -> PrintStreamPrintln")
    public void testMain_PrintStreamPrintln() throws Throwable  {
        PrintStream prevOut = System.out;
        try {
            PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
            Class systemClazz = Class.forName("java.lang.System");
            setStaticField(systemClazz, "out", out);

            Example.main(null);
        } finally {
            setStaticField(System.class, "out", prevOut);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable com.abc.qwerty.Example.getByIndex

    ///region SUCCESSFUL EXECUTIONS for method getByIndex(int[], int)

    /**
     <pre>
     Test invokes:
     *     Example::invert once
     * returns from: {@code return array[inverted]; }
     * </pre>
     */
    @Test
    @DisplayName("getByIndex: ExampleInvert -> return array[inverted]")
    public void testGetByIndex_ExampleInvert() throws Throwable  {
        Example example = new Example();
        int[] intArray = new int[2];
        intArray[0] = -255;
        intArray[1] = -255;

        int actual = example.getByIndex(intArray, -3);

        assertEquals(-255, actual);
    }
    ///endregion

    ///region ERROR SUITE for method getByIndex(int[], int)

    /**
     <pre>
     Test
     * throws ArrayIndexOutOfBoundsException in: return array[inverted];
     * </pre>
     */
    @Test
    @DisplayName("getByIndex: return array[inverted] : True -> ThrowArrayIndexOutOfBoundsException")
    public void testGetByIndex_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        Example example = new Example();
        int[] intArray = new int[1];

        /* This test fails because executable under testing com.abc.qwerty.Example.getByIndex
         produces Runtime exception java.lang.ArrayIndexOutOfBoundsException: 1 */
        example.getByIndex(intArray, 256);
    }

    /**
     <pre>
     Test
     * throws NullPointerException in: return array[inverted];
     * </pre>
     */
    @Test
    @DisplayName("getByIndex: return array[inverted] : True -> ThrowNullPointerException")
    public void testGetByIndex_ThrowNullPointerException() throws Throwable  {
        Example example = new Example();

        /* This test fails because executable under testing com.abc.qwerty.Example.getByIndex
         produces Runtime exception java.lang.NullPointerException */
        example.getByIndex(null, 1);
    }

    /**
     <pre>
     Test
     * throws ArithmeticException in: int inverted = invert(index);
     * </pre>
     */
    @Test
    @DisplayName("getByIndex: inverted = invert(index) : True -> ThrowArithmeticException")
    public void testGetByIndex_ThrowArithmeticException() throws Throwable  {
        Example example = new Example();

        /* This test fails because executable under testing com.abc.qwerty.Example.getByIndex
         produces Runtime exception java.lang.ArithmeticException: / by zero */
        example.getByIndex(null, 0);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable com.abc.qwerty.Example.invert

    ///region SUCCESSFUL EXECUTIONS for method invert(int)

    /**
     <pre>
     Test returns from: {@code return inverted + 1; }
     * </pre>
     */
    @Test
    @DisplayName("invert: -> return inverted + 1")
    public void testInvert_ReturnInvertedPlus1() throws Throwable  {
        Example example = new Example();

        Class exampleClazz = Class.forName("com.abc.qwerty.Example");
        Class intType = int.class;
        Method invertMethod = exampleClazz.getDeclaredMethod("invert", intType);
        invertMethod.setAccessible(true);
        java.lang.Object[] invertMethodArguments = new java.lang.Object[1];
        invertMethodArguments[0] = 1;
        int actual = ((Integer) invertMethod.invoke(example, invertMethodArguments));

        assertEquals(2, actual);
    }
    ///endregion

    ///region ERROR SUITE for method invert(int)

    /**
     <pre>
     Test
     * throws ArithmeticException in: int inverted = 1 / index;
     * </pre>
     */
    @Test
    @DisplayName("invert: inverted = 1 / index : True -> ThrowArithmeticException")
    public void testInvert_ThrowArithmeticException() throws Throwable  {
        Example example = new Example();

        /* This test fails because executable under testing com.abc.qwerty.Example.invert
         produces Runtime exception java.lang.ArithmeticException: / by zero */
        Class exampleClazz = Class.forName("com.abc.qwerty.Example");
        Class intType = int.class;
        Method invertMethod = exampleClazz.getDeclaredMethod("invert", intType);
        invertMethod.setAccessible(true);
        java.lang.Object[] invertMethodArguments = new java.lang.Object[1];
        invertMethodArguments[0] = 0;
        try {
            invertMethod.invoke(example, invertMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion

    ///endregion

    ///region Data providers and utils methods

    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
                .invoke(getUnsafeInstance(), clazz);
    }

    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws Exception {
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
        field.set(null, fieldValue);
    }

    private static Object getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}