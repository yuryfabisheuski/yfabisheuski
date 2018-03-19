package ru.job4j.calculator;

/**
 * Корвертор валюты.
 */
public class Converter {


    /**
     * Конвертируем рубли в евро.
     *
     * @param value рубли.
     * @return Евро.
     */
    final static int CURSEURO = 70;
    final static int CURSUSD = 60;
    public double rubleToEuro(int value) {

        return (double)value / CURSEURO;}

    /**
     * Конвертируем рубли в доллары.
     *
     * @param value1 рубли.
     * @return Доллоры
     */
    public double rubleToDollar(int value1) {

        return (double)value1 / CURSUSD;
    }

    /**
     * Конвертируем евро в рубли.
     *
     * @param value2 евро.
     * @return Рубли.
     */
    public double euroToRuble(int value2) {
        return (double)value2 * CURSEURO;

    }

    /**
     * Конвертируем доллары в рубли.
     *
     * @param value3 доллары.
     * @return Рубли
     */
    public double dollarToRuble(int value3) {

        return (double)value3 * CURSUSD ;


    }
}


