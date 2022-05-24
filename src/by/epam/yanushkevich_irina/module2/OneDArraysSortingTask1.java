package by.epam.yanushkevich_irina.module2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class OneDArraysSortingTask1 {

    /* 1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
          один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
          дополнительный массив. */

    public static void main(String[] args) {

        int k;
        int aLength;
        int bLength;
        int fill;
        int[] a;
        int[] b;

        k = 5;
        aLength = 10;
        bLength = 5;
        fill = 20;
        a = new int[aLength];
        b = new int[bLength];

        System.out.print("Array a: ");

        for (int i = 0; i < aLength; i++) {
            a[i] = (int) (Math.random() * fill);
            System.out.print(a[i] + " ");
        }

        System.out.println("\n");
        System.out.print("Array b: ");

        for (int i = 0; i < bLength; i++) {
            b[i] = fill + (int) (Math.random() * fill);
            System.out.print(b[i] + " ");
        }

        System.out.println("\n");
        System.out.println("Result:");
        System.out.println(Arrays.toString(IntStream.concat(IntStream.concat(Arrays.stream(a, 0, k + 1),
                Arrays.stream(b, 0, b.length)), Arrays.stream(a, k + 1, a.length)).toArray()));

    }
}
