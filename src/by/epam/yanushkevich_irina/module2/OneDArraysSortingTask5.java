package by.epam.yanushkevich_irina.module2;

import java.util.Arrays;

public class OneDArraysSortingTask5 {

    /* 5. Сортировка вставками. Дана последовательность чисел a1, a2, ..., an. Требуется переставить числа в порядке
          возрастания. Делается это следующим образом. Пусть a1, a2, ..., ai - упорядоченная последовательность, т. е.
          a1 <= a2 <= ... <= ai. Берется следующее число a(i+1) и вставляется в последовательность так, чтобы новая
          последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i+1 до n
          не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
          с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции. */

    public static void main(String[] args) {

        int n;
        int[] a;

        n = 10;
        a = new int[n];

        System.out.println("Array a before sorting: ");

        for (int i = 0; i < n; i++) {
            a[i] = i;
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        for (int i = 1; i < n; i++) {

            int newElement;
            int index;

            newElement = a[i];
            index = binarySearch(a, 0, i, newElement);

            if (index < 0) {
                index = -(index) - 1;
            }

            System.arraycopy(a, index, a, index + 1, i - index);
            a[index] = newElement;
            System.out.println(Arrays.toString(a));
        }


        System.out.println("\n");
        System.out.println("Array a after sorting: ");
        System.out.println(Arrays.toString(a));
    }

    public static int binarySearch(int[] arr, int from, int to, int element) {

        int firstIndex;
        int lastIndex;
        int middleIndex;
        int middleNum;

        firstIndex = from;
        lastIndex = to - 1;

        while (firstIndex <= lastIndex) {

            middleIndex = (lastIndex + firstIndex) / 2;
            middleNum = arr[middleIndex];

            if (middleNum == element) {
                return middleIndex;

            } else if (middleNum < element) {
                firstIndex = middleIndex + 1;

            } else if (middleNum > element) {
                lastIndex = middleIndex - 1;
            }
        }
        return -(firstIndex + 1);
    }
}

