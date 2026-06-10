package src.Task10;

public class Lion extends Animal {
    private String name;  // имя льва

    public Lion(String name, String color, int maxLifespan, String foodType, int id) {
        super(color, maxLifespan, foodType, id);
        this.name = name;
    }

    // Переопределение makeSound — рычать
    @Override
    public void makeSound() {
        System.out.println(name + " рычит");
    }

    // Переопределение play — играть
    @Override
    public void play() {
        System.out.println(name + " играет");
    }

    // toString метод
    @Override
    public String toString() {
        return "Lion{id=" + id + ", name='" + name + "', color='" + color +
                "', maxLifespan=" + maxLifespan + ", foodType='" + foodType + "'}";
    }
}