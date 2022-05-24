package by.epam.yanushkevich_irina.module2;

public class ArraysOfArraysTask9 {

    /* 9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
    столбец содержит максимальную сумму. */

    public static void main(String[] args) {

        int[][] a = {
                {1, 8, 4, 5, 8, 3},
                {2, 7, 9, 0, 1, 2},
                {3, 4, 7, 4, 5, 1},
                {9, 6, 8, 8, 6, 4},
                {2, 1, 1, 4, 9, 0}
        };

        int m;
        int n;
        int[] sum;
        int max;

        m = a.length;
        n = a[0].length;
        sum = new int[n];
        max = 0;

        for (int j = 0; j < n; j++) {

            for (int i = 0; i < m; i++) {
                sum[j] += a[i][j];
            }
        }

        System.out.print("Array sum: ");

        for (int i = 0; i < n; i++) {
            System.out.print(sum[i] + " ");

            if (sum[i] > max) {
                max = sum[i];
            }
        }

        System.out.println();
        System.out.println("Max sum of elements = " + max + ".");
        System.out.print("Column(-s) that contain the max sum: ");

        for (int i = 0; i < n; i++) {

            if (sum[i] == max) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

    }
}
