package com.github.ideaseeker.list;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NodeTest {
    ///region Test suites for executable com.github.ideaseeker.list.Node.setNext
    
    ///region SUCCESSFUL EXECUTIONS for method setNext(com.github.ideaseeker.list.Node)
    
    /**
      */
    @Test
    @DisplayName("setNext: ")
    public void testSetNext() {
        Node node = new Node(0);
        
        node.setNext(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.github.ideaseeker.list.Node.toString
    
    ///region SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    <pre>
    Test invokes:
 *     StringBuilder::append 3 times,
 *     StringBuilder::toString once
 * returns from: {@code return "Node(" + value + ")"; }
 * </pre>
     */
    @Test
    @DisplayName("toString: StringBuilderAppend -> return \"Node(\" + value + \")\"")
    public void testToString_StringBuilderToString() {
        Node node = new Node(Integer.MIN_VALUE);
        
        String actual = node.toString();
        
        String expected = "Node(-2147483648)";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.github.ideaseeker.list.Node.hasNext
    
    ///region SUCCESSFUL EXECUTIONS for method hasNext()
    
    /**
    <pre>
    Test returns from: {@code return next != null; }
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
    <pre>
    Test returns from: {@code return next != null; }
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
    
}
