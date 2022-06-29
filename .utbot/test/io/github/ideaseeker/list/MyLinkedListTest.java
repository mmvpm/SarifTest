package io.github.ideaseeker.list;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.MockedStatic;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mockStatic;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MyLinkedListTest {
    ///region Test suites for executable io.github.ideaseeker.list.MyLinkedList.squareElements
    
    ///region SUCCESSFUL EXECUTIONS for method squareElements()
    
    /**
    <pre>
    Test does not iterate {@code while(current.hasNext()) }, </pre>
     */
    @Test
    @DisplayName("squareElements: ")
    public void testSquareElements() throws Exception  {
        MockedStatic mockedStatic = ((MockedStatic) null);
        try {
            mockedStatic = mockStatic(io.github.ideaseeker.util.Util.class);
            mockedStatic.when(() -> io.github.ideaseeker.util.Util.square(anyInt())).thenReturn(0);
            Node node = new Node(-255);
            MyLinkedList myLinkedList = new MyLinkedList(node);
            
            myLinkedList.squareElements();
            
            Object myLinkedListHead = getFieldValue(myLinkedList, "head");
            Object finalMyLinkedListHeadValue = getFieldValue(myLinkedListHead, "value");
            
            assertEquals(0, finalMyLinkedListHeadValue);
        } finally {
            mockedStatic.close();
        }
    }
    
    /**
    <pre>
    Test iterates the loop {@code while(current.hasNext()) } once. </pre>
     */
    @Test
    @DisplayName("squareElements: while(current.hasNext()) -> UtilSquare")
    public void testSquareElements_CurrentHasNext() throws Exception  {
        MockedStatic mockedStatic = ((MockedStatic) null);
        try {
            mockedStatic = mockStatic(io.github.ideaseeker.util.Util.class);
            mockedStatic.when(() -> io.github.ideaseeker.util.Util.square(anyInt())).thenReturn(0, 0);
            Node node = new Node(-255);
            Node node1 = new Node(0);
            node1.value = -255;
            node.next = node1;
            MyLinkedList myLinkedList = new MyLinkedList(node);
            
            myLinkedList.squareElements();
            
            Object myLinkedListHead = getFieldValue(myLinkedList, "head");
            Object finalMyLinkedListHeadValue = getFieldValue(myLinkedListHead, "value");
            Object myLinkedListHead1 = getFieldValue(myLinkedList, "head");
            Object myLinkedListHead1HeadNext = getFieldValue(myLinkedListHead1, "next");
            Object finalMyLinkedListHeadNextValue = getFieldValue(myLinkedListHead1HeadNext, "value");
            
            assertEquals(0, finalMyLinkedListHeadValue);
            
            assertEquals(0, finalMyLinkedListHeadNextValue);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
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
        
        /* This test fails because executable under testing io.github.ideaseeker.list.MyLinkedList.squareElements
        produces Runtime exception java.lang.NullPointerException */
        myLinkedList.squareElements();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable io.github.ideaseeker.list.MyLinkedList.asString
    
    ///region SUCCESSFUL EXECUTIONS for method asString(io.github.ideaseeker.list.Node)
    
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
        
        Class myLinkedListClazz = Class.forName("io.github.ideaseeker.list.MyLinkedList");
        Class nodeType = Class.forName("io.github.ideaseeker.list.Node");
        Method asStringMethod = myLinkedListClazz.getDeclaredMethod("asString", nodeType);
        asStringMethod.setAccessible(true);
        java.lang.Object[] asStringMethodArguments = new java.lang.Object[1];
        asStringMethodArguments[0] = node;
        String actual = ((String) asStringMethod.invoke(null, asStringMethodArguments));
        
        String expected = "[-2147483648] -> ";
        
        assertEquals(expected, actual);
    }
    
    /**
      */
    @Test
    @DisplayName("asString: ")
    public void testAsString() throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException  {
        Node node = new Node(Integer.MIN_VALUE);
        Node node1 = new Node(0);
        node1.value = 1;
        node.next = node1;
        
        Class myLinkedListClazz = Class.forName("io.github.ideaseeker.list.MyLinkedList");
        Class nodeType = Class.forName("io.github.ideaseeker.list.Node");
        Method asStringMethod = myLinkedListClazz.getDeclaredMethod("asString", nodeType);
        asStringMethod.setAccessible(true);
        java.lang.Object[] asStringMethodArguments = new java.lang.Object[1];
        asStringMethodArguments[0] = node;
        String actual = ((String) asStringMethod.invoke(null, asStringMethodArguments));
        
        String expected = "[-2147483648] -> [1] -> ";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region ERROR SUITE for method asString(io.github.ideaseeker.list.Node)
    
    /**
    <pre>
    Test 
 * throws NullPointerException in: while(current.hasNext())
 * </pre>
     */
    @Test
    @DisplayName("asString: while(current.hasNext()) -> ThrowNullPointerException")
    public void testAsString_ThrowNullPointerException() throws Throwable  {
        /* This test fails because executable under testing io.github.ideaseeker.list.MyLinkedList.asString
        produces Runtime exception java.lang.NullPointerException */
        Class myLinkedListClazz = Class.forName("io.github.ideaseeker.list.MyLinkedList");
        Class nodeType = Class.forName("io.github.ideaseeker.list.Node");
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
    
    ///region Test suites for executable io.github.ideaseeker.list.MyLinkedList.add
    
    ///region SUCCESSFUL EXECUTIONS for method add(io.github.ideaseeker.list.Node)
    
    /**
    <pre>
    Test invokes:
 *     Node::setNext once
 * </pre>
     */
    @Test
    @DisplayName("add: -> NodeSetNext")
    public void testAdd_NodeSetNext() throws Exception  {
        MyLinkedList myLinkedList = ((MyLinkedList) createInstance("io.github.ideaseeker.list.MyLinkedList"));
        Node node = ((Node) createInstance("io.github.ideaseeker.list.Node"));
        setField(node, "next", null);
        setField(myLinkedList, "tail", node);
        
        myLinkedList.add(null);
        
        Object finalMyLinkedListTail = getFieldValue(myLinkedList, "tail");
        
        assertNull(finalMyLinkedListTail);
    }
    ///endregion
    
    ///region ERROR SUITE for method add(io.github.ideaseeker.list.Node)
    
    /**
    <pre>
    Test invokes:
 *     Node::setNext once
 * 
 * throws NullPointerException in: tail.setNext(node);
 * </pre>
     */
    @Test
    @DisplayName("add: tail.setNext(node) : True -> ThrowNullPointerException")
    public void testAdd_NodeSetNext_1() throws Exception  {
        MyLinkedList myLinkedList = ((MyLinkedList) createInstance("io.github.ideaseeker.list.MyLinkedList"));
        setField(myLinkedList, "tail", null);
        
        /* This test fails because executable under testing io.github.ideaseeker.list.MyLinkedList.add
        produces Runtime exception java.lang.NullPointerException */
        myLinkedList.add(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable io.github.ideaseeker.list.MyLinkedList.toString
    
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
        
        /* This test fails because executable under testing io.github.ideaseeker.list.MyLinkedList.toString
        produces Runtime exception java.lang.NullPointerException */
        myLinkedList.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable io.github.ideaseeker.list.MyLinkedList.toArray
    
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
        
        /* This test fails because executable under testing io.github.ideaseeker.list.MyLinkedList.toArray
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
    
    ///region Data providers and utils methods
    
    private static Object getFieldValue(Object obj, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = obj.getClass();
        java.lang.reflect.Field field;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                java.lang.reflect.Field modifiersField = java.lang.reflect.Field.class.getDeclaredField("modifiers");
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(obj);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + obj.getClass());
    }
    
    private static Object createInstance(String className) 
            throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static void setField(Object object, String fieldName, Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}
