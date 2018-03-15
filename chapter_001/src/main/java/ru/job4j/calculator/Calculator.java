package ru.job4j.calculator;

/**
 * Calculator.
 *
 * @author Yury Fabisheuski (fabishevskij@gmail.com)
 */

public class Calculator {
    private double result;
    /**
     * Method add.
     * @param first second.
     *
     */
    /**
     * Method subtract.
     *
     * @param first second.
     */

    public void add(double first, double second) {
        this.result = first + second;
    }

    public double getResult() {
        return this.result;
    }

    public void subtract(double first, double second1) {
        this.result = first - second1;
    }

    /**
     * Method div.
     *
     * @param first second.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Method multiple.
     *
     * @param first second.
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }


}