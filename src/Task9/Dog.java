package src.Task9;

public class Dog extends Animal {
    private String name;  // имя
    private String breed;  // порода
    private double averageWeight;  // средний вес

    public Dog(String name, String breed, double averageWeight, String color,
               int maxLifespan, String foodType, int id) {
        super(color, maxLifespan, foodType, id);
        this.name = name;
        this.breed = breed;
        this.averageWeight = averageWeight;
    }

    // Переопределение makeSound — лаять
    @Override
    public void makeSound() {
        System.out.println(name + " лает");
    }

    // Метод кусать
    public void bite() {
        System.out.println(name + " кусает");
    }

    // Метод бегать
    public void run() {
        System.out.println(name + " бегает");
    }

    // Переопределение play — играть
    @Override
    public void play() {
        System.out.println(name + " играет");
    }

    // Метод прыгать
    public void jump() {
        System.out.println(name + " прыгает");
    }

    // toString метод (п.1.2)
    @Override
    public String toString() {
        return "Dog{id=" + id + ", name='" + name + "', breed='" + breed +
                "', averageWeight=" + averageWeight + ", color='" + color +
                "', maxLifespan=" + maxLifespan + ", foodType='" + foodType + "'}";
    }
}