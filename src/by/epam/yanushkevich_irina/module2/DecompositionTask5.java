package by.epam.yanushkevich_irina.module2;

import java.util.Arrays;

public class DecompositionTask5 {

    /* 5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
          которое меньше максимального элемента массива, но больше всех других элементов). */

    public static void main(String[] ags) {

        int n;
        int turn;
        int[] a;

        n = 10;
        turn = 2;

        a = fillArray(n);

        System.out.println("Array a: " + Arrays.toString(a));
        System.out.println("The second maximum number is " + findNextMaxElement(a, turn));
    }


    public static int[] fillArray(int n) {

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 50 - 25);
        }
        return array;
    }


    public static int findNextMaxElement(int[] array, int turnOfNumber) {

        Arrays.sort(array);

        return array[array.length - turnOfNumber];
    }

}



