package src.Task12;

public class Garage<T extends Vehicle> {
    private T vehicle;

    // Конструктор Garage
    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }

    // Геттер и сеттер для vehicle
    public T getVehicle() {
        return vehicle;
    }

    public void setVehicle(T vehicle) {
        this.vehicle = vehicle;
    }

    // Метод isEntryPermitted (1.4)
    // Если выбросы > 100 — въезд запрещён (false)
    // Если выбросы <= 100 — въезд разрешён (true)
    public Boolean isEntryPermitted() {
        Integer emissions = vehicle.getEmissions();
        return emissions <= 100;
    }
}