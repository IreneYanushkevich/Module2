package by.epam.yanushkevich_irina.module2;

public class ArraysOfArraysTask14 {

    /* 14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
           единиц равно номеру столбца. */

    public static void main(String[] args) {

        int m;
        int n;
        int[][] a;
        int randIndex;
        int count;

        m = 10;
        n = 8;
        a = new int[m][n];

        if (n > m) {
            System.out.println(" ! n must be less than m or equal to m (n<=m) !");
        } else {

            for (int j = 0; j < n; j++) {

                count = 0;

                do {
                    randIndex = (int) (Math.random() * m);

                    if (a[randIndex][j] == 0) {
                        count++;
                    }

                    a[randIndex][j] = 1;

                } while (count != (j + 1));
            }

            System.out.println("Array a: ");

            for (int i = 0; i < m; i++) {

                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j] + "\t");
                }

                System.out.println();
            }

            System.out.println();

        }
    }
}
