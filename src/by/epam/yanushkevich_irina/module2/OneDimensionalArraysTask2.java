package by.epam.yanushkevich_irina.module2;

public class OneDimensionalArraysTask2 {

    /* 2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
          числом. Подсчитать количество замен. */

    public static void main(String[] args) {

        double z;
        int count;
        int n;
        double[] a;

        z = 50.0;
        count = 0;
        n = 10;
        a = new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = i * 7;
        }

        System.out.print("Array a: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        for (int i = 0; i < a.length; i++) {

            if (a[i] > z) {
                a[i] = z;
                count++;
            }
        }

        System.out.println();
        System.out.print("New array a: ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("Amount of array elements greater than " + z + " equals: " + count);

    }
}
