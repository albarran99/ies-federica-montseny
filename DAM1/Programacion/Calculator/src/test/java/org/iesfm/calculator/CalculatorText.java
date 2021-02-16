package org.iesfm.calculator;

import org.iesfm.calculator.exceptions.CalculatorException;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorText {

    private Calculator calculator = new Calculator();

    private final static double DELTA = 0.000001;

    @Test
    public void divideTest() {
        double a = 3;
        double b = 5;

        double res = calculator.div(a, b);

        Assert.assertEquals(0.6, res, DELTA);
    }

    // esta linea equivale a poner el assert
    @Test(expected = ArithmeticException.class)
    public void divByZeroTest() throws ArithmeticException {
        double a = 3;
        double b = 0;

        calculator.div(a, b);
    }


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

    @Test
    public void divzeroNumberTest() {
        //configurar el escenario del test
        double a = 5;
        double b = 0;

        //ejecuta el text
        double res = calculator.div(a, b);

        Assert.assertTrue(Double.isInfinite(res));
    }

    @Test
    public void multiplyPositiveNumberTest() {
        //configurar el escenario del test
        double a = 5;
        double b = 0;

        //ejecuta el text
        double res = calculator.multiply(a, b);

        Assert.assertEquals(0, res, DELTA);
    }

    @Test
    public void multiplyNegativeNumberTest() {
        //configurar el escenario del test
        double a = -5;
        double b = 4;

        //ejecuta el text
        double res = calculator.multiply(a, b);

        Assert.assertEquals(-20, res, DELTA);
    }

    @Test
    public void negPositiveNumberTest() {
        //configurar el escenario del test
        double a = 5;

        //ejecuta el text
        double res = calculator.neg(a);

        Assert.assertEquals(-5, res, DELTA);
    }

    @Test
    public void negNegativeNumberTest() {
        //configurar el escenario del test
        double a = -5;

        //ejecuta el text
        double res = calculator.neg(a);

        Assert.assertEquals(5, res, DELTA);
    }

    @Test
    public void factorialPositiveNumber() {
        int a = 5;
        try {

            int res = calculator.factorial(a);
            Assert.assertEquals(120, res);

            //importante poner Assert.fail para que no pase el test
        } catch (CalculatorException e) {
            Assert.fail("El factorial de un positivo no deberia fallar");
        }
    }

    @Test
    public void factorialNegativeNumber() {
        int a = -5;
        try {

            int res = calculator.factorial(a);
            //hacemos que el test falle
            Assert.fail("Es imposible calcular el factorial de un negativo");

        } catch (CalculatorException e) {

        }
    }
}
