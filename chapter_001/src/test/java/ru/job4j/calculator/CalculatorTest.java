package ru.job4j.calculator;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {@Test
public void whenAddOnePlusOneThenTwo() {
    Calculator calc = new Calculator();
    calc.add(1D, 1D);
    double result = calc.getResult();
    double expected = 2D;
    assertThat(result, is(expected));
}
    public void whenAddOneSubtractsOneThenZero() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.subtractResult();
        double expected = 0D;
        assertThat(result, is(expected));
}
    public void whenAddOnedivOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.divResult();
        double expected = 1D/1D;
        assertThat(result, is(expected));
}
    public void whenAddOnemultipleOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.multipleResult();
        double expected = 1D*1D;
        assertThat(result, is(expected));
}}
