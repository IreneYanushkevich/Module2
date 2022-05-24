package by.epam.yanushkevich_irina.module2;

import java.util.Scanner;

public class ArraysOfArraysTask8 {

    /* 8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
          на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
          пользователь с клавиатуры. */

    public static void main(String[] args) {

        int[][] a = {
                {1, 8, 4, 5, 8, 3},
                {2, 7, 9, 0, 1, 2},
                {3, 4, 7, 4, 5, 1},
                {9, 6, 8, 8, 3, 4},
                {2, 1, 1, 4, 9, 0}
        };

        int m;
        int n;
        int temp;
        int k;
        int l;

        m = a.length;
        n = a[0].length;

        System.out.println("Let's swap the two columns. You need to enter column numbers from 0 to " + (n - 1) + ".");
        k = scan("Enter the first column number  >>>", n - 1);
        l = scan("Enter the second column number  >>>", n - 1);

        for (int i = 0; i < m; i++) {
                temp = a[i][k];
                a[i][k] = a[i][l];
                a[i][l] = temp;
        }

        System.out.println("New array a:");

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }

            System.out.println();
        }

    }

    public static int scan(String message, int lim) {

        Scanner scanner = new Scanner(System.in);

        int column;

        do {
            System.out.println(message);

            while (!scanner.hasNextInt()) {
                System.out.println(message);
                scanner.next();
            }

            column = scanner.nextInt();

        } while (column < 0 || column > lim);

        return column;
    }

}
