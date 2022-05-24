package by.epam.yanushkevich_irina.module2;

import java.util.Arrays;

public class OneDArraysSortingTask8 {

    /* 8.Даны дроби p1/q1, p2/q2, ..., pn/qn (pi, qi - натуральные). Составить программу, которая приводит эти дроби к
       общему знаменателю и упорядочивает их в порядке возрастания.  */

    public static void main(String[] args) {

        int n;
        int[] p;
        int[] q;
        int[] copyP;
        int comDenom;

        n = 5;
        p = new int[n];
        q = new int[n];
        copyP = new int[n];
        comDenom = 1;

        for (int i = 0; i < n; i++) {
            p[i] = i + 2;
            q[i] = i * 2 + 2;
            comDenom *= q[i];
        }

        System.arraycopy(p, 0, copyP, 0, n);

        System.out.println("p: " + Arrays.toString(p));
        System.out.println("q: " + Arrays.toString(q));
        System.out.println();

        for (int i = 0; i < n; i++) {
            p[i] = comDenom / q[i] * p[i];
        }

        for (int i = 1; i < n; i++) {

            for (int j = i; j >= 1; j--) {

                int temp;
                int tempC;

                if (p[j - 1] > p[j]) {

                    temp = p[j - 1];
                    p[j - 1] = p[j];
                    p[j] = temp;

                    tempC = copyP[j - 1];
                    copyP[j - 1] = copyP[j];
                    copyP[j] = tempC;

                } else {

                    break;
                }
            }
        }

        System.out.println("Fractions in ascending order: ");

        for (int i = 0; i < n; i++) {
            System.out.print(copyP[i] + "/" + comDenom / (p[i] / copyP[i]) + "  ");
        }

        System.out.println("\n");
        System.out.println("Fractions reduced to a common denominator in ascending order: ");

        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + "/" + comDenom + "  ");
        }

        System.out.println();
    }
}
