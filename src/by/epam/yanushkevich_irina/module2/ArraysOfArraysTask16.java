package by.epam.yanushkevich_irina.module2;

import java.util.Scanner;

public class ArraysOfArraysTask16 {

    /* 16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел
           1, 2, 3, ..., n^2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей
           равны между собой. Построить такой квадрат. Пример магического квадрата порядка 3:
                        6   1   8
                        7   5   3
                        2   9   4      */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;

        do {
            System.out.println("Enter a positive integer n (n > 2) for generating a magic square >> ");

            while (!scanner.hasNextInt()) {
                System.out.println("Enter a positive integer n (n > 2) for generating a magic square >> ");
                scanner.next();
            }
            n = scanner.nextInt();

        } while (n <= 2);

        int[][] magic;
        magic = squareType(n);

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(magic[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static int[][] squareType(int n) {

        if (n % 2 != 0) return oddOrder(n);             // нечетная размерность
        else if (n % 4 != 0) return evenOddOrder(n);    // четно-нечетная размерность (кратна 2,некратна 4)
        return evenEvenOrder(n);                        // четно-четная размерность (кратна 2 и 4)
    }


    private static int[][] oddOrder(int n) {
        // "Сиамский метод" - по диагонали верх и враво, если занято - вертикально вниз и т.д.

        int[][] magic;
        int count;
        int i;
        int j;

        magic = new int[n][n];
        count = 1;
        i = 0;
        j = n / 2;

        do {

            magic[i][j] = count;
            count++;

            if (i == 0 && j >= n - 1 && magic[n - 1][0] != 0) {

                i++;

            } else {
                i--;

                if (i < 0) {

                    i = n - 1;
                }

                j++;

                if (j == n) {

                    j = 0;
                }

                if (magic[i][j] != 0) {

                    i += 2;
                    j--;
                }
            }

        } while (count != n * n + 1);

        return magic;
    }


    private static int[][] evenOddOrder(int n) {
        // Описание метода http://www.klassikpoez.narod.ru/mojmetod.htm

        int[][] magic;
        int half;
        int[][] quarter;


        magic = new int[n][n];

        half = n / 2;
        quarter = oddOrder(half);

        // 1/4 матрицы (левая верхняя) равна нечетной
        for (int i = 0; i < half; i++) {

            for (int j = 0; j < half; j++) {

                magic[i][j] = quarter[i][j];
            }
        }

        // 2/4 матрицы (правая верхняя равна нечетной + 2*half*half)
        for (int i = 0; i < half; i++) {

            for (int j = half; j < n; j++) {

                int x;
                x = j - half;
                magic[i][j] = (quarter[i][x] + 2 * half * half);
            }
        }

        // 3/4 матрицы (нижняя левая равна нечетной + 3*half*half)
        for (int i = half; i < n; i++) {

            for (int j = 0; j < half; j++) {

                int x;
                x = i - half;
                magic[i][j] = (quarter[x][j] + 3 * half * half);
            }
        }

        // 4/4 матрицы (нижняя правая равна нечетной + half * half)
        for (int i = half; i < n; i++) {

            for (int j = half; j < n; j++) {

                int x;
                int y;
                x = i - half;
                y = j - half;
                magic[i][j] = (quarter[x][y] + half * half);
            }
        }

        // Меняем местами элементы для получения магического квадрата
        int swap = 0;

        for (int i = 6; i < n; i++) {

            if ((i % 4 != 0) && (i % 2 == 0)) {

                swap++;
            }
        }

        for (int j = n / 2 - swap; j <= n / 2 + swap - 1; j++) {

            for (int i = 0; i < quarter.length; i++) {

                int temp;
                temp = magic[i][j];
                magic[i][j] = magic[half + i][j];
                magic[half + i][j] = temp;
            }
        }

        for (int j = 0; j <= 1; j++) {

            if (j == 0) {

                int temp;
                temp = magic[0][0];
                magic[0][0] = magic[half][0];
                magic[half][0] = temp;
            }

            if (j == 1) {

                int temp;
                temp = magic[half - 1][0];
                magic[half - 1][0] = magic[n - 1][0];
                magic[n - 1][0] = temp;
            }
        }

        for (int j = half + 1; j < n - 1; j++) {

            for (int i = 1; i < half - 1; i++) {

                int temp;
                temp = magic[i][1];
                magic[i][1] = magic[half + i][1];
                magic[half + i][1] = temp;
            }
        }

        return magic;
    }

    private static int[][] evenEvenOrder(int n) {
        // Метод Раус-Болла

        int[][] matrix;
        int[][] tempMatrix;
        int num;

        matrix = new int[n][n]; // заполняется поседовательно значениями от 1 до  n^2 слева направо сверху вниз
        tempMatrix = new int[n][n]; // заполняется теми же числами, но в обратном порядке
        num = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                num++;
                matrix[i][j] += num;
            }
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                tempMatrix[i][j] = num;
                num--;
            }
        }

        /* в матрице matrix остаются на своих местах все элементы, кроме всех диагональных элементов каждого квадрата
           4х4, они заменяются соответствующими диагональными элементами матрицы tempMatrix. */

        int x = 0;       // x, y - движение по кадратам 4х4
        int y = 0;

        for (int i = 0; i < (n * n / 16); i++) {  // Смотрим сколько квадратов 4х4 помещается в матрице nxn

            if (x == (int) Math.sqrt(n * n / 16)) {

                x = 0;
                y++;
            }

            for (int j = 0; j < 4; j++) {

                matrix[4 * y + j][4 * x + j] = tempMatrix[4 * y + j][4 * x + j];  // главная диагональ квадратов 4х4
                matrix[4 * y + j][4 * x + 4 - 1 - j] = tempMatrix[4 * y + j][4 * x + 4 - 1 - j]; // и побочная диагональ
            }

            x++;
        }

        return matrix;
    }

}

