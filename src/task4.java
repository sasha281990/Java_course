import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Задача 1: Чётные из 3 чисел
        System.out.print("Введите 3 числа: ");
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
        System.out.print("Чётные: ");
        if (n1 % 2 == 0) System.out.print(n1 + " ");
        if (n2 % 2 == 0) System.out.print(n2 + " ");
        if (n3 % 2 == 0) System.out.print(n3 + " ");
        System.out.println();

        // Задача 2: Делимые на 2 и 5
        System.out.print("Делимые на 2 и 5: ");
        if (n1 % 2 == 0 && n1 % 5 == 0) System.out.print(n1 + " ");
        if (n2 % 2 == 0 && n2 % 5 == 0) System.out.print(n2 + " ");
        if (n3 % 2 == 0 && n3 % 5 == 0) System.out.print(n3 + " ");
        System.out.println();

        // Задача 3: 15/x с switch
        System.out.print("Введите x для 15/x: ");
        int xv = sc.nextInt();
        double res = 15.0 / xv;
        int intRes = (int) res;
        switch (intRes) {
            case 3:
                System.out.println("Результат деления равен 3");
                break;
            case 5:
                System.out.println("Результат деления равен 5");
                break;
            default:
                System.out.println("Результат деления равен дробному числу");
                System.out.println("Точный результат: " + res);
        }

        sc.close();
    }
}