package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class ConverterTest {

    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        double result = converter.rubleToEuro(70);
        assertThat(result, is(1D));
    }


    @Test
    public void  when60RubleToDollarThen1() {
        Converter converter = new Converter();
        double result = converter.rubleToDollar(60);
        assertThat(result, is(1D));
    }

    @Test
    public void euroToRuble() {
            Converter converter = new Converter();
            double result = converter.euroToRuble(1);
            assertThat(result, is(70D));
        }


    @Test
    public void dollarToRuble() {Converter converter = new Converter();
        double result = converter.dollarToRuble(1);
        assertThat(result, is(60D));
    }
}