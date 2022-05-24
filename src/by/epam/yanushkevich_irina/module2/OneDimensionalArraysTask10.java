package by.epam.yanushkevich_irina.module2;

public class OneDimensionalArraysTask10 {

    /* 10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
           элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать. */

    public static void main(String[] args) {

        int n;
        int[] a;
        int count;

        n = 15;
        a = new int[n];
        count = 0;

        for (int i = 0; i < n; i++) {
            a[i] = i + 5;
        }

        for (int i = 0; i < n; i++) {

            if (i % 2 != 0) {
                count++;
            } else {
                a[i - count] = a[i];
            }
        }

        for (int i = n - count; i < n; i++) {
            a[i] = 0;
        }

        System.out.print("New array a: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }
}
