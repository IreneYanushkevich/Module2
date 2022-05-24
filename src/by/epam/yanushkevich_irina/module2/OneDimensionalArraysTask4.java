package by.epam.yanushkevich_irina.module2;

public class OneDimensionalArraysTask4 {

    // 4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

    public static void main(String[] args) {

        double[] a;
        double max;
        double min;
        int iMax;
        int iMin;

        a = new double[]{12.14, -78.15, 29.30, 0.01, 15.89, 120.02};
        max = Double.MIN_VALUE;
        min = Double.MAX_VALUE;
        iMax = 0;
        iMin = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] > max) {
                max = a[i];
                iMax = i;
            }
            if (a[i] < min) {
                min = a[i];
                iMin = i;
            }
        }

        a[iMax] = min;
        a[iMin] = max;

        System.out.print("New array a: ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
