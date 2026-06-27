package src.Task13;


import java.util.ArrayList;
import java.util.List;

public class Faculty {
    // Поля факультета
    private String facultyName;
    private List<Group> groups;

    // Конструктор
    public Faculty(String facultyName) {
        this.facultyName = facultyName;
        this.groups = new ArrayList<>();
    }

    // Геттеры и сеттеры
    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    // Метод для добавления группы
    public void addGroup(Group group) {
        groups.add(group);
        System.out.println("Группа " + group.getGroupNumber() + " добавлена на факультет " + facultyName);
    }

    // Метод для вывода информации о факультете
    public void printFacultyInfo() {
        System.out.println("\n========================================");
        System.out.println("Факультет: " + facultyName);
        System.out.println("Количество групп: " + groups.size());
        for (Group group : groups) {
            group.printGroupInfo();
        }
        System.out.println("========================================");
    }
}