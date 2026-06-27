package src.Task12;

public class Vehicle {
    private String name;
    private Integer emissions;

    // Конструктор с параметрами (1.1)
    public Vehicle(String name, Integer emissions) {
        this.name = name;
        this.emissions = emissions;
    }

    // Геттеры и сеттеры (1.2)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmissions() {
        return emissions;
    }

    public void setEmissions(Integer emissions) {
        this.emissions = emissions;
    }
}