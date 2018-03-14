package ru.job4j.calculator;

/**
 * Корвертор валюты.
 */
public class Converter {/**
 * Конвертируем рубли в евро.
 * @param value рубли.
 * @return Евро.
 */
public int rubleToEuro(int value, int curs) {
    curs=70;
    int euro=  value / curs;
    return euro;

}

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллоры
     */
    public int rubleToDollar(int value) {
        return -1;
    }
    /**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return Рубли.
     */
    public int euroToRuble(int value) {
        return -1;
    }

    /**
     * Конвертируем доллары в рубли.
     * @param value доллары.
     * @return Рубли
     */
    public int dollarToRuble(int value) {
        return -1;
    }
}


