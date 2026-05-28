package src.Task8;


public class Main {
    public static void main(String[] args) {

        // Задание 1.1-1.3

        System.out.println("Задание 1");

        String str1 = "Я люблю java";
        String str2 = "java";

        String result1 = StringOperations.processStrings(str1, str2);
        System.out.println("Результат: " + result1);

        // Второй пример (когда строка не заканчивается на str2)
        String str3 = "Я люблю java";
        String str4 = "python";
        String result2 = StringOperations.processStrings(str3, str4);
        System.out.println("Результат 2: " + result2);

        // Задание 2.1

        System.out.println("\nЗадание 2");

        String text = "Каждая строка, создаваемая с помощью оператора new,литерала (заключенная в двойные апострофы) и ли метода класса, создающего строку, является экземпляром класса String. Особенностью объекта класса String является то, что его значение не может быть изменено после создания объекта при помощи любого метода класса. Изменение строки всегда приводит к созданию нового объекта в heap. Сама объектная ссылка при этом сохраняет прежнее значение и хранится в стеке. Произведенные изменения можно сохранить переинициализируя ссылку.";

        int k = 3;  // индекс после которого вставляем
        String result3 = StringOperations.insertSubstringAfterK(k, text);
        System.out.println("Текст после вставки подстроки после " + k + "-го символа:");
        System.out.println(result3);

        // Задание 3.1
        System.out.println("\nЗадание 3");

        String text3 = "Да1та выпуска 8 декабря 1998 года[12]. Кодовое имяPlayground. В данном случае встречается путаница. Выпускались книги, например,Beginning Java 2 by Ivor Horton (Mar 1999), фактически по J2SE 1.2 (бывшее название — Java 2). Вместе с тем по сей день такие книги публикуются, например: Х. М. Дейтел, П. Дж. Дейтел, С. И. Сантри. Технологии программирования на Java2. Распределённые приложения (2011). В то время, когда, как известно, Java 2была исторически заменена следующими релизами, подобные названия книг дезориентируют в понимании, о какой же версии Java они написаны на самом деле. Если J2SE 1.2 принято считать за Java 2, а авторы книг за Java 2 принимают JDK7, это приводит к полной путанице.";

        String result4 = StringOperations.removeNonLetters(text3);
        System.out.println("Текст после удаления всех символов кроме букв и пробелов:");
        System.out.println(result4);
    }
}