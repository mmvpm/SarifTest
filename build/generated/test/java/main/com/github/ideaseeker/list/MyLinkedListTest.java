package com.github.ideaseeker.list;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.concurrent.TimeUnit;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MyLinkedListTest {
    ///region Test suites for executable com.github.ideaseeker.list.MyLinkedList.add
    
    
    ///region Errors report for add
    
    public void testAdd_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Error in the child process |> java.lang.ExceptionInInitializerError		at org.utbot.framework.util.EngineUtilsKt.getAnyInstance(EngineUtils.kt:35)		at org.utbot.framework.concrete.MockValueConstructor.constructObject(MockValueConstructor.kt:160)		at org.utbot.framework.concrete.MockValueConstructor.construct(MockValueConstructor.kt:126)		at
        org.utbot.framework.concrete.MockValueConstructor.constructMethodParameters(MockValueConstructor.kt:103)		at org.utbot.framework.concrete.UtExecutionInstrumentation.invoke(UtExecutionInstrumentation.kt:144)		at org.utbot.framework.concrete.UtExecutionInstrumentation.invoke(UtExecutionInstrumentation.kt:107)		at org.utbot.instrumentation.process.ChildProcessKt.loop(ChildProcess.kt:133)		at org.utbot.instrumentation.process.ChildProcessKt.main(ChildProcess.kt:77)		at org.utbot.instrumentation.process.ChildProcessKt.main(ChildProcess.kt)	Caused by: java.lang.NoSuchFieldException: modifiers		at java.base/java.lang.Class.getDeclaredField(Class.java:2489)		at
        org.utbot.common.Reflection.<clinit>(ReflectionUtil.kt:18)		... 9 more	 */
        
        // 1 occurrences of:
        /* Error in the child process |> java.lang.NoClassDefFoundError: Could not initialize
        class org.utbot.common.Reflection		at org.utbot.framework.util.EngineUtilsKt.getAnyInstance(EngineUtils.kt:35)		at org.utbot.framework.concrete.MockValueConstructor.constructObject(MockValueConstructor.kt:160)		at org.utbot.framework.concrete.MockValueConstructor.construct(MockValueConstructor.kt:126)		at org.utbot.framework.concrete.MockValueConstructor.constructMethodParameters(MockValueConstructor.kt:103)		at org.utbot.framework.concrete.UtExecutionInstrumentation.invoke(UtExecutionInstrumentation.kt:144)		at org.utbot.framework.concrete.UtExecutionInstrumentation.invoke(UtExecutionInstrumentation.kt:107)		at org.utbot.instrumentation.process.ChildProcessKt.loop(ChildProcess.kt:133)		at org.utbot.instrumentation.process.ChildProcessKt.main(ChildProcess.kt:77)		at
        org.utbot.instrumentation.process.ChildProcessKt.main(ChildProcess.kt)	 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.github.ideaseeker.list.MyLinkedList.toString
    
    ///region SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    <pre>
    Test invokes:
 *     MyLinkedList::asString once
 * returns from: {@code return asString(head); }
 * </pre>
     */
    @Test
    @DisplayName("toString: MyLinkedListAsString -> return asString(head)")
    public void testToString_MyLinkedListAsString() {
        Node node = new Node(Integer.MIN_VALUE);
        MyLinkedList myLinkedList = new MyLinkedList(node);
        
        String actual = myLinkedList.toString();
        
        String expected = "[-2147483648] -> ";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region ERROR SUITE for method toString()
    
    /**
    <pre>
    Test invokes:
 *     MyLinkedList::asString once
 * 
 * throws NullPointerException in: return asString(head);
 * </pre>
     */
    @Test
    @DisplayName("toString: return asString(head) : True -> ThrowNullPointerException")
    public void testToString_MyLinkedListAsString_1() {
        MyLinkedList myLinkedList = new MyLinkedList(null);
        
        /* This test fails because executable under testing com.github.ideaseeker.list.MyLinkedList.toString
        produces Runtime exception java.lang.NullPointerException */
        myLinkedList.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.github.ideaseeker.list.MyLinkedList.toArray
    
    ///region
    
    /**
    <pre>
    Test 
 * throws NullPointerException in: result.add(head.value);
 * </pre>
     */
    @Test
    @DisplayName("toArray: result.add(head.value) : True -> ThrowNullPointerException")
    public void testToArray_ThrowNullPointerException() {
        MyLinkedList myLinkedList = new MyLinkedList(null);
        
        /* This test fails because executable under testing com.github.ideaseeker.list.MyLinkedList.toArray
        produces Runtime exception java.lang.NullPointerException */
        myLinkedList.toArray();
    }
    
    @Test
    @org.junit.jupiter.api.Timeout(value = 1000L, unit = TimeUnit.MILLISECONDS)
    public void testToArray1() {
        Node node = new Node(0);
        node.next = node;
        MyLinkedList myLinkedList = new MyLinkedList(node);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        myLinkedList.toArray();
    }
    
    /**
      */
    @Test
    @DisplayName("toArray: ")
    public void testToArray() {
        Node node = new Node(0);
        MyLinkedList myLinkedList = new MyLinkedList(node);
        
        int[] actual = myLinkedList.toArray();
        
        int[] expected = {0};
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.github.ideaseeker.list.MyLinkedList.squareElements
    
    ///region ERROR SUITE for method squareElements()
    
    /**
    <pre>
    Test 
 * throws NullPointerException in: head.value = Util.square(head.value);
 * </pre>
     */
    @Test
    @DisplayName("squareElements: head.value = Util.square(head.value) -> ThrowNullPointerException")
    public void testSquareElements_ThrowNullPointerException() {
        MyLinkedList myLinkedList = new MyLinkedList(null);
        
        /* This test fails because executable under testing com.github.ideaseeker.list.MyLinkedList.squareElements
        produces Runtime exception java.lang.NullPointerException */
        myLinkedList.squareElements();
    }
    ///endregion
    
    ///region Errors report for squareElements
    
    public void testSquareElements_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Error in the child process |> java.lang.NoClassDefFoundError: Could not initialize
        class org.utbot.common.Reflection		at org.utbot.framework.concrete.MethodMockController.<init>(MethodMockController.kt:69)		at org.utbot.framework.concrete.MockValueConstructor.mockMethods(MockValueConstructor.kt:246)		at org.utbot.framework.concrete.MockValueConstructor.mockStaticMethods(MockValueConstructor.kt:264)		at org.utbot.framework.concrete.UtExecutionInstrumentation$invoke$$inlined$withReflection$lambda$1.invoke(UtExecutionInstrumentation.kt:155)		at org.utbot.framework.concrete.UtExecutionInstrumentation$invoke$$inlined$withReflection$lambda$1.invoke(UtExecutionInstrumentation.kt:107)		at org.utbot.framework.concrete.UtExecutionInstrumentation.withStaticFields(UtExecutionInstrumentation.kt:269)		at org.utbot.framework.concrete.UtExecutionInstrumentation.invoke(UtExecutionInstrumentation.kt:153)		at org.utbot.framework.concrete.UtExecutionInstrumentation.invoke(UtExecutionInstrumentation.kt:107)		at
        org.utbot.instrumentation.process.ChildProcessKt.loop(ChildProcess.kt:133)		at org.utbot.instrumentation.process.ChildProcessKt.main(ChildProcess.kt:77)		at org.utbot.instrumentation.process.ChildProcessKt.main(ChildProcess.kt)	 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.github.ideaseeker.list.MyLinkedList.asString
    
    ///region SUCCESSFUL EXECUTIONS for method asString(com.github.ideaseeker.list.Node)
    
    /**
    <pre>
    Test does not iterate {@code while(current.hasNext()) }, invokes:
 *     StringBuilder::append 3 times,
 *     StringBuilder::toString once
 * returns from: {@code return stringBuilder.toString(); }
 * </pre>
     */
    @Test
    @DisplayName("asString: while(current.hasNext()) -> return stringBuilder.toString()")
    public void testAsString_CurrentHasNext() throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException  {
        Node node = new Node(Integer.MIN_VALUE);
        
        Class myLinkedListClazz = Class.forName("com.github.ideaseeker.list.MyLinkedList");
        Class nodeType = Class.forName("com.github.ideaseeker.list.Node");
        Method asStringMethod = myLinkedListClazz.getDeclaredMethod("asString", nodeType);
        asStringMethod.setAccessible(true);
        java.lang.Object[] asStringMethodArguments = new java.lang.Object[1];
        asStringMethodArguments[0] = node;
        String actual = ((String) asStringMethod.invoke(null, asStringMethodArguments));
        
        String expected = "[-2147483648] -> ";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region ERROR SUITE for method asString(com.github.ideaseeker.list.Node)
    
    /**
    <pre>
    Test 
 * throws NullPointerException in: while(current.hasNext())
 * </pre>
     */
    @Test
    @DisplayName("asString: while(current.hasNext()) -> ThrowNullPointerException")
    public void testAsString_ThrowNullPointerException() throws Throwable  {
        /* This test fails because executable under testing com.github.ideaseeker.list.MyLinkedList.asString
        produces Runtime exception java.lang.NullPointerException */
        Class myLinkedListClazz = Class.forName("com.github.ideaseeker.list.MyLinkedList");
        Class nodeType = Class.forName("com.github.ideaseeker.list.Node");
        Method asStringMethod = myLinkedListClazz.getDeclaredMethod("asString", nodeType);
        asStringMethod.setAccessible(true);
        java.lang.Object[] asStringMethodArguments = new java.lang.Object[1];
        asStringMethodArguments[0] = ((Object) null);
        try {
            asStringMethod.invoke(null, asStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
}
