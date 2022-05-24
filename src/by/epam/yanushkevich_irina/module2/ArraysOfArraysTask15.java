package by.epam.yanushkevich_irina.module2;

public class ArraysOfArraysTask15 {

    // 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

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
        int max;

        m = a.length;
        n = a[0].length;
        max = Integer.MIN_VALUE;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                if (i % 2 != 0 || j % 2 != 0) {
                    a[i][j] = max;
                }
            }
        }

        System.out.println("New array a: ");

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }

            System.out.println();
        }

        System.out.println();

    }
}
