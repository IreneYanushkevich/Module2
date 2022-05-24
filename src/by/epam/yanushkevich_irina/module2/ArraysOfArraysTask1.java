package by.epam.yanushkevich_irina.module2;

public class ArraysOfArraysTask1 {

    // 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

    public static void main(String[] args) {

        int[][] a = {
                {1, 8, 14, 35, 88, 3},
                {2, 7, 9, 0, 18, 12},
                {3, 14, 87, 14, 5, 14},
                {19, 6, 8, 78, 13, 4},
                {12, 12, 11, 4, 9, 0}
        };

        int m;
        int n;

        m = a.length;
        n = a[0].length;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j += 2) {

                if (a[0][j] > a[m - 1][j]) {
                    System.out.print(a[i][j] + "\t");
                }
            }

            System.out.println();
        }

    }
}
