package by.epam.yanushkevich_irina.module2;

public class OneDimensionalArraysTask3 {

    /* 3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
          положительных и нулевых элементов. */

    public static void main(String[] args) {

        double[] a;
        int n;
        int countPositive;
        int countNegative;
        int countZero;

        n = 20;
        countPositive = 0;
        countNegative = 0;
        countZero = 0;
        a = new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = Math.random() * 50.0 - 25.0;

            if (a[i] < 0) {
                countNegative++;
            }
            if (a[i] > 0) {
                countPositive++;
            }
            if (a[i] == 0) {
                countZero++;
            }
        }

        System.out.println("Array a: ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f", a[i]);
            System.out.println();
        }

        System.out.println("Number of negative elements = " + countNegative);
        System.out.println("Number of positive elements = " + countPositive);
        System.out.println("Number of zero elements = " + countZero);

    }
}
