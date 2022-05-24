package by.epam.yanushkevich_irina.module2;

import java.util.Arrays;

public class DecompositionTask16 {

    /* 16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
           Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию. */

    public static void main(String[] args) {

        int n;
        long sum;
        int countEven;

        n = 3;
        sum = findSumOfArrayElement(makeArrayWithNumberFromOddDigits(n));
        countEven = countEvenDigits(sum);

        System.out.println("Sum of numbers from odd digits with digit capacity = " + n + ": " + sum);
        System.out.println("There is/are " + countEven + " even digits in the found sum");
    }

    public static int[] makeArrayWithNumberWithСertainDigitCapacity(int capacity) {

        int length;
        int[] array;

        length = (int) (Math.pow(10, capacity) - Math.pow(10, capacity - 1));
        array = new int[length];
        array[0] = (int) Math.pow(10, capacity - 1);

        for (int i = 1; i < length; i++) {
            array[i] = array[i - 1] + 1;
        }
        System.out.println("Array with all numbers with  digit capacity = " + capacity + ": ");
        System.out.println(Arrays.toString(array));
        System.out.println();
        return array;
    }

    public static int[] makeArrayWithNumberFromOddDigits(int capacity) {

        int length;
        int[] arrayWithNumberWithСertainDigitCapacity;
        int[] arrayWithNumberFromOddDigits;
        int fixNum;

        if (capacity > 7 || capacity < 1) {
            System.out.println("Allowed bit depth is from 1 to 7!");
            arrayWithNumberFromOddDigits = null;

        } else {
            length = (int) Math.pow(5, capacity);
            arrayWithNumberWithСertainDigitCapacity = makeArrayWithNumberWithСertainDigitCapacity(capacity);
            arrayWithNumberFromOddDigits = new int[length];

            int i = 0;

            while (i < length) {

                for (int j = 0; j < arrayWithNumberWithСertainDigitCapacity.length; j++) {
                    fixNum = arrayWithNumberWithСertainDigitCapacity[j];

                    while (arrayWithNumberWithСertainDigitCapacity[j] > 0) {

                        if (arrayWithNumberWithСertainDigitCapacity[j] % 10 % 2 != 0) {
                            arrayWithNumberWithСertainDigitCapacity[j] /= 10;

                            if (arrayWithNumberWithСertainDigitCapacity[j] == 0) {
                                arrayWithNumberFromOddDigits[i] = fixNum;
                                i++;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            System.out.println("Array with numbers from odd digits with digit capacity = " + capacity + ": ");
            System.out.println(Arrays.toString(arrayWithNumberFromOddDigits));
            System.out.println();
        }
        return arrayWithNumberFromOddDigits;
    }


    public static long findSumOfArrayElement(int[] array) {

        long sum = 0;

        if (array != null) {

            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
        }
        return sum;
    }


    public static int countEvenDigits(long number) {

        int count = 0;

        while (number > 0) {

            if (number % 10 % 2 == 0) {
                count++;
            }
            number = number / 10;
        }
        return count;
    }
}



