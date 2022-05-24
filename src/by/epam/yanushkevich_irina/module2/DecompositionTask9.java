package by.epam.yanushkevich_irina.module2;

public class DecompositionTask9 {

    /* 9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
          если угол между сторонами длиной X и Y— прямой. */

    public static void main(String[] args) {

        double x;
        double y;
        double z;
        double t;

        x = 9;
        y = 10;
        z = 7.6;
        t = 6.7;

        System.out.println("Area of a quadrilateral when angle between x and y = 90' and the sides are: " +
                "x = " + x + ", y = " + y + ", z = " + z + ", t = " + t + ", equals: ");
        System.out.printf("1) if the quadrilateral is convex: %.2f ", findAreaOfQuadrilateralWithOneRightAngle(x, y, z, t));
        System.out.println();
        System.out.printf("2) if the quadrilateral is non-convex: %.2f ", (findAreaOfRectangle(x, y) -
                findAreaOfQuadrilateralWithOneRightAngle(x, y, z, t)));
        System.out.println();
    }


    public static double findAreaOfQuadrilateralWithOneRightAngle(double side1, double side2, double side3, double side4) {

        boolean checking;
        double hypotenuse;
        double areaOfRightTriangle;
        double areaOfTriangle;
        double areaOfRectangleWithOneRightAngle;

        checking = checkExistingOfTriangle(side1, side2, side3, side4);
        hypotenuse = findHypotenuse(side1, side2);

        if (checking) {

            areaOfRightTriangle = findAreaOfTriangle(side1, side2, hypotenuse);
            areaOfTriangle = findAreaOfTriangle(side3, side4, hypotenuse);
            areaOfRectangleWithOneRightAngle = areaOfRightTriangle + areaOfTriangle;

        } else {

            areaOfRectangleWithOneRightAngle = 0;
            System.out.println("There is no rectangle with these side lengths.");
        }
        return areaOfRectangleWithOneRightAngle;
    }


    public static boolean checkExistingOfTriangle(double a, double b, double c, double d) {

        return (a < b + c + d) && (b < a + c + d) && (c < a + b + d) && (d < a + b + c) &&
                (a > 0) && (b > 0) && (c > 0) && (d > 0);
    }


    public static double findHypotenuse(double sideA, double sideB) {

        return Math.sqrt(sideA * sideA + sideB * sideB);
    }


    public static double findAreaOfTriangle(double sideC, double sideD, double sideE) {

        double sp;
        double areaOfTriangle;

        sp = findSemiperimeterOfTriangle(sideC, sideD, sideE);
        areaOfTriangle = Math.sqrt(sp * (sp - sideC) * (sp - sideD) * (sp - sideE));

        return areaOfTriangle;
    }


    public static double findSemiperimeterOfTriangle(double sideC, double sideD, double sideE) {

        return (sideC + sideD + sideE) / 2;
    }


    public static double findAreaOfRectangle(double sideA, double sideB) {

        return sideA * sideB;
    }

}
