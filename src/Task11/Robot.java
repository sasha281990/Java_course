package src.Task11;

public interface Robot {
    // Абстрактные методы
    void turnOn();                    // включить робота
    void turnOff();                   // выключить робота
    void uniquePossibility();         // продемонстрировать уникальные способности

    // Default метод (реализация по умолчанию)
    default void repairRobot() {
        System.out.println("Робот отремонтирован стандартным способом");
    }
}