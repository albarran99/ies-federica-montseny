package org.iesfm.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorText {

    private Calculator calculator = new Calculator();

    private final static  double DELTA = 0.000001;

    @Test
    public void sumPositiveNumbersTest() {
        //configurar el escenario del test
        double a = 2;
        double b = 5;

        //ejecuta el text
        double res = calculator.sum(a, b);

        Assert.assertEquals(7, res, DELTA);
    }

    @Test
    public void sumNegativeNumbersTest() {
        //configurar el escenario del test
        double a = -2;
        double b = -5;

        //ejecuta el text
        double res = calculator.sum(a, b);

        Assert.assertEquals(-7, res, DELTA);
    }

    @Test
    public void subtractPositiveNumberTest() {
        //configurar el escenario del test
        double a = 2;
        double b = 5;

        //ejecuta el text
        double res = calculator.substract(a, b);

        Assert.assertEquals(-3, res, DELTA);
    }

    @Test
    public void subtractNegativeNumberTest() {
        //configurar el escenario del test
        double a = -2;
        double b = -5;

        //ejecuta el text
        double res = calculator.substract(a, b);

        Assert.assertEquals(3, res, DELTA);
    }

    @Test
    public void divPositiveNumberTest() {
        //configurar el escenario del test
        double a = 2;
        double b = 5;

        //ejecuta el text
        double res = calculator.div(a, b);

        Assert.assertEquals(0.4, res, DELTA);
    }

    @Test
    public void divNegativeNumberTest() {
        //configurar el escenario del test
        double a = 1;
        double b = 3;

        //ejecuta el text
        double res = calculator.div(a, b);

        Assert.assertEquals(0.3333333333333333, res, DELTA);
    }
}
