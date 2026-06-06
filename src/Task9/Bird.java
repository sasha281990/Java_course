package src.Task9;

public class Bird extends Animal {
    private String family;  // семейство
    private int maxFlightHeight;  // максимальная высота полёта

    public Bird(String family, int maxFlightHeight, String color,
                int maxLifespan, String foodType, int id) {
        super(color, maxLifespan, foodType, id);
        this.family = family;
        this.maxFlightHeight = maxFlightHeight;
    }

    // Переопределение makeSound — петь
    @Override
    public void makeSound() {
        System.out.println(family + " поёт");
    }

    // Метод клевать
    public void peck() {
        System.out.println(family + " клюет");
    }

    // Метод высиживать птенцов
    public void hatchEggs() {
        System.out.println(family + " высиживает птенцов");
    }

    // Переопределение play — играть
    @Override
    public void play() {
        System.out.println(family + " играет");
    }

    // toString метод (п.1.2)
    @Override
    public String toString() {
        return "Bird{id=" + id + ", family='" + family +
                "', maxFlightHeight=" + maxFlightHeight + ", color='" + color +
                "', maxLifespan=" + maxLifespan + ", foodType='" + foodType + "'}";
    }
}