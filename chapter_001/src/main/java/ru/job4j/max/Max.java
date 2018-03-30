package ru.job4j.max;

public class Max {


    public int max(int first, int second) {
        int max = first < second ? second : first;
        return max;

    }

    public int max(int first, int second, int third) {

        int temp = this.max(first, second);
        int max = this.max(third, temp);
        return max;

    }

}