package io.github.ideaseeker;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MainTest {
    ///region Test suites for executable io.github.ideaseeker.Main.divide
    
    ///region SUCCESSFUL EXECUTIONS for method divide(int, int)
    
    /**
    <pre>
    Test returns from: {@code return a / b; }
 * </pre>
     */
    @Test
    @DisplayName("divide: -> return a / b")
    public void testDivide_ReturnADivideB() {
        Main main = new Main();
        
        int actual = main.divide(-255, -255);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region ERROR SUITE for method divide(int, int)
    
    /**
    <pre>
    Test 
 * throws ArithmeticException in: return a / b;
 * </pre>
     */
    @Test
    @DisplayName("divide: return a / b : True -> ThrowArithmeticException")
    public void testDivide_ThrowArithmeticException() {
        Main main = new Main();
        
        /* This test fails because executable under testing io.github.ideaseeker.Main.divide
        produces Runtime exception java.lang.ArithmeticException: / by zero */
        main.divide(-255, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable io.github.ideaseeker.Main.divideAll
    
    ///region SUCCESSFUL EXECUTIONS for method divideAll(int[], int)
    
    /**
    <pre>
    Test does not iterate {@code for(int i = 0; i < array.length; ++i) }, returns from: {@code return array; }
 * </pre>
     */
    @Test
    @DisplayName("divideAll: -> return array")
    public void testDivideAll_ReturnArray() {
        Main main = new Main();
        int[] intArray = {};
        
        int[] actual = main.divideAll(intArray, 2);
        
        assertArrayEquals(intArray, actual);
    }
    
    /**
    <pre>
    Test iterates the loop {@code for(int i = 0; i < array.length; ++i) } once. 
 * Test later returns from: {@code return array; }
 * </pre>
     */
    @Test
    @DisplayName("divideAll: MainDivide -> return array")
    public void testDivideAll_MainDivide() {
        Main main = new Main();
        int[] intArray = {-255};
        
        int[] actual = main.divideAll(intArray, 1);
        
        assertArrayEquals(intArray, actual);
    }
    ///endregion
    
    ///region ERROR SUITE for method divideAll(int[], int)
    
    /**
    <pre>
    Test 
 * throws NullPointerException in: for(int i = 0; i < array.length; ++i)
 * </pre>
     */
    @Test
    @DisplayName("divideAll: for(int i = 0 i < array.length ++i) -> ThrowNullPointerException")
    public void testDivideAll_ThrowNullPointerException() {
        Main main = new Main();
        
        /* This test fails because executable under testing io.github.ideaseeker.Main.divideAll
        produces Runtime exception java.lang.NullPointerException */
        main.divideAll(null, -255);
    }
    
    /**
    <pre>
    Test iterates the loop {@code for(int i = 0; i < array.length; ++i) } once. 
 * Test throws ArithmeticException in: array[i] = divide(array[i], divisor);
 * </pre>
     */
    @Test
    @DisplayName("divideAll: array[i] = divide(array[i], divisor) -> ThrowArithmeticException")
    public void testDivideAll_MainDivide_1() {
        Main main = new Main();
        int[] intArray = {-255};
        
        /* This test fails because executable under testing io.github.ideaseeker.Main.divideAll
        produces Runtime exception java.lang.ArithmeticException: / by zero */
        main.divideAll(intArray, 0);
    }
    ///endregion
    
    ///endregion
    
}
