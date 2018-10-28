package com.prototype.iasjem.bmicalculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class FunctionsUnitTest {
    @Test
    public void isFormulmasCorrect() throws Exception {
        MetricFormula formula = new MetricFormula(61,1.89);
        assertEquals(17.1,Math.round(formula.computeBMI()*100)/100 ,1);
    }
}