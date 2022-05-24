package by.epam.yanushkevich_irina.module2;

public class ArraysOfArraysTask6 {

    /* 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
                    1   1   1 ... 1    1    1
                    0   1   1 ... 1    1    0
                    0   0   1 ... 1    0    0
                   ... ... .........  ...  ...
                    0   1   1 ... 1    1    0
                    1   1   1...  1    1    1               */

    public static void main(String[] args) {

        int n;
        int[][] a;

        n = 20;
        a = new int[n][n];

        for (int i = 0; i < n; i++) {

            if (i < n / 2) {

                for (int j = i; j < n - i; j++) {
                    a[i][j] = 1;
                }
            } else {

                for (int j = n - 1 - i; j < i + 1; j++) {
                    a[i][j] = 1;
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
