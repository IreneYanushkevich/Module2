package by.epam.yanushkevich_irina.module2;

public class DecompositionTask11 {

    //  11. Написать метод (методы), определяющий, в каком из данных двух чисел больше цифр.

    public static void main(String[] args) {

        int n;
        int k;

        n = 1234120;
        k = 456789;

        System.out.println("More digits are in the number: " + сompareDigitCount(n, k));
    }


    public static String сompareDigitCount(int number1, int number2) {

        String num1 = number1 + "";
        String num2 = number2 + "";

        if (num1.length() > num2.length()) {

            return num1;

        } else if (num1.length() < num2.length()) {

            return num2;

        } else {

            return "the amount of digits in the numbers is the same";
        }
    }
}
