package ru.job4j.loop;

public class Counter {
    public int add(int start, int finish) {
        int counter = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0)
                counter = counter + i;
        }
        return counter;
    }
}