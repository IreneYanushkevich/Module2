package by.epam.yanushkevich_irina.module2;

import java.util.Arrays;

public class OneDArraysSortingTask7 {

    /*7. Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <= ... <= an и
         b1 <= b2 <= ... <= bm. Требуется указать те места, на которые нужно вставлять элементы последовательности
         b1 <= b2 <= ... <= bm в первую последовательность так, чтобы новая последовательность оставалась возрастающей.*/

    public static void main(String[] args) {

        int n;
        int m;
        double[] a;
        double[] b;

        n = 5;
        m = 7;
        a = new double[n];
        b = new double[m];

        for (int i = 0; i < n; i++) {
            a[i] = 0.5 * i;
        }

        for (int i = 0; i < m; i++) {
            b[i] = 0.6 * i + 0.2;
        }

        System.out.println("Array a: " + Arrays.toString(a));
        System.out.println("Array b: " + Arrays.toString(b));
        System.out.println();

        int i;
        int j;

        i = 0;
        j = 0;

        while (true) {

            if (i < n && j < m) {

                if (a[i] > b[j]) {
                    System.out.println("insert b[" + j + "]" + " before a[" + i + "]");
                    j++;
                } else {
                    i++;
                }

            } else if (i == n) {
                System.out.println("Insert b[" + j + "] - b[" + (m - 1) + "] after the last element of array a");
                break;

            } else {
                break;
            }
        }

    }
}
