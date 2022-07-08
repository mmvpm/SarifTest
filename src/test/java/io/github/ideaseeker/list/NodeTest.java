package io.github.ideaseeker.list;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NodeTest {
    ///region Test suites for executable io.github.ideaseeker.list.Node.setNext

    ///region

    @Test
    @DisplayName("setNext: next = Node(int)")
    public void testSetNext() throws Exception {
        Node node = ((Node) createInstance("io.github.ideaseeker.list.Node"));
        Node node1 = new Node(0);

        node.setNext(node1);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable io.github.ideaseeker.list.Node.hasNext

    ///region SUCCESSFUL EXECUTIONS for method hasNext()

    /**
     * <pre>
     * Test returns from: {@code return next != null; }
     * </pre>
     */
    @Test
    @DisplayName("hasNext: return next != null : False -> return next != null")
    public void testHasNext_NextEqualsNull() {
        Node node = new Node(0);

        boolean actual = node.hasNext();

        assertFalse(actual);
    }

    /**
     * <pre>
     * Test returns from: {@code return next != null; }
     * </pre>
     */
    @Test
    @DisplayName("hasNext: return next != null : True -> return next != null")
    public void testHasNext_NextNotEqualsNull() {
        Node node = new Node(0);
        Node node1 = new Node(0);
        node.next = node1;

        boolean actual = node.hasNext();

        assertTrue(actual);
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

    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}
