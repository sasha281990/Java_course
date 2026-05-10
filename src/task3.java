import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Задача 1: x/6 + 25 = 98
        int x1 = (98 - 25) * 6;
        System.out.println("1. x = " + x1);

        // Задача 2: Укороченные операции
        int x = 8, y = 9, z = 12;
        x += 5;
        y *= 9;
        z -= 6;
        System.out.println("2. x=" + x + ", y=" + y + ", z=" + z);

        // Задача 3: Тернарный
        int a = 35, b = 65;
        int c = a > b ? 5 : 10;
        System.out.println("3. c = " + c);

        // Задача 4*: Инкремент/декремент до c=12, x=6, y=1
        int x4 = 5, y4 = 2;
        int c4 = ++x4 * y4--;
        System.out.println("4*. c=" + c4 + ", x=" + x4 + ", y=" + y4);

        sc.close();
    }
}