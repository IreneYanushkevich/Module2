package by.epam.yanushkevich_irina.module2;

public class OneDimensionalArraysTask5 {

    // 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

    public static void main(String[] args) {

        int[] a;
        int n;

        n = 20;
        a = new int[n];

        System.out.print("All values of a[i] > i  are: ");

        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * n);

            if (a[i] > i) {
                System.out.print(a[i] + "\t");
            }
        }

        System.out.println("\n");
        System.out.println("We can make sure: ");

        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

    }
}
