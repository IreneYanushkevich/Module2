package by.epam.yanushkevich_irina.module2;


public class DecompositionTask13 {

    /* 13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
           Найти и напечатать все пары «близнецов» из отрезка [n, 2n], где n - заданное натуральное число больше 2.
           Для решения задачи использовать декомпозицию. */

    public static void main(String[] args) {

        int n;
        n = 50;

        printTwins(n);
    }


    public static boolean checkPrime(int num) {

        boolean isPrime = true;

        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {

                isPrime = false;
                break;
            }
        }
        return isPrime;
    }


    public static void printTwins(int n) {

        for (int i = n; i <= 2 * n; i++) {

            if (checkPrime(i) && checkPrime(i + 2)) {

                System.out.println(i + " and " + (i + 2));
            }
        }
    }
}
