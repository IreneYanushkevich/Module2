package by.epam.yanushkevich_irina.module2;

public class ArraysOfArraysTask10 {

    // 10. Найти положительные элементы главной диагонали квадратной матрицы.

    public static void main(String[] args) {

        int[][] a = {
                {1, -8, 4, -5, 8, 3},
                {2, -7, 9, 0, -1, 2},
                {3, 4, 7, -4, 5, -1},
                {9, 6, -8, 8, 6, -4},
                {-2, 1, 1, 4, -9, 0},
                {1, 8, 4, 5, -8, -3}
        };

        int n;

        n = a.length;

        System.out.println("Positive elements of the main diagonal of the matrix: ");

        for (int i = 0; i < n; i++) {

            if (a[i][i] > 0) {
                System.out.print(a[i][i] + " ");
            }
        }

    }
}
