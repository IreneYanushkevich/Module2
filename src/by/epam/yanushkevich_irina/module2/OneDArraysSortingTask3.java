package by.epam.yanushkevich_irina.module2;

public class OneDArraysSortingTask3 {

    /* 3. Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= an. .Требуется переставить элементы
          так, чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
          элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
          повторяется. Написать алгоритм сортировки выбором. */

    public static void main(String[] args) {

        int n;
        int[] a;

        n = 10;
        a = new int[n];

        System.out.println("Array a before sorting: ");

        for (int i = 0; i < n; i++) {
            a[i] = i * i;
            System.out.print(a[i] + "\t");
        }

        for (int i = 0; i < n; i++) {

            int max;
            int maxIndex;
            int temp;

            max = a[i];
            maxIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (a[j] > max) {
                    max = a[j];
                    maxIndex = j;
                }
            }

            temp = a[i];
            a[i] = max;
            a[maxIndex] = temp;
        }

        System.out.println("\n");
        System.out.println("Array a after sorting: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }

        System.out.println();
    }
}
