package by.epam.yanushkevich_irina.module2;

import java.util.Arrays;

public class DecompositionTask10 {

    /* 10. Дано натуральное число N. Написать метод (методы) для формирования массива, элементами которого
           являются цифры числа N. */

    public static void main(String[] args) {

        int n;
        int[] arrayFromN;

        n = 100456789;

        arrayFromN = makeArrayFromNumber(n);

        System.out.println("Converting natural number " + n + " to array: " + Arrays.toString(arrayFromN));

    }


    public static int[] makeArrayFromNumber(int number) {

        String length = number + "";

        int[] array = new int[length.length()];

        for (int i = 0; i < array.length; i++) {

            if (number < 10) {
                array[i] = number;
            } else {
                array[i] = (int) (number / Math.pow(10, (array.length - 1 - i)));
                number = number - (int) (array[i] * Math.pow(10, (array.length - 1 - i)));
            }
        }
        return array;
    }

}
