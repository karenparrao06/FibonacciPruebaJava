/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebafibonacci;

/**
 *
 * @author Karen Parrao
 */
public class Fibonacci {
    
    public boolean calcularFibonacci(int numero){
        
        if (numero <= 0 || numero > 500) {
            return false;
        }
       
        int a, b, i, auxiliar;
        a = 0;
        b = 1;

        for (i = 0; i < numero; i++) {
            auxiliar = a;
            a = b;
            b = auxiliar + a;
            System.out.println(a);
        }
        
        return true;
    }
    
}
