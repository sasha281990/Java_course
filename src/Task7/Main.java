package src.Task7;

public class Main {
    public static void main(String[] args) {
        // 6. Создать массив из пяти студентов
        Student[] students = new Student[5];

        students[0] = new Student(1, "Иван", "Иванов", "Информатики", 3, "ПИ-301", 85);
        students[1] = new Student(2, "Мария", "Петрова", "Информатики", 2, "ПИ-201", 92);
        students[2] = new Student(3, "Алексей", "Сидоров", "Экономики", 4, "ЭК-401", 78);
        students[3] = new Student(4, "Ольга", "Смирнова", "Информатики", 3, "ПИ-302", 95);
        students[4] = new Student(5, "Дмитрий", "Кузнецов", "Экономики", 2, "ЭК-201", 88);

        // 7. Получить студентов с оценкой выше 85
        Student[] highMarkStudents = Student.getStudents(students, 85);

        // 8. Пройтись по полученным студентам и вызвать info
        System.out.println("Студенты с оценкой выше 85:");
        for (Student student : highMarkStudents) {
            student.info();
            System.out.println("-------------------");
        }

        // Демонстрация других методов
        System.out.println("\n=== Изменение группы ===");
        students[0].setGroup("ПИ-303");
        System.out.println("Новая группа Ивана: " + students[0].getGroup());

        System.out.println("\n=== Изменение оценки и группы ===");
        students[2].setMarkAndGroup(90, "ЭК-402");
        students[2].info();
    }
}