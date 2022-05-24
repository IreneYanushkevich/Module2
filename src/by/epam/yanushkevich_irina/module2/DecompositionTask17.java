package by.epam.yanushkevich_irina.module2;

public class DecompositionTask17 {

    /* 17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
           действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию. */

    public static void main(String[] args) {

        int n;

        n = 1000;

        System.out.println("Number of actions = " + countNumberOfActions(n));
    }

    public static int findSumOfDigits(int number) {

        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }


    public static int findDifference(int number1, int number2) {

        return number1 - number2;
    }


    public static int countNumberOfActions(int number) {

        int count = 0;

        if (number <= 0) {
            System.out.println("Number must be more than 0!");
        } else {

            while (number > 0) {
                number = findDifference(number, findSumOfDigits(number));
                count++;
            }
        }
        return count;
    }
}
