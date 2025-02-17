/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.namntp.mathutil;

/**
 *
 * @author nam27
 */
public class MathUtil {
    public static long getFactorial(int n) {
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument");
        
        if(n == 0 && n == 1)
            return 1;
        
        int count = 1;
        for (int i = 2; i <= n; i++) {
            count *= i;
        }
        return count;
    }
}
