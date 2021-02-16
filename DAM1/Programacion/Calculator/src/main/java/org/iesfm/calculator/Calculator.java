package org.iesfm.calculator;

import org.iesfm.calculator.exceptions.CalculatorException;
import org.slf4j.LoggerFactory;

import org.slf4j.Logger;

public class Calculator implements ICalculator {
    private static Logger log = LoggerFactory.getLogger(Calculator.class);
    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    @Override
    public double substract(double a, double b) {
        return a - b;
    }

    @Override
    public double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Can't divide by zero");
        } else {
            return a / b;
        }
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double neg(double a) {
        return -a;
    }

    @Override
    public int factorial(int a) throws CalculatorException {
        if (a <= 0) {
            throw new CalculatorException();
        } else {
            int factorial = 1;
            for (int i = 1; i <= a; i++) {
                factorial = factorial * i;
            }
            return factorial;
        }
    }
}
