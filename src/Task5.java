import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        task1();
        task2(scanner);
        task3(scanner);
        task4(scanner);

        scanner.close();
    }

    // 1. Вывести все числа кратные 7 или 3 в диапазоне от 1 до 100
    public static void task1() {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // 2. Вывести сумму всех чисел от одного числа до другого
    public static void task2(Scanner scanner) {
        System.out.print("Введите первое положительное число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе положительное число: ");
        int b = scanner.nextInt();

        int start;
        int end;

        if (a < b) {
            start = a;
            end = b;
        } else {
            start = b;
            end = a;
        }

        int sum = 0;
        while (start <= end) {
            sum = sum + start;
            start++;
        }

        System.out.println("Сумма = " + sum);
    }

    // 3*. Ввести число и вывести его в обратном порядке
    public static void task3(Scanner scanner) {
        System.out.print("Введите число, которое не заканчивается на 0: ");
        int number = scanner.nextInt();

        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        System.out.println("Обратное число = " + reversed);
    }

    // 4*. Вывести чётные и нечётные числа через while and if
    public static void task4(Scanner scanner) {
        System.out.print("Введите число, которое не заканчивается на 0: ");
        int number = scanner.nextInt();

        while (number > 0) {
            int digit = number % 10;

            if (digit % 2 == 0) {
                System.out.println(digit + " - чётная");
            } else {
                System.out.println(digit + " - нечётная");
            }

            number = number / 10;
        }
    }
}