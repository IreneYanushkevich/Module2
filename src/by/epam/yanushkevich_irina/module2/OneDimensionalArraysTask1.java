package by.epam.yanushkevich_irina.module2;

public class OneDimensionalArraysTask1 {

    // 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

    public static void main(String[] args) {

        int k;
        int sum;
        int[] a;

        k = 5;
        sum = 0;
        a = new int[]{10, 17, 65, 91, 13, 19, 77, 100};

        for (int i = 0; i < a.length; i++) {

            if (a[i] % k == 0) {
                sum += a[i];
            }
        }

        System.out.println("Sum of elements that are multiples of " + k + " = " + sum);

    }
}
