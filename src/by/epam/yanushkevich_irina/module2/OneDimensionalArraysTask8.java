package by.epam.yanushkevich_irina.module2;

public class OneDimensionalArraysTask8 {

    /* 8. Дана последовательность целых чисел a1, a2, ..., an. Образовать новую последовательность, выбросив из
          исходной те члены, которые равны min(a1, a2, ..., an). */

    public static void main(String[] args) {

        int n;
        int[] a;
        int min;
        int countMin;
        int m;
        int[] b;
        int tempI;

        n = 15;
        a = new int[n];
        min = Integer.MAX_VALUE;
        countMin = 0;
        tempI = 0;

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                a[i] = 0;
            }

            if (i % 2 != 0) {
                a[i] = i * 2;
            }
        }

        System.out.print("Array a: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        for (int i = 0; i < n; i++) {

            if (a[i] < min) {
                min = a[i];
            }
        }

        for (int i = 0; i < n; i++) {

            if (a[i] == min) {
                countMin++;
            }
        }

        m = n - countMin;
        b = new int[m];

        while (tempI < m) {

            for (int i = 0; i < n; i++) {

                if (a[i] != 0) {
                    b[tempI] = a[i];
                    tempI++;
                }
            }
        }

        System.out.println();
        System.out.print("Array b: ");

        for (int i = 0; i < m; i++) {
            System.out.print(b[i] + " ");
        }

    }
}
