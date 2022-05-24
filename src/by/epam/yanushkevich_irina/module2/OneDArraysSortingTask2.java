package by.epam.yanushkevich_irina.module2;

import java.util.*;

public class OneDArraysSortingTask2 {

    /* 2. Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. Образовать из них новую
          последовательность чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не
          использовать.  */

    public static void main(String[] args) {

        int n;
        int m;
        int[] a;
        int[] b;
        int length;
        List<Integer> l;


        n = 10;
        m = 15;
        a = new int[n];
        b = new int[m];
        length = n + m;

        System.out.println("Array a: ");

        for (int i = 0; i < n; i++) {
            a[i] = i * 3;
            System.out.print(a[i] + "\t");
        }

        System.out.println("\n");
        System.out.println("Array b: ");

        for (int i = 0; i < m; i++) {
            b[i] = i * 2 + 2;
            System.out.print(b[i] + "\t");
        }

        l = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            l.add(a[i]);

        }
        for (int i = n; i < length; i++) {
            l.add(b[i - n]);
        }

        Collections.sort(l);
        System.out.println("\n");
        System.out.println("New sequence: " + l);


    }
}
