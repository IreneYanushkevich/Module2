package by.epam.yanushkevich_irina.module2;

public class ArraysOfArraysTask5 {

    /* 5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
                    1   1   1 ... 1    1    1
                    2   2   2 ... 2    2    0
                    3   3   3 ... 3    0    0
                   ... ... .........  ...  ...
                   n-1 n-1  0 ... 0    0    0
                    n   0   0 ... 0    0    0               */

    public static void main(String[] args) {

        int n;
        int[][] a;

        n = 8;
        a = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                a[i][j] = i + 1;
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
