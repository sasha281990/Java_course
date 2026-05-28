public class Task6 {
    public static void main(String[] args) {

        // 1
        int[] arr1 = {5, 12, 7, 9, 3, 8, 14, 6, 1, 10};
        System.out.println("Задание 1. Исходный массив:");
        for (int n : arr1) {
            System.out.print(n + " ");
        }
        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            if (i % 2 != 0) {
                arr1[i] = 0;
            }
        }

        System.out.println("Задание 1. После замены нечётных индексов на 0:");
        for (int n : arr1) {
            System.out.print(n + " ");
        }
        System.out.println("\n");

        // 2
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] arr3 = new int[arr2.length];  // ← исправлено: убрано дублирование

        for (int i = 0; i < arr2.length; i++) {
            arr3[i] = arr2[i];
        }

        arr3[arr3.length - 1] = 0;

        System.out.println("Задание 2. Второй массив:");
        for (int n : arr3) {
            System.out.print(n + " ");
        }
        System.out.println("\n");

        // 3
        int[] arr4 = {15, -3, 40, 7, 0, 22, -10};
        int min = arr4[0];
        int max = arr4[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < arr4.length; i++) {
            if (arr4[i] < min) {
                min = arr4[i];
                minIndex = i;
            }
            if (arr4[i] > max) {
                max = arr4[i];
                maxIndex = i;
            }
        }

        arr4[minIndex] = -1000;
        arr4[maxIndex] = 1000;

        System.out.println("Задание 3. После замены min и max:");
        for (int n : arr4) {
            System.out.print(n + " ");
        }
        System.out.println("\n");

        // 4
        int[] arr5 = {9, 4, 7, 1, 6, 3, 8, 2, 5};
        for (int i = 0; i < arr5.length - 1; i++) {
            for (int j = 0; j < arr5.length - 1 - i; j++) {
                if (arr5[j] > arr5[j + 1]) {
                    int temp = arr5[j];
                    arr5[j] = arr5[j + 1];
                    arr5[j + 1] = temp;
                }
            }
        }

        System.out.println("Задание 4. Отсортированный массив:");
        for (int n : arr5) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}