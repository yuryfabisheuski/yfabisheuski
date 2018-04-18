package ru.job4j.array;

public class FindLoop {
    public static void main(String[] args) {

        int[] mass = new int[23];
        for (int i = 0; i < 23; i++) {
            mass[i] = i + 4;
            System.out.println(mass[i]);
        }
//        System.out.println(mass);
FindLoop finde= new FindLoop();
        int result=finde.indexOf(mass,8);
        System.out.println(result);
    }

    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

}
