package src.Task11;

public class RobotCook implements Robot {
    private String model;               // модель
    private double powerConsumption;    // потребляемая мощность
    private String country;             // страна производитель
    private String cookingUnit;         // агрегат для приготовления
    private boolean isOn;               // включение робота (п.1.3)

    public RobotCook(String model, double powerConsumption, String country, String cookingUnit) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.country = country;
        this.cookingUnit = cookingUnit;
        this.isOn = false;
    }

    // Реализация turnOn - включить робота (п.1.3)
    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println(model + " включён");
    }

    // Реализация turnOff - выключить робота (п.1.3)
    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println(model + " выключён");
    }

    // Реализация uniquePossibility - повар готовит (п.1.4)
    @Override
    public void uniquePossibility() {
        if (isOn) {
            System.out.println(model + " готовит еду с помощью " + cookingUnit);
        } else {
            System.out.println(model + " не готовит (выключен)");
        }
    }

    // toString
    @Override
    public String toString() {
        return "RobotCook{model='" + model + "', powerConsumption=" + powerConsumption +
                ", country='" + country + "', cookingUnit='" + cookingUnit + "', isOn=" + isOn + "}";
    }
}