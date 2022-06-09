/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebafibonacci;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Karen Parrao
 */
public class FibonacciTest {
    
    Fibonacci fibonacci;
    
    public FibonacciTest() {
    fibonacci = new Fibonacci();    
    }

    @Test
    public void testCero() {

        boolean expResult = false;
        boolean result = fibonacci.calcularFibonacci(0);
        assertEquals(expResult, result);
    }
    
    @Test (expected = NumberFormatException.class)
    public void testLetra() { 
        int limite = Integer.parseInt("abc");
        fibonacci.calcularFibonacci(limite);
    }
    
    
}
