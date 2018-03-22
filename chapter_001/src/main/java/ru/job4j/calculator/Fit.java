package ru.job4j.calculator;

public class Fit { /**
 * Идеальный вес для мужщины.
 * @param height Рост.
 * @return идеальный вес.
 */
    final static int MAN_COF = 100;
    final static int WOMAN_COF = 115;
    final static double COF = 1.15;
public double manWeight (double height) {
   return (height-MAN_COF) * COF;


}

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight (double height) {
        return (height-WOMAN_COF) * COF;
    }
}
