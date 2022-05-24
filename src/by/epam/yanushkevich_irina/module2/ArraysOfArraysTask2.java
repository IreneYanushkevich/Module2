package by.epam.yanushkevich_irina.module2;

public class ArraysOfArraysTask2 {

    // 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

    public static void main(String[] args) {

        int n;
        int[][] a;

        n = 10;
        a = new int[n][n];

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
        System.out.println("First Diagonal Elements:");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i][i] + "\t");
        }

        System.out.println();
        System.out.println("Second Diagonal Elements:");

        for (int i = 0; i < n; i++) {
            System.out.print(a[n - 1 - i][i] + "\t");
        }

        System.out.println();

    }
}