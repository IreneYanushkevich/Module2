package by.epam.yanushkevich_irina.module2;

import java.util.Arrays;

public class DecompositionTask12 {

    /* 12. Даны натуральные числа К и N. Написать метод (методы) формирования массива А, элементами которого
           являются числа, сумма цифр которых равна К и которые не большее N. */

    public static void main(String[] args) {

        int length;
        int k;
        int n;
        int[] a;

        length = 10;
        k = 14;
        n = 1000;

        a = fillArrayLimitNumAndSumDigits(length, k, n);

        System.out.println(Arrays.toString(a));
    }

    public static int[] fillArrayLimitNumAndSumDigits(int arrayLength, int sumDigits, int limitNum) {

        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * limitNum);

            int sum = 0;
            int num = array[i];

            do {
                sum += num % 10;
                num /= 10;

            } while (num > 0);

            if (sum != sumDigits) {

                i--;
            }
        }
        return array;
    }
}
