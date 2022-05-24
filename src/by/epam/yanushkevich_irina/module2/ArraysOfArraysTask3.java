package by.epam.yanushkevich_irina.module2;

public class ArraysOfArraysTask3 {

    // 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

    public static void main(String[] args) {

        int n;
        int[][] a;
        int k;
        int p;

        n = 10;
        a = new int[n][n];
        k = 5;
        p = 2;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                a[i][j] = j * 2 + i;
            }
        }

        System.out.println("Array a[][]:");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("Printing the " + k + " line:");

        for (int j = 0; j < n; j++) {
            System.out.print(a[k][j] + "\t");
        }

        System.out.println("\n");
        System.out.println("Printing the " + p + " column:");

        for (int i = 0; i < n; i++) {
            System.out.println(a[i][p]);
        }

        System.out.println();

    }
}
