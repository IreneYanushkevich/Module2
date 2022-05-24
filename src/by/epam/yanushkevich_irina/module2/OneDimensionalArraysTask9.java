package by.epam.yanushkevich_irina.module2;

public class OneDimensionalArraysTask9 {

   /* 9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
         чисел несколько, то определить наименьшее из них. */

    public static void main(String[] args) {

        int[] a; // original array
        int[] b; // for counting repetitions
        int[] c; // for repeating numbers
        int maxRepeat;
        int lengthC;
        int indexC;
        int minNumber;

        a = new int[]{1, 1, 3, 1, 2, 3, 9, 3, 0};
        b = new int[a.length];
        maxRepeat = 0;
        lengthC = 0;
        indexC = 0;
        minNumber = Integer.MAX_VALUE;

        // Writing the number of repetitions of each element of array a[] to corresponding element of array b[]:
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    b[i]++;
                }
            }
        }

        // Finding the maximum number of repetitions:
        for (int i = 0; i < b.length; i++) {

            if (b[i] > maxRepeat) {
                maxRepeat = b[i];
            }
        }

        // Calculating the number of equal max repetitions:
        for (int i = 0; i < b.length; i++) {

            if (b[i] == maxRepeat) {
                lengthC++;
            }
        }

        c = new int[lengthC];

        // Filling array C with elements of array A that repeat the same maximum number of times:
        while (indexC < lengthC) {

            for (int i = 0; i < b.length; i++) {

                if (b[i] == maxRepeat) {
                    c[indexC] = a[i];
                    indexC++;
                }
            }
        }

        // Finding the min value of the most frequently repeated number
        for (int i = 0; i < c.length; i++) {

            if (c[i] < minNumber) {
                minNumber = c[i];
            }
        }

        System.out.println("The smallest number which is repeated more often is " + minNumber);
        System.out.println("It repeats " + maxRepeat + " times");

    }
}

