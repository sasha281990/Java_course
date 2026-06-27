package src.Task13;

import java.util.ArrayList;
import java.util.List;

public class Group {
    // Поля группы
    private String groupNumber;
    private List<Student> students;

    // Конструктор
    public Group(String groupNumber) {
        this.groupNumber = groupNumber;
        this.students = new ArrayList<>();
    }

    // Геттеры и сеттеры
    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    // 1.4. Метод для удаления студентов с баллом ниже переданного
    public void removeStudentsByMark(int mark) {
        System.out.println("Удаляем студентов с баллом ниже " + mark + " из группы " + groupNumber);
        students.removeIf(student -> student.getAverageMark() < mark);
        System.out.println("Осталось студентов: " + students.size());
    }

    // 1.5. Метод для перевода студентов в другую группу, если меньше 2 человек
    public void transferToGroup(Group newGroup) {
        if (students.size() < 2) {
            System.out.println("В группе " + groupNumber + " меньше 2 студентов (" + students.size() + "). Переводим в группу " + newGroup.getGroupNumber());
            newGroup.getStudents().addAll(students);
            students.clear();
            System.out.println("Студенты переведены в группу " + newGroup.getGroupNumber());
        } else {
            System.out.println("В группе " + groupNumber + " " + students.size() + " студентов. Перевод не требуется.");
        }
    }

    // 1.6. Метод для расчета среднего балла по группе
    public double calculateGroupAverageMark() {
        if (students.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (Student student : students) {
            sum += student.getAverageMark();
        }
        return sum / students.size();
    }

    // Метод для вывода информации о группе
    public void printGroupInfo() {
        System.out.println("\nГруппа: " + groupNumber);
        System.out.println("Количество студентов: " + students.size());
        if (!students.isEmpty()) {
            System.out.println("Список студентов:");
            for (Student student : students) {
                System.out.println("  - " + student);
            }
            System.out.println("Средний балл по группе: " + calculateGroupAverageMark());
        }
    }
}