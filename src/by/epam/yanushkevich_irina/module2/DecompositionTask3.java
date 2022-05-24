package by.epam.yanushkevich_irina.module2;

public class DecompositionTask3 {

    // 3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.

    public static void main(String[] args) {

        int a;

        a = 5;

        System.out.println("The area of a regular hexagon with side " + a + " equals " + hexagonArea(triangleArea(a)));

    }


    public static double triangleArea(int side) {

        return side * side * Math.sqrt(3) / 4;
    }


    public static double hexagonArea(double triangleArea) {

        return triangleArea * 6;
    }
}
