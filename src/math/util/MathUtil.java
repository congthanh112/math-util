/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import thanhpdc.util.MathUtility;

/**
 *
 * @author Cong Thanh
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long expected = 120;
        long actual = MathUtility.getFactorial(5);   
        System.out.println(actual);
    }
    
}


