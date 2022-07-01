package io.github.ideaseeker.list

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.DisplayName
import java.lang.reflect.Method
import java.lang.reflect.InvocationTargetException
import java.util.concurrent.TimeUnit
import java.lang.reflect.Field
import java.lang.reflect.Modifier

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Assertions.assertArrayEquals

class MyLinkedListTest {
    ///region Test suites for executable io.github.ideaseeker.list.MyLinkedList.squareElements
    
    ///region SUCCESSFUL EXECUTIONS for method squareElements()
    
    /**
    <pre>
    Test does not iterate {@code while(current.hasNext()) }, invokes:
 *     Util::square once
 * </pre>
     */
    @Test
    @DisplayName("squareElements: UtilSquare -> while(current.hasNext())")
    fun testSquareElements_CurrentHasNext() {
        val node = Node(-256)
        val myLinkedList = MyLinkedList(node)
        
        myLinkedList.squareElements()
        
        val myLinkedListHead = getFieldValue(myLinkedList, "head")
        val finalMyLinkedListHeadValue = getFieldValue(myLinkedListHead, "value")
        
        assertEquals(65536, finalMyLinkedListHeadValue)
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
    fun testSquareElements_ThrowNullPointerException() {
        val myLinkedList = MyLinkedList(null)
        
        /* This test fails because executable under testing io.github.ideaseeker.list.MyLinkedList.squareElements
        produces Runtime exception java.lang.NullPointerException */
        myLinkedList.squareElements()
    }
    
    /**
    <pre>
    Test invokes:
 *     Util::square once
 * 
 * throws ArithmeticException in: head.value = Util.square(head.value);
 * </pre>
     */
    @Test
    @DisplayName("squareElements: head.value = Util.square(head.value) -> ThrowArithmeticException")
    fun testSquareElements_UtilSquare() {
        val node = Node(655974528)
        val myLinkedList = MyLinkedList(node)
        
        /* This test fails because executable under testing io.github.ideaseeker.list.MyLinkedList.squareElements
        produces Runtime exception java.lang.ArithmeticException: integer overflow */
        myLinkedList.squareElements()
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable io.github.ideaseeker.list.MyLinkedList.asString
    
    ///region ERROR SUITE for method asString(io.github.ideaseeker.list.Node)
    
    /**
    <pre>
    Test 
 * throws NullPointerException in: while(current.hasNext())
 * </pre>
     */
    @Test
    @DisplayName("asString: while(current.hasNext()) -> ThrowNullPointerException")
    fun testAsString_ThrowNullPointerException() {
        /* This test fails because executable under testing io.github.ideaseeker.list.MyLinkedList.asString
        produces Runtime exception java.lang.NullPointerException */
        val myLinkedListClazz = java.lang.Class.forName("io.github.ideaseeker.list.MyLinkedList")
        val nodeType = java.lang.Class.forName("io.github.ideaseeker.list.Node")
        val asStringMethod = myLinkedListClazz.getDeclaredMethod("asString", nodeType)
        asStringMethod.setAccessible(true)
        val asStringMethodArguments = kotlin.Array<Any?>(1) { null }
        asStringMethodArguments[0] = null as Any
        try {
            asStringMethod.invoke(null, *asStringMethodArguments)
        } catch (invocationTargetException: InvocationTargetException) {
            throw invocationTargetException.getTargetException()
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
    fun testAdd_NodeSetNext() {
        val myLinkedList = createInstance("io.github.ideaseeker.list.MyLinkedList") as MyLinkedList
        val node = createInstance("io.github.ideaseeker.list.Node") as Node
        setField(node, "next", null)
        setField(myLinkedList, "tail", node)
        
        myLinkedList.add(null)
        
        val finalMyLinkedListTail = getFieldValue(myLinkedList, "tail")
        
        assertNull(finalMyLinkedListTail)
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
    fun testAdd_NodeSetNext_1() {
        val myLinkedList = createInstance("io.github.ideaseeker.list.MyLinkedList") as MyLinkedList
        setField(myLinkedList, "tail", null)
        
        /* This test fails because executable under testing io.github.ideaseeker.list.MyLinkedList.add
        produces Runtime exception java.lang.NullPointerException */
        myLinkedList.add(null)
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable io.github.ideaseeker.list.MyLinkedList.toString
    
    ///region SUCCESSFUL EXECUTIONS for method toString()
    
    /**
      */
    @Test
    @DisplayName("toString: ")
    fun testToString() {
        val node = Node(Int.MIN_VALUE)
        val myLinkedList = MyLinkedList(node)
        
        val actual = myLinkedList.toString()
        
        val expected = "[-2147483648] -> "
        
        assertEquals(expected, actual)
    }
    
    /**
      */
    @Test
    @DisplayName("toString: ")
    fun testToString_1() {
        val node = Node(1)
        val node1 = Node(0)
        node.next = node1
        val myLinkedList = MyLinkedList(node)
        
        val actual = myLinkedList.toString()
        
        val expected = "[1] -> [0] -> "
        
        assertEquals(expected, actual)
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
    fun testToString_MyLinkedListAsString() {
        val myLinkedList = MyLinkedList(null)
        
        /* This test fails because executable under testing io.github.ideaseeker.list.MyLinkedList.toString
        produces Runtime exception java.lang.NullPointerException */
        myLinkedList.toString()
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
    fun testToArray_ThrowNullPointerException() {
        val myLinkedList = MyLinkedList(null)
        
        /* This test fails because executable under testing io.github.ideaseeker.list.MyLinkedList.toArray
        produces Runtime exception java.lang.NullPointerException */
        myLinkedList.toArray()
    }
    
    @Test
    @org.junit.jupiter.api.Timeout(value = 1000L, unit = TimeUnit.MILLISECONDS)
    fun testToArray1() {
        val node = Node(0)
        node.next = node
        val myLinkedList = MyLinkedList(node)
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        myLinkedList.toArray()
    }
    
    /**
      */
    @Test
    @DisplayName("toArray: ")
    fun testToArray() {
        val node = Node(0)
        val myLinkedList = MyLinkedList(node)
        
        val actual = myLinkedList.toArray()
        
        val expected = intArrayOf(0)
        assertArrayEquals(expected, actual)
    }
    ///endregion
    
    ///endregion
    
    ///region Data providers and utils methods
    companion object {
        
        @JvmStatic
        private fun getFieldValue(any: kotlin.Any, fieldName: String): kotlin.Any? {
            var clazz: Class<*>? = any.javaClass
            var field: java.lang.reflect.Field
            do {
                try {
                    field = clazz!!.getDeclaredField(fieldName)
                    field.isAccessible = true
                    val modifiersField: java.lang.reflect.Field = java.lang.reflect.Field::class.java.getDeclaredField("modifiers")
                    modifiersField.isAccessible = true
                    modifiersField.setInt(field, field.modifiers and java.lang.reflect.Modifier.FINAL.inv())
                    
                    return field.get(any)
                } catch (e: NoSuchFieldException) {
                    clazz = clazz!!.superclass
                }
            } while (clazz != null)
            
            throw NoSuchFieldException("Field '" + fieldName + "' not found on class " + any.javaClass)
        }
        
        @JvmStatic
        private fun createInstance(className: String): kotlin.Any? {
            val clazz: Class<*> = Class.forName(className)
            return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class::class.java)
                .invoke(getUnsafeInstance(), clazz)
        }
        
        @JvmStatic
        private fun setField(any: kotlin.Any, fieldName: String, fieldValue: kotlin.Any?) {
            var clazz: Class<*> = any.javaClass
            var field: java.lang.reflect.Field?
            do {
                try {
                    field = clazz.getDeclaredField(fieldName)
                } catch (e: Exception) {
                    clazz = clazz.superclass
                    field = null
                }
            } while (field == null)
        
            val modifiersField: java.lang.reflect.Field = java.lang.reflect.Field::class.java.getDeclaredField("modifiers")
            modifiersField.isAccessible = true
            modifiersField.setInt(field, field.modifiers and java.lang.reflect.Modifier.FINAL.inv())
        
            field.isAccessible = true
            field.set(any, fieldValue)
        }
        
        @JvmStatic
        private fun getUnsafeInstance(): kotlin.Any? {
            val f: java.lang.reflect.Field = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe")
            f.isAccessible = true
            return f[null]
        }
    }
    ///endregion
}
