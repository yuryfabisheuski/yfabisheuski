package ru.job4j.array;

public class Matrix {

    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int a = 0; a < size; a++) {
            System.out.println(" ");
            for (int i = 0; i < size; i++) {
                table[a][i] = (a + 1) * (i + 1);
                System.out.print(table[a][i] + " ");
            }
        }
        return table;
    }

    //  public static void main(String[] args) {
    //    Matrix matrix = new Matrix();

    //   matrix.multiple(10  );
//        int[][] table = new int[10][10];
//        for (int a = 1; a < 10; a++) {
//            System.out.println(" ");
//            for (int i = 0; i < 10; i++) {
//                table[a][i] = a * i;
//                System.out.print(table[a][i] + " ");
//
//            }
//        }


    //   }
}