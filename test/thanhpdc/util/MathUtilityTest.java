/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thanhpdc.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static thanhpdc.util.MathUtility.getFactorial;

/**
 *
 * @author Cong Thanh
 */
public class MathUtilityTest {

    @Test
    public void getFactorial_Runswell_IfValidArgument() {
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(1, MathUtility.getFactorial(0));
    }
//    @Test(expected = IllegalArgumentException.class)
//    public void getFactorial_ThrowException_IfValidArgument() {
//        getFactorial(-5);
//    }

}
