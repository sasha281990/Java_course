package src.Task12;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты транспортных средств
        Car car = new Car("Toyota Camry", 80);
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", 150);

        // Создаем 2 объекта класса Garage (1.5)
        Garage<Car> garage1 = new Garage<>(car);
        Garage<Motorcycle> garage2 = new Garage<>(motorcycle);

        // Вывод для garage1
        System.out.println("Гараж 1:");
        System.out.println("Имя транспортного средства: " + garage1.getVehicle().getName());
        System.out.println("Можно ли въезд в гараж: " + garage1.isEntryPermitted());
        System.out.println();

        // Вывод для garage2
        System.out.println("Гараж 2:");
        System.out.println("Имя транспортного средства: " + garage2.getVehicle().getName());
        System.out.println("Можно ли въезд в гараж: " + garage2.isEntryPermitted());
    }
}