package src.Task8;

public class StringOperations {

    // 1.1-1.2 Метод для работы со строками
    public static String processStrings(String str1, String str2) {
        if (str1.endsWith(str2)) {
            // Находим индекс начала подстроки str2
            int index = str1.indexOf(str2);
            // Вырезаем строку без str2
            return str1.substring(0, index);
        } else {
            // Возвращаем строку в верхнем регистре
            return str1.toUpperCase();
        }
    }

    // 2.1 Вставить подстроку после каждого k-го символа каждого слова
    public static String insertSubstringAfterK(int k, String text) {
        String substringToInsert = "_";  // подстрока для вставки
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > k) {
                // Вставляем подстроку после k-го символа (индекс k)
                String before = word.substring(0, k);
                String after = word.substring(k);
                result.append(before).append(substringToInsert).append(after);
            } else {
                result.append(word);
            }

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    // 3.1 Удалить все символы кроме пробелов и букв (регулярные выражения)
    public static String removeNonLetters(String text) {
        // Заменяем все не буквы и не пробелы на пустую строку
        String result = text.replaceAll("[^a-zA-Zа-яА-ЯёЁ\\s]", "");

        // Оставляем только один пробел между последовательностями букв
        result = result.replaceAll("\\s+", " ");

        // Убираем пробелы в начале и конце
        return result.trim();
    }
}