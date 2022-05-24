package by.epam.yanushkevich_irina.module2;

public class OneDArraysSortingTask4 {

    /* 4. Сортировка обменами. Дана последовательность чисел a1 <= a2 <= ... <= an.Требуется переставить числа в
          порядке возрастания. Для этого сравниваются два соседних числа ai и a(i+1). Если ai > a(i+1), то делается
          перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
          Составить алгоритм сортировки, подсчитывая при этом количества перестановок. */

    public static void main(String[] args) {

        int n;
        int[] a;
        int count;
        boolean sorted;
        int temp;

        n = 10;
        a = new int[n];
        count = 0;

        // Ошибка в условии (последовательность и так возрастающая), меняю на убывающую для нагладности работы прогрммы:
        System.out.println("Array a before sorting: ");

        for (int i = 0; i < n; i++) {
            a[i] = n - i;
            System.out.print(a[i] + "\t");
        }

        sorted = false;

        while (!sorted) {

            sorted = true;

            for (int i = 0; i < n - 1; i++) {

                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    count++;
                    sorted = false;
                }
            }
        }

        System.out.println("\n");
        System.out.println("Array a after sorting: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }

        System.out.println("\n");
        System.out.println("Number of swaps = " + count);
    }
}
