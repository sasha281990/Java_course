package src.Task13;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("Домашнее задание №13");
        System.out.println("==========================================");

        // 1.1. Создаем несколько студентов
        System.out.println("\n1.1. Создаем студентов:");
        Student student1 = new Student("Анна", "Иванова", LocalDate.of(2005, 5, 15), "Минск", 8.5);
        Student student2 = new Student("Петр", "Смирнов", LocalDate.of(2004, 8, 20), "Москва", 6.2);
        Student student3 = new Student("Елена", "Кузмина", LocalDate.of(2005, 3, 10), "Санкт-Петербург", 9.1);
        Student student4 = new Student("Дмитрий", "Новиков", LocalDate.of(2004, 12, 5), "Казань", 4.5);
        Student student5 = new Student("Ольга", "Попова", LocalDate.of(2005, 7, 25), "Воронеж", 7.8);
        Student student6 = new Student("Алексей", "Соколов", LocalDate.of(2004, 11, 30), "Минск", 3.2);
        Student student7 = new Student("Мария", "Лебедева", LocalDate.of(2005, 2, 18), "Москва", 5.0);

        System.out.println("Создано " + 7 + " студентов");

        // 1.2. Создаем несколько групп и распределяем студентов
        System.out.println("\n1.2. Создаем группы и распределяем студентов:");
        Group group1 = new Group("ПИ-101");
        Group group2 = new Group("ПИ-102");
        Group group3 = new Group("ПИ-103");

        // Распределяем студентов по группам (метод add)
        group1.getStudents().add(student1);
        group1.getStudents().add(student2);
        group1.getStudents().add(student3);

        group2.getStudents().add(student4);
        group2.getStudents().add(student5);

        group3.getStudents().add(student6);
        group3.getStudents().add(student7);

        System.out.println("Группа ПИ-101: " + group1.getStudents().size() + " студентов");
        System.out.println("Группа ПИ-102: " + group2.getStudents().size() + " студентов");
        System.out.println("Группа ПИ-103: " + group3.getStudents().size() + " студентов");

        // 1.3. Создаем Факультет и распределяем туда группы
        System.out.println("\n1.3. Создаем Факультет:");
        Faculty faculty = new Faculty("Информационных технологий");
        faculty.addGroup(group1);
        faculty.addGroup(group2);
        faculty.addGroup(group3);

        // Вывод информации о факультете
        faculty.printFacultyInfo();

        // 1.4. Удаляем студентов с баллом ниже 5.0
        System.out.println("\n1.4. Удаляем студентов с баллом ниже 5.0:");
        group1.removeStudentsByMark(5);
        group2.removeStudentsByMark(5);
        group3.removeStudentsByMark(5);

        // 1.5. Переводим студентов в другую группу, если меньше 2 человек
        System.out.println("\n1.5. Перевод студентов из малых групп:");
        Group newGroup = new Group("ПИ-104");
        // Добавим новую группу на факультет
        faculty.addGroup(newGroup);

        // Проверим перевод студентов
        group2.transferToGroup(newGroup);
        group3.transferToGroup(newGroup);

        // 1.6. Выводим средний балл по группе
        System.out.println("\n1.6. Средний балл по группам:");
        System.out.println("Группа ПИ-101: средний балл = " + group1.calculateGroupAverageMark());
        System.out.println("Группа ПИ-102: средний балл = " + group2.calculateGroupAverageMark());
        System.out.println("Группа ПИ-103: средний балл = " + group3.calculateGroupAverageMark());
        System.out.println("Группа ПИ-104: средний балл = " + newGroup.calculateGroupAverageMark());

        // Финальный вывод
        faculty.printFacultyInfo();
    }
}