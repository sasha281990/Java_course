package src.Task10;

public class Bird extends Animal {
    private String family;  // семейство
    private int maxFlightHeight;  // максимальная высота полёта

    public Bird(String family, int maxFlightHeight, String color,
                int maxLifespan, String foodType, int id) {
        super(color, maxLifespan, foodType, id);
        this.family = family;
        this.maxFlightHeight = maxFlightHeight;
    }

    @Override
    public void makeSound() {
        System.out.println(family + " поёт");
    }

    public void peck() {
        System.out.println(family + " клевает");
    }

    public void hatchEggs() {
        System.out.println(family + " высиживает птенцов");
    }

    @Override
    public void play() {
        System.out.println(family + " играет");
    }

    @Override
    public String toString() {
        return "Bird{family='" + family +
                "', maxFlightHeight=" + maxFlightHeight + "}";
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
        if (!(obj instanceof Bird)) {
            return false;
        }

        // 4. Преобразование к типу Bird
        Bird other = (Bird) obj;

        // 5. Сравнение полей: family, maxFlightHeight
        return this.family.equals(other.family) &&
                this.maxFlightHeight == other.maxFlightHeight;
    }

    // ===== ПЕРЕОПРЕДЕЛЕНИЕ hashCode() =====
    @Override
    public int hashCode() {
        // Хэш-код вычисляется по полям: family, maxFlightHeight
        int result = 1;
        result = 31 * result + (family != null ? family.hashCode() : 0);
        result = 31 * result + maxFlightHeight;
        return result;
    }
}