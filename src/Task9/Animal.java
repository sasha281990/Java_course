package src.Task9;

public class Animal {
    protected String color;  // окрас
    protected int maxLifespan;  // максимальная продолжительность жизни
    protected String foodType;  // тип еды: мясо, насекомые, растения
    int id;  // уникальный номер животного (п.1.9)

    public Animal(String color, int maxLifespan, String foodType, int id) {
        this.color = color;
        this.maxLifespan = maxLifespan;
        this.foodType = foodType;
        this.id = id;
    }

    // Метод издания звуков (переопределяется в дочерних классах)
    public void makeSound() {
        System.out.println("Животное издаёт звук");
    }

    // Метод игры животного (переопределяется в дочерних классах)
    public void play() {
        System.out.println("Животное играет");
    }

    // toString метод (п.1.2)
    @Override
    public String toString() {
        return "Animal{id=" + id + ", color='" + color + "', maxLifespan=" +
                maxLifespan + ", foodType='" + foodType + "'}";
    }

    // Getter для id (п.1.9)
    public int getId() {
        return id;
    }
}