package by.epam.yanushkevich_irina.module2;

public class ArraysOfArraysTask7 {

    /* 7. Сформировать квадратную матрицу порядка N по правилу:
          A[I,J] = sin((I^2-J^2)/N)  и подсчитать количество положительных элементов в ней. */

    public static void main(String[] args) {

        int n;
        double[][] a;
        int count;

        n = 10;
        a = new double[n][n];
        count = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                a[i][j] = Math.sin((i * i - j * j )/ n);

                if (a[i][j] > 0) {
                    count++;
                }
            }
        }

        System.out.println("Array a:");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.printf("%.2f", a[i][j]);
                System.out.print("\t");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("Number of positive elements = " + count);

    }
}
