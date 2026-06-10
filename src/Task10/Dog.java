package src.Task10;

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

    @Override
    public void makeSound() {
        System.out.println(name + " лает");
    }

    public void bite() {
        System.out.println(name + " кусает");
    }

    public void run() {
        System.out.println(name + " бегает");
    }

    @Override
    public void play() {
        System.out.println(name + " играет");
    }

    public void jump() {
        System.out.println(name + " прыгает");
    }

    @Override
    public String toString() {
        return "Dog{name='" + name + "', breed='" + breed +
                "', averageWeight=" + averageWeight + "}";
    }

    public int getId() {
        return id;
    }

    // ===== ПЕРЕОПРЕДЕЛЕНИЕ equals() =====
    @Override
    public boolean equals(Object obj) {
        // 1. Проверка на null
        if (obj == null) {
            return false;
        }

        // 2. Проверка на тот же объект
        if (this == obj) {
            return true;
        }

        // 3. Проверка на правильный тип
        if (!(obj instanceof Dog)) {
            return false;
        }

        // 4. Преобразование к типу Dog
        Dog other = (Dog) obj;

        // 5. Сравнение полей: name, breed, averageWeight
        // Для String используем equals(), для double - сравнение с допуском
        return this.name.equals(other.name) &&
                this.breed.equals(other.breed) &&
                Math.abs(this.averageWeight - other.averageWeight) < 0.001;
    }

    // ===== ПЕРЕОПРЕДЕЛЕНИЕ hashCode() =====
    @Override
    public int hashCode() {
        // Хэш-код вычисляется по полям: name, breed, averageWeight
        int result = 1;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (breed != null ? breed.hashCode() : 0);
        result = 31 * result + (int) (averageWeight * 1000);
        return result;
    }
}