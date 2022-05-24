package by.epam.yanushkevich_irina.module2;

public class OneDimensionalArraysTask7 {

    //7. Даны действительные числа а1 ,а2 ,..., а2n. Найти max(a1+a2n, a2+(a2n-1), ..., an+(an+1)).

    public static void main(String[] args) {

        int n;
        double max;
        int index1;
        int index2;
        double[] a;
        int j;
        double sum;

        n = 10;
        max = Double.MIN_VALUE;
        index1 = 0;
        index2 = 0;
        a = new double[2 * n];

        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random() * 10;
        }

        System.out.println("Array a: ");

        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = ");
            System.out.printf("%.2f", a[i]);
            System.out.println();
        }

        for (int i = 0; i < a.length / 2; i++) {

            j = a.length - 1 - i;
            sum = a[i] + a[j];

            if (sum > max) {
                max = sum;
                index1 = i;
                index2 = j;
            }
        }

        System.out.println();
        System.out.print("Max = a[" + index1 + "]" + " + a[" + index2 + "] = ");
        System.out.printf("%.2f", max);
        System.out.println();
    }
}
