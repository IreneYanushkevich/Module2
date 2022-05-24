package by.epam.yanushkevich_irina.module2;

public class ArraysOfArraysTask11 {

    /* 11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
           которых число 5 встречается три и более раз. */

    public static void main(String[] args) {

        int m;
        int n;
        int[][] a;
        int num;
        int repeat;
        int count;

        m = 10;
        n = 20;
        a = new int[m][n];
        num = 5;
        repeat = 3;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 16);
            }
        }

        System.out.println("Array a:");

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }

            System.out.println();
        }

        System.out.println();
        System.out.print("line numbers in which the digit " + num + " occurs " + repeat + " or more times: ");

        for (int i = 0; i < m; i++) {

            count = 0;

            for (int j = 0; j < n; j++) {

                if (a[i][j] == num) {
                    count++;
                }

                if (count >= repeat) {
                    System.out.print(i + " ");
                    break;
                }
            }
        }

        System.out.println();

    }
}
