package by.epam.yanushkevich_irina.module2;

public class DecompositionTask1 {

    /* 1. Написать метод (методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
          натуральных чисел: НОК(a,b)=(a*b)/НОД(a,b). */

    public static void main(String[] args) {

        int n;
        int m;

        n = 124;
        m = 32;

        System.out.println("Greatest Common Divisor of " + n + " and " + m + " is " + greatestCommonDivisor(n, m));
        System.out.println("Least Common Multiple of " + n + " and " + m + " is " + leastCommonMultiple(n, m));
    }


    public static int greatestCommonDivisor(int n, int m) {

        while (m != 0) {

            int mod;
            mod = n % m;
            n = m;
            m = mod;
        }

        return n;
    }


    public static int leastCommonMultiple(int n, int m) {

        return (n * m) / greatestCommonDivisor(n, m);
    }

}
