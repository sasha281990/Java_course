package src.Task11;

public class RobotBuilder implements RobotEngineer {
    private String model;               // модель
    private double powerConsumption;    // потребляемая мощность
    private String country;             // страна производитель
    private String constructionUnit;    // агрегат для строительства
    private String material;            // материал
    private boolean isOn;               // включение робота (п.1.3)

    public RobotBuilder(String model, double powerConsumption, String country,
                        String constructionUnit, String material) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.country = country;
        this.constructionUnit = constructionUnit;
        this.material = material;
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

    // Реализация uniquePossibility - строитель строит (п.1.4)
    @Override
    public void uniquePossibility() {
        if (isOn) {
            System.out.println(model + " строит с помощью " + constructionUnit +
                    ", используя материал " + material);
        } else {
            System.out.println(model + " не строит (выключен)");
        }
    }

    // Реализация createItem - строитель создаёт бетон (п.1.5)
    @Override
    public String createItem() {
        String item = "Бетон на основе материала " + material;
        System.out.println(model + " создал: " + item);
        return item;
    }

    // toString
    @Override
    public String toString() {
        return "RobotBuilder{model='" + model + "', powerConsumption=" + powerConsumption +
                ", country='" + country + "', constructionUnit='" + constructionUnit +
                "', material='" + material + "', isOn=" + isOn + "}";
    }
}