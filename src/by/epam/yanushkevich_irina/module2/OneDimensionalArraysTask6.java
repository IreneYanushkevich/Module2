package by.epam.yanushkevich_irina.module2;

public class OneDimensionalArraysTask6 {

    /*  6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
           являются простыми числами. */

    public static void main(String[] args) {

        int n;
        double[] a;
        double sum;
        int count;

        n = 21;
        a = new double[n];
        sum = 0;

        for (int i = 0; i < n; i++) {
            a[i] = 5.0 * i / 2.0;
        }

        System.out.println("Array a: ");

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            System.out.printf("%.2f", a[i]);
            System.out.println();
        }

        System.out.println();
        System.out.print("Ordinal numbers that are prime: ");

        for (int i = 2; i < n; i++) {

            count = 0;

            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    count++;
                    if (count > 2) {
                        break;
                    }
                }
            }

            if (count == 2) {
                sum += a[i];
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.print("The sum of the numbers of these elements = ");
        System.out.printf("%.2f", sum);
        System.out.println();

    }
}
