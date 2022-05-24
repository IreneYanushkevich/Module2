package by.epam.yanushkevich_irina.module2;

public class DecompositionTask14 {

    /* 14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
           возведенных в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
           использовать декомпозицию. */

    public static void main(String[] args) {

        int k;

        k = 1000;

        System.out.println("Armstrong numbers from 1 to " + k + ":");

        for (int i = 1; i <= k; i++) {

            checkIfArmstrongNumber(i);
        }
    }


    public static int countSumOfDegrees(int number) {

        int degree;
        int sum;
        String length;
        int num;

        length = number + "";
        degree = length.length();

        sum = 0;

        while (number > 0) {

            num = number % 10;
            sum += Math.pow(num, degree);
            number /= 10;
        }
        return sum;
    }


    public static void checkIfArmstrongNumber(int number) {

        if (number == countSumOfDegrees(number)) {

            System.out.println(number);
        }
    }

}
