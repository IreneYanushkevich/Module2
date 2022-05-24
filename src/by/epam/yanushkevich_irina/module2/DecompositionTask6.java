package by.epam.yanushkevich_irina.module2;

public class DecompositionTask6 {

    // 6. Написать метод (методы), проверяющий, являются ли данные три числа взаимно простыми.

    public static void main(String[] args) {

        int a;
        int b;
        int c;

        a = 17;
        b = 34;
        c = 51;

        if (greatestCommonDivisor(greatestCommonDivisor(a, b), c) == 1)  {
            System.out.println("Numbers " + a + ", " + b + ", " + c + " are coprime numbers");
        } else {
            System.out.println("Numbers " + a + ", " + b + ", " + c + " are not coprime numbers");
        }
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
