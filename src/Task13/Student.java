package src.Task13;


import java.time.LocalDate;

public class Student {
    // Поля студента
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private String cityOfBirth;
    private double averageMark;

    // Конструктор
    public Student(String name, String surname, LocalDate dateOfBirth,
                   String cityOfBirth, double averageMark) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.cityOfBirth = cityOfBirth;
        this.averageMark = averageMark;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCityOfBirth() {
        return cityOfBirth;
    }

    public void setCityOfBirth(String cityOfBirth) {
        this.cityOfBirth = cityOfBirth;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    // Метод для красивого вывода
    @Override
    public String toString() {
        return surname + " " + name + " (балл: " + averageMark + ")";
    }
}