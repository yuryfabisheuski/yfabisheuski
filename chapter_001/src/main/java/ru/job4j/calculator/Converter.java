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
    public double rubleToEuro(int value) {
        int curs = 70;
        double euro = (double)value / curs;
        return euro;
    }

    /**
     * Конвертируем рубли в доллары.
     *
     * @param value рубли.
     * @return Доллоры
     */
    public double rubleToDollar(int value) {
        int curs = 60;
        double dollar = (double)value / curs;
        return dollar;
    }

    /**
     * Конвертируем евро в рубли.
     *
     * @param value евро.
     * @return Рубли.
     */
    public double euroToRuble(int value) {
        int curs = 70;
        double ruble =(double)value * curs;
        return ruble;
    }

    /**
     * Конвертируем доллары в рубли.
     *
     * @param value доллары.
     * @return Рубли
     */
    public double dollarToRuble(int value) {
        int curs = 60;
        double ruble =(double)value * curs;
        return ruble;

    }
}


