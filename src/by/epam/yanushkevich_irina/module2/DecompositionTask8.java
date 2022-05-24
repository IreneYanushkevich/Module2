package by.epam.yanushkevich_irina.module2;

import java.util.Arrays;

public class DecompositionTask8 {

    /* 8. Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
          Пояснение. Составить метод (методы) для вычисления суммы трех последовательно расположенных элементов
          массива с номерами от k до m.  */

    public static void main(String[] args) {

        int n;
        int[] d;
        int sum1_3;
        int sum3_5;
        int sum4_6;

        n = 7;

        d = fillArray(n);

        sum1_3 = sumElements(d, 1, 3);
        sum3_5 = sumElements(d, 3, 5);
        sum4_6 = sumElements(d, 4, 6);

        System.out.println("Sum of elements of the array d from 1 to 3 = " + sum1_3);
        System.out.println("Sum of elements of the array d from 3 to 5 = " + sum3_5);
        System.out.println("Sum of elements of the array d from 4 to 6 = " + sum4_6);
    }


    public static int[] fillArray(int n) {

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 50 - 25);
        }

        System.out.println("array d: " + Arrays.toString(array));
        System.out.println();
        return array;
    }


    public static int sumElements(int[] array, int fromNumber, int toNumber) {

        if (fromNumber < 0 || toNumber > array.length - 1) {
            System.out.println("Out of bounds array. The sum with result = 0 was calculated incorrectly!!!");
            return 0;
        }

        int sum = 0;

        for (int i = fromNumber; i <= toNumber; i++) {
            sum += array[i];
        }
        return sum;
    }
}
