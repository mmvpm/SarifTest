package io.github.ideaseeker.list

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.DisplayName

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue

class NodeTest {
    ///region Test suites for executable io.github.ideaseeker.list.Node.setNext
    
    ///region SUCCESSFUL EXECUTIONS for method setNext(io.github.ideaseeker.list.Node)
    
    /**
      */
    @Test
    @DisplayName("setNext: ")
    fun testSetNext() {
        val node = Node(0)
        
        node.setNext(null)
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable io.github.ideaseeker.list.Node.toString
    
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
    fun testToString_StringBuilderToString() {
        val node = Node(Int.MIN_VALUE)
        
        val actual = node.toString()
        
        val expected = "Node(-2147483648)"
        
        assertEquals(expected, actual)
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable io.github.ideaseeker.list.Node.hasNext
    
    ///region SUCCESSFUL EXECUTIONS for method hasNext()
    
    /**
    <pre>
    Test returns from: {@code return next != null; }
 * </pre>
     */
    @Test
    @DisplayName("hasNext: return next != null : False -> return next != null")
    fun testHasNext_NextEqualsNull() {
        val node = Node(0)
        
        val actual = node.hasNext()
        
        assertFalse(actual)
    }
    
    /**
    <pre>
    Test returns from: {@code return next != null; }
 * </pre>
     */
    @Test
    @DisplayName("hasNext: return next != null : True -> return next != null")
    fun testHasNext_NextNotEqualsNull() {
        val node = Node(0)
        val node1 = Node(0)
        node.next = node1
        
        val actual = node.hasNext()
        
        assertTrue(actual)
    }
    ///endregion
    
    ///endregion
    
}
