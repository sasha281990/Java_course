package src.Task7;

public class Student {
    private int id;
    private String name;
    private String surname;
    private String faculty;
    private int course;
    private String group;
    private int averageMark;

    // Конструктор без параметров
    public Student() {
    }

    // Конструктор с параметрами
    public Student(int id, String name, String surname, String faculty,
                   int course, String group, int averageMark) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.averageMark = averageMark;
    }

    // Метод info - вывод информации о студенте
    public void info() {
        System.out.println("ID: " + id);
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Факультет: " + faculty);
        System.out.println("Курс: " + course);
        System.out.println("Группа: " + group);
        System.out.println("Средняя оценка: " + averageMark);
    }

    // Метод для изменения текущей группы
    public void setGroup(String newGroup) {
        this.group = newGroup;
    }

    // Метод для получения текущей группы
    public String getGroup() {
        return group;
    }

    // Метод для изменения оценки и группы одновременно
    public void setMarkAndGroup(int averageMark, String group) {
        this.averageMark = averageMark;
        this.group = group;
    }

    // Getter и Setter для id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter и Setter для name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter и Setter для surname
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // Getter и Setter для faculty
    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    // Getter и Setter для course
    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    // Getter и Setter для averageMark
    public int getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(int averageMark) {
        this.averageMark = averageMark;
    }

    // Метод для получения студентов с оценкой выше переданной
    public static Student[] getStudents(Student[] students, int mark) {
        int count = 0;
        for (Student student : students) {
            if (student.averageMark > mark) {
                count++;
            }
        }

        Student[] result = new Student[count];
        int index = 0;
        for (Student student : students) {
            if (student.averageMark > mark) {
                result[index] = student;
                index++;
            }
        }

        return result;
    }
}