package com.github.ideaseeker.list

import org.testng.annotations.Test
import java.lang.reflect.Method
import java.lang.reflect.InvocationTargetException
import java.lang.reflect.Field
import java.lang.reflect.Modifier

import org.mockito.Mockito.mock
import org.mockito.Mockito.`when`
import org.testng.Assert.assertEquals
import org.testng.Assert.assertNull
import org.testng.internal.junit.ArrayAsserts.assertArrayEquals

class MyLinkedListTest {
    ///region Test suites for executable com.github.ideaseeker.list.MyLinkedList.squareElements
    
    ///region SUCCESSFUL EXECUTIONS for method squareElements()
    
    /**
    <pre>
    Test does not iterate {@code while(current.hasNext()) }, </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("squareElements: ")
    fun testSquareElements() {
        val nodeMock = mock(Node::class.java)
        `when`(nodeMock.hasNext()).thenReturn(false)
        nodeMock.value = 0
        val myLinkedList = MyLinkedList(nodeMock)
        
        myLinkedList.squareElements()
    }
    
    /**
    <pre>
    Test iterates the loop {@code while(current.hasNext()) } once. </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("squareElements: while(current.hasNext()) -> UtilSquare")
    fun testSquareElements_CurrentHasNext() {
        val nodeMock = mock(Node::class.java)
        `when`(nodeMock.hasNext()).thenReturn(true)
        nodeMock.value = 0
        val nodeMock1 = mock(Node::class.java)
        `when`(nodeMock1.hasNext()).thenReturn(false)
        nodeMock1.value = -255
        nodeMock.next = nodeMock1
        val myLinkedList = MyLinkedList(nodeMock)
        
        myLinkedList.squareElements()
        
        val myLinkedListHead = getFieldValue(myLinkedList, "head")
        val myLinkedListHeadHeadNext = getFieldValue(myLinkedListHead, "next")
        val finalMyLinkedListHeadNextValue = getFieldValue(myLinkedListHeadHeadNext, "value")
        
        assertEquals(finalMyLinkedListHeadNextValue, 0)
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
    //@org.junit.jupiter.api.DisplayName("squareElements: head.value = Util.square(head.value) -> ThrowNullPointerException")
    fun testSquareElements_ThrowNullPointerException() {
        val myLinkedList = MyLinkedList(null)
        
        /* This test fails because executable under testing com.github.ideaseeker.list.MyLinkedList.squareElements
        produces Runtime exception java.lang.NullPointerException */
        myLinkedList.squareElements()
    }
    
    /**
    <pre>
    Test invokes:
 *     Util::square once
 * iterates the loop {@code while(current.hasNext()) } once. 
 * Test throws NullPointerException in: current.value = Util.square(current.value);
 * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("squareElements: current.value = Util.square(current.value) -> ThrowNullPointerException")
    fun testSquareElements_CurrentHasNext_1() {
        val nodeMock = mock(Node::class.java)
        `when`(nodeMock.hasNext()).thenReturn(true)
        nodeMock.value = 0
        setField(nodeMock, "next", null)
        val myLinkedList = MyLinkedList(nodeMock)
        
        /* This test fails because executable under testing com.github.ideaseeker.list.MyLinkedList.squareElements
        produces Runtime exception java.lang.NullPointerException */
        myLinkedList.squareElements()
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
    //@org.junit.jupiter.api.DisplayName("asString: while(current.hasNext()) -> return stringBuilder.toString()")
    fun testAsString_CurrentHasNext() {
        val nodeMock = mock(Node::class.java)
        `when`(nodeMock.hasNext()).thenReturn(false)
        nodeMock.value = Int.MIN_VALUE
        
        val myLinkedListClazz = java.lang.Class.forName("com.github.ideaseeker.list.MyLinkedList")
        val nodeMockType = java.lang.Class.forName("com.github.ideaseeker.list.Node")
        val asStringMethod = myLinkedListClazz.getDeclaredMethod("asString", nodeMockType)
        asStringMethod.setAccessible(true)
        val asStringMethodArguments = kotlin.Array<Any?>(1) { null }
        asStringMethodArguments[0] = nodeMock
        val actual = asStringMethod.invoke(null, *asStringMethodArguments) as String
        
        val expected = "[-2147483648] -> "
        
        assertEquals(expected, actual)
    }
    ///endregion
    
    ///region ERROR SUITE for method asString(com.github.ideaseeker.list.Node)
    
    /**
    <pre>
    Test iterates the loop {@code while(current.hasNext()) } once. 
 * Test throws NullPointerException in: while(current.hasNext())
 * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("asString: while(current.hasNext()) -> ThrowNullPointerException")
    fun testAsString_CurrentHasNext_1() {
        val nodeMock = mock(Node::class.java)
        `when`(nodeMock.hasNext()).thenReturn(true)
        nodeMock.value = Int.MIN_VALUE
        setField(nodeMock, "next", null)
        
        /* This test fails because executable under testing com.github.ideaseeker.list.MyLinkedList.asString
        produces Runtime exception java.lang.NullPointerException */
        val myLinkedListClazz = java.lang.Class.forName("com.github.ideaseeker.list.MyLinkedList")
        val nodeMockType = java.lang.Class.forName("com.github.ideaseeker.list.Node")
        val asStringMethod = myLinkedListClazz.getDeclaredMethod("asString", nodeMockType)
        asStringMethod.setAccessible(true)
        val asStringMethodArguments = kotlin.Array<Any?>(1) { null }
        asStringMethodArguments[0] = nodeMock
        try {
            asStringMethod.invoke(null, *asStringMethodArguments)
        } catch (invocationTargetException: InvocationTargetException) {
            throw invocationTargetException.getTargetException()
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.github.ideaseeker.list.MyLinkedList.add
    
    ///region SUCCESSFUL EXECUTIONS for method add(com.github.ideaseeker.list.Node)
    
    /**
    <pre>
    Test invokes:
 *     Node::setNext once
 * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("add: -> NodeSetNext")
    fun testAdd_NodeSetNext() {
        val myLinkedList = createInstance("com.github.ideaseeker.list.MyLinkedList") as MyLinkedList
        val nodeMock = mock(Node::class.java)
        setField(myLinkedList, "tail", nodeMock)
        
        myLinkedList.add(null)
        
        val finalMyLinkedListTail = getFieldValue(myLinkedList, "tail")
        
        assertNull(finalMyLinkedListTail)
    }
    ///endregion
    
    ///region ERROR SUITE for method add(com.github.ideaseeker.list.Node)
    
    /**
    <pre>
    Test invokes:
 *     Node::setNext once
 * 
 * throws NullPointerException in: tail.setNext(node);
 * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("add: tail.setNext(node) : True -> ThrowNullPointerException")
    fun testAdd_NodeSetNext_1() {
        val myLinkedList = createInstance("com.github.ideaseeker.list.MyLinkedList") as MyLinkedList
        setField(myLinkedList, "tail", null)
        
        /* This test fails because executable under testing com.github.ideaseeker.list.MyLinkedList.add
        produces Runtime exception java.lang.NullPointerException */
        myLinkedList.add(null)
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
    //@org.junit.jupiter.api.DisplayName("toString: MyLinkedListAsString -> return asString(head)")
    fun testToString_MyLinkedListAsString() {
        val nodeMock = mock(Node::class.java)
        `when`(nodeMock.hasNext()).thenReturn(false)
        nodeMock.value = Int.MIN_VALUE
        val myLinkedList = MyLinkedList(nodeMock)
        
        val actual = myLinkedList.toString()
        
        val expected = "[-2147483648] -> "
        
        assertEquals(expected, actual)
    }
    
    /**
      */
    @Test
    //@org.junit.jupiter.api.DisplayName("toString: ")
    fun testToString() {
        val nodeMock = mock(Node::class.java)
        `when`(nodeMock.hasNext()).thenReturn(true, false)
        nodeMock.value = Int.MIN_VALUE
        nodeMock.next = nodeMock
        val myLinkedList = MyLinkedList(nodeMock)
        
        val actual = myLinkedList.toString()
        
        val expected = "[-2147483648] -> [-2147483648] -> "
        
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
    //@org.junit.jupiter.api.DisplayName("toString: return asString(head) : True -> ThrowNullPointerException")
    fun testToString_MyLinkedListAsString_1() {
        val nodeMock = mock(Node::class.java)
        `when`(nodeMock.hasNext()).thenReturn(true)
        nodeMock.value = Int.MIN_VALUE
        setField(nodeMock, "next", null)
        val myLinkedList = MyLinkedList(nodeMock)
        
        /* This test fails because executable under testing com.github.ideaseeker.list.MyLinkedList.toString
        produces Runtime exception java.lang.NullPointerException */
        myLinkedList.toString()
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
    //@org.junit.jupiter.api.DisplayName("toArray: result.add(head.value) : True -> ThrowNullPointerException")
    fun testToArray_ThrowNullPointerException() {
        val myLinkedList = MyLinkedList(null)
        
        /* This test fails because executable under testing com.github.ideaseeker.list.MyLinkedList.toArray
        produces Runtime exception java.lang.NullPointerException */
        myLinkedList.toArray()
    }
    
    /**
    <pre>
    Test invokes:
 *     ArrayList::add once
 * iterates the loop {@code while(current.hasNext()) } once. 
 * Test throws NullPointerException in: result.add(current.value);
 * </pre>
     */
    @Test
    //@org.junit.jupiter.api.DisplayName("toArray: result.add(current.value) : True -> ThrowNullPointerException")
    fun testToArray_CurrentHasNext() {
        val nodeMock = mock(Node::class.java)
        `when`(nodeMock.hasNext()).thenReturn(true)
        nodeMock.value = 0
        setField(nodeMock, "next", null)
        val myLinkedList = MyLinkedList(nodeMock)
        
        /* This test fails because executable under testing com.github.ideaseeker.list.MyLinkedList.toArray
        produces Runtime exception java.lang.NullPointerException */
        myLinkedList.toArray()
    }
    
    @Test(timeOut = 1000L)
    fun testToArray1() {
        val nodeMock = mock(Node::class.java)
        `when`(nodeMock.hasNext()).thenReturn(true)
        nodeMock.value = 0
        nodeMock.next = nodeMock
        val myLinkedList = MyLinkedList(nodeMock)
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        myLinkedList.toArray()
    }
    
    /**
      */
    @Test
    //@org.junit.jupiter.api.DisplayName("toArray: ")
    fun testToArray() {
        val nodeMock = mock(Node::class.java)
        `when`(nodeMock.hasNext()).thenReturn(false)
        nodeMock.value = 0
        val myLinkedList = MyLinkedList(nodeMock)
        
        val actual = myLinkedList.toArray()
        
        val expected = intArrayOf(0)
        assertArrayEquals(actual, expected)
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
        private fun createInstance(className: String): kotlin.Any? {
            val clazz: Class<*> = Class.forName(className)
            return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class::class.java)
                .invoke(getUnsafeInstance(), clazz)
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
