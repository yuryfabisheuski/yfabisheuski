package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenOneSubtractsOneThenZero() {
        Calculator calc = new Calculator();
        calc.subtract(1D, 1D);
        double result = calc.getResult();
        double expected = 0D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddOnedivOneThenTwo() {
        Calculator calc = new Calculator();
        calc.div(1d, 1d);
        double result = calc.getResult();
        double expected = 1D / 1D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddOnemultipleOneThenTwo() {
        Calculator calc = new Calculator();
        calc.multiple(1d, 1d);
        double result = calc.getResult();
        double expected = 1D * 1D;
        assertThat(result, is(expected));
    }
}
