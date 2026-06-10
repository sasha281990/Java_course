package src.Task11;

public class RobotSapper implements RobotEngineer {
    private String model;               // модель
    private double powerConsumption;    // потребляемая мощность
    private String minigDevice;         // средство для разминирования (шасси номер)
    private String material;            // материал
    private boolean isOn;               // включение робота (п.1.3)

    public RobotSapper(String model, double powerConsumption, String minigDevice, String material) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.minigDevice = minigDevice;
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

    // Реализация uniquePossibility - сапёр разминирует (п.1.4)
    @Override
    public void uniquePossibility() {
        if (isOn) {
            System.out.println(model + " разминирует с помощью " + minigDevice);
        } else {
            System.out.println(model + " не разминирует (выключен)");
        }
    }

    // Переопределение default метода repairRobot (п.1.1)
    @Override
    public void repairRobot() {
        System.out.println(model + " отремонтирован специально: заменено шасси " + minigDevice +
                ", материал " + material);
    }

    // Реализация createItem - сапёр создаёт приспособление для разминирования (п.1.5)
    @Override
    public String createItem() {
        String item = "Приспособление для разминирования на базе " + minigDevice;
        System.out.println(model + " создал: " + item);
        return item;
    }

    // toString
    @Override
    public String toString() {
        return "RobotSapper{model='" + model + "', powerConsumption=" + powerConsumption +
                ", minigDevice='" + minigDevice + "', material='" + material + "', isOn=" + isOn + "}";
    }
}