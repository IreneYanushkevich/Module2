package by.epam.yanushkevich_irina.module2;

public class ArraysOfArraysTask4 {

    /* 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
                1    2    3    ...   n
                n   n-1  n-2   ...   1
                1    2    3    ...   n
                n   n-1  n-2   ...   1
                .    .    .     .   ...
                n   n-1  n-2   ...   1     */

    public static void main(String[] args) {

        int n;
        int[][] a;

        n = 8;
        a = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i % 2 == 0) {
                    a[i][j] = j + 1;
                } else {
                    a[i][j] = n - j;
                }
            }
        }

        System.out.println("Array a:");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }

            System.out.println();
        }

    }
}
