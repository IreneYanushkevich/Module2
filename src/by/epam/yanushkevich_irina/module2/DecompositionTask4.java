package by.epam.yanushkevich_irina.module2;

import java.util.Scanner;

public class DecompositionTask4 {

    /* 4. На плоскости заданы своими координатами n точек. Написать метод (методы), определяющие, между какими
          из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.  */

    public static void main(String[] args) {

        int n;
        double[] x;
        double[] y;

        n = scanN("Enter quantity of points (positive integer) n >>> ");

        x = coordinates(n);
        y = coordinates(n);

        for (int i = 0; i < n; i++) {
            System.out.print(i);
            System.out.printf(") x = %.2f", x[i]);
            System.out.printf(", y = %.2f", y[i]);
            System.out.println();
        }

        System.out.println();
        System.out.printf("Maximum distance is %.2f", maxDistance(distancesBetweenPoints(x, y, n)));
        System.out.println();
    }


    public static int scanN(String message) {

        Scanner scanner = new Scanner(System.in);

        int number;

        do {
            System.out.println(message);

            while (!scanner.hasNextInt()) {
                System.out.println(message);
                scanner.next();
            }

            number = scanner.nextInt();

        } while (number <= 0);

        return number;
    }


    public static double[] coordinates(int n) {

        double[] x;

        x = new double[n];

        for (int i = 0; i < n; i++) {
            x[i] = Math.random() * 10 - 5;
        }
        return x;
    }


    public static double[][] distancesBetweenPoints(double[] x, double[] y, int n) {

        double[][] distancesAndPoints;
        int arrDistLength;
        int k;

        arrDistLength = n * n;
        k = 0;

        for (int i = n; i > 0; i--) {
            arrDistLength -= i;
        }

        distancesAndPoints = new double[3][arrDistLength];

        while (k < arrDistLength) {

            for (int i = 0; i < n - 1; i++) {

                for (int j = i + 1; j < n; j++) {
                    distancesAndPoints[0][k] = calculateDistance(x[i], y[i], x[j], y[j]);
                    distancesAndPoints[1][k] = i;
                    distancesAndPoints[2][k] = j;
                    k++;

                }
            }
        }
        return distancesAndPoints;
    }


    public static double calculateDistance(double x1, double y1, double x2, double y2) {

        return Math.sqrt(Math.pow((y1 - y2), 2) + Math.pow(x1 - x2, 2));
    }


    public static double maxDistance(double[][] distances) {

        double max;
        double point1;
        double point2;

        max = 0;

        for (int i = 0; i < distances[0].length; i++) {

            if (distances[0][i] > max) {
                max = distances[0][i];
            }
        }

        System.out.print("The maximum distance is between points: ");

        for (int i = 0; i < distances[0].length; i++) {

            if (distances[0][i] == max) {

                point1 = distances[1][i];
                point2 = distances[2][i];
                System.out.print((int) point1 + " and " + (int) point2 + ", ");
            }
        }
        return max;
    }

}


