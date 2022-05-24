package by.epam.yanushkevich_irina.module2;

public class DecompositionTask15 {

    /* 15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
           (например, 1234, 5789). Для решения задачи использовать декомпозицию. */

    public static void main(String[] args) {

        int n;

        n = 4;

        findNumber(n);
    }


    public static void findNumber(int n) {

        if (n < 10 && n > 0) {

            int[] array = new int[n];
            int number;

            for (int j = 0; j < 10 - n; j++) {

                number = 0;

                for (int i = 0; i < n; i++) {

                    array[i] = i + j + 1;
                    number += array[i] * Math.pow(10, (n - 1 - i));
                }
                System.out.println(number);
            }

        } else {

            System.out.println("Amount of characters in a number can be from 1 to 9 (Integer type)");
        }
    }
}


