package by.epam.yanushkevich_irina.module2;

public class ArraysOfArraysTask13 {

    // 13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

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
        int temp;
        boolean sorted;

        m = a.length;
        n = a[0].length;

        for (int j = 0; j < n; j++) {

            sorted = false;

            while (!sorted) {

                sorted = true;

                for (int i = 0; i < m - 1; i++) {

                    if (a[i][j] > a[i + 1][j]) {
                        temp = a[i][j];
                        a[i][j] = a[i + 1][j];
                        a[i + 1][j] = temp;
                        sorted = false;
                    }
                }
            }
        }

        System.out.println("An array a sorted by ascending element values in columns: ");

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }

            System.out.println();
        }

        System.out.println();

        for (int j = 0; j < n; j++) {

            sorted = false;

            while (!sorted) {

                sorted = true;

                for (int i = 0; i < m - 1; i++) {

                    if (a[i][j] < a[i + 1][j]) {
                        temp = a[i][j];
                        a[i][j] = a[i + 1][j];
                        a[i + 1][j] = temp;
                        sorted = false;
                    }
                }
            }
        }

        System.out.println("An array a sorted by descending element values in columns: ");

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }

            System.out.println();
        }

        System.out.println();

    }
}
