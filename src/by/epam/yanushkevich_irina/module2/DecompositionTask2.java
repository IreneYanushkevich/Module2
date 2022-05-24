package by.epam.yanushkevich_irina.module2;

public class DecompositionTask2 {

    // 2. Написать метод (методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

    public static void main(String[] args) {

        int n;
        int m;
        int k;
        int l;

        n = 510;
        m = 96;
        k = 72;
        l = 180;

        System.out.println("Greatest Common Divisor is " + greatestCommonDivisor(n, m, k, l));
    }


    public static int greatestCommonDivisor(int n, int m, int k, int l) {

        return greatestCommonDivisor(l, greatestCommonDivisor(k, greatestCommonDivisor(n, m)));
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

}
