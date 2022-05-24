package by.epam.yanushkevich_irina.module2;

import java.util.Arrays;

public class OneDArraysSortingTask6 {

    /* 6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию. Делается это
          следующим образом: сравниваются два соседних элемента ai и a(i+1). Если ai <= a(i+1), то  на один элемент
          вперед. Если ai > a(i+1), то производится перестановка и сдвигаются на один элемент назад. Составить алгоритм
          этой сортировки.  */

    public static void main(String[] args) {

        int n;
        double[] a;

        n = 5;
        a = new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = Math.random();
        }

        System.out.println("Array a before sorting: " + Arrays.toString(a));

        for (int i = 1; i < n; i++) {

            for (int j = i; j >= 1; j--) {

                double temp;

                if (a[j - 1] > a[j]) {

                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;

                } else {

                    break;
                }
            }
        }

        System.out.println("Array a after sorting: " + Arrays.toString(a));
    }
}
