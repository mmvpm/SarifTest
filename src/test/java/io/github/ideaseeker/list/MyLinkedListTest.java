package io.github.ideaseeker.list;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.concurrent.TimeUnit;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyLinkedListTest {
    ///region Test suites for executable io.github.ideaseeker.list.MyLinkedList.add

    ///region

    @Test
    @DisplayName("add: node = Node(int) -> throw NullPointerException")
    public void testAddThrowsNPE() throws Exception {
        MyLinkedList myLinkedList = ((MyLinkedList) createInstance("io.github.ideaseeker.list.MyLinkedList"));
        Node node = new Node(0);
        
        /* This test fails because executable under testing io.github.ideaseeker.list.MyLinkedList.add
        produces Runtime exception java.lang.NullPointerException */
        myLinkedList.add(node);
    }
    ///endregion

    ///region SUCCESSFUL EXECUTIONS for method add(io.github.ideaseeker.list.Node)

    /**
     * <pre>
     * Test invokes:
     *     Node::setNext once
     * </pre>
     */
    @Test
    @DisplayName("add: -> NodeSetNext")
    public void testAdd_NodeSetNext() throws Exception {
        MyLinkedList myLinkedList = ((MyLinkedList) createInstance("io.github.ideaseeker.list.MyLinkedList"));
        Node node = ((Node) createInstance("io.github.ideaseeker.list.Node"));
        setField(node, "next", null);
        setField(myLinkedList, "tail", node);

        myLinkedList.add(null);

        Object finalMyLinkedListTail = getFieldValue(myLinkedList, "tail");

        assertNull(finalMyLinkedListTail);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable io.github.ideaseeker.list.MyLinkedList.toString

    ///region ERROR SUITE for method toString()

    /**
     * <pre>
     * Test invokes:
     *     MyLinkedList::asString once
     *
     * throws NullPointerException in: return asString(head);
     * </pre>
     */
    @Test
    @DisplayName("toString: return asString(head) : True -> ThrowNullPointerException")
    public void testToString_MyLinkedListAsString() {
        MyLinkedList myLinkedList = new MyLinkedList(null);
        
        /* This test fails because executable under testing io.github.ideaseeker.list.MyLinkedList.toString
        produces Runtime exception java.lang.NullPointerException */
        myLinkedList.toString();
    }
    ///endregion

    ///endregion

    ///region Test suites for executable io.github.ideaseeker.list.MyLinkedList.toArray

    ///region

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

    @Test
    public void testToArray2() {
        Node node = new Node(0);
        MyLinkedList myLinkedList = new MyLinkedList(node);

        int[] actual = myLinkedList.toArray();

        int[] expected = {0};
        assertArrayEquals(expected, actual);
    }
    ///endregion

    ///region ERROR SUITE for method toArray()

    /**
     * <pre>
     * Test
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
    ///endregion

    ///endregion

    ///region Test suites for executable io.github.ideaseeker.list.MyLinkedList.squareElements

    ///region SUCCESSFUL EXECUTIONS for method squareElements()

    /**
     * <pre>
     * Test does not iterate {@code while(current.hasNext()) }, </pre>
     */
    @Test
    @DisplayName("squareElements: ")
    public void testSquareElements() throws Exception {
        Node node = new Node(-256);
        MyLinkedList myLinkedList = new MyLinkedList(node);

        myLinkedList.squareElements();

        Object myLinkedListHead = getFieldValue(myLinkedList, "head");
        Object finalMyLinkedListHeadValue = getFieldValue(myLinkedListHead, "value");

        assertEquals(65536, finalMyLinkedListHeadValue);
    }

    /**
     * <pre>
     * Test iterates the loop {@code while(current.hasNext()) } once. </pre>
     */
    @Test
    @DisplayName("squareElements: while(current.hasNext()) -> UtilSquare")
    public void testSquareElements_CurrentHasNext() throws Exception {
        Node node = new Node(-1);
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

        assertEquals(1, finalMyLinkedListHeadValue);

        assertEquals(65025, finalMyLinkedListHeadNextValue);
    }
    ///endregion

    ///region ERROR SUITE for method squareElements()

    /**
     * <pre>
     * Test
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

    /**
     * <pre>
     * Test invokes:
     *     Util::square once
     * iterates the loop {@code while(current.hasNext()) } once.
     * Test throws ArithmeticException in: current.value = Util.square(current.value);
     * </pre>
     */
    @Test
    @DisplayName("squareElements: current.value = Util.square(current.value) -> ThrowArithmeticException")
    public void testSquareElements_CurrentHasNext_1() {
        Node node = new Node(0);
        Node node1 = new Node(0);
        node1.value = 1514350919;
        node.next = node1;
        MyLinkedList myLinkedList = new MyLinkedList(node);
        
        /* This test fails because executable under testing io.github.ideaseeker.list.MyLinkedList.squareElements
        produces Runtime exception java.lang.ArithmeticException: integer overflow */
        myLinkedList.squareElements();
    }
    ///endregion

    ///endregion

    ///region Data providers and utils methods

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

    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}
