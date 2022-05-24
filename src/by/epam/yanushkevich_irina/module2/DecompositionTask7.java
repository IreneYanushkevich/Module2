package by.epam.yanushkevich_irina.module2;

public class DecompositionTask7 {

    // 7. Написать метод (методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

    public static void main(String[] args) {

        int n;
        n = 9;

        System.out.println("The sum of factorials of all odd numbers from 1 to " + n + " is " + findSum(n));
    }


    public static int findFactorial(int number) {

        int f = 1;

        for (int i = 1; i <= number; i++) {
            f *= i;
        }
        return f;
    }


    public static long findSum(int n) {

        long sum = 0;

        for (int i = 1; i <= n; i += 2) {
            sum += findFactorial(i);
        }
        return sum;
    }
}


