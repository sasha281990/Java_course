package src.Task11;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ЗАДАЧА 11: Интерфейсы Робот и РоботИнженер ===\n");

        // ===== 1.2: Создаём экземпляры объектов =====
        System.out.println("=== 1.2: Создание роботов и метод repairRobot ===");

        RobotCook cook = new RobotCook("CookMaster-3000", 1500.0, "Германия", "электрическая печь");
        RobotSapper sapper = new RobotSapper("SapperX-500", 2000.0, "Шасси №7", "титан");
        RobotBuilder builder = new RobotBuilder("BuildBot-2000", 2500.0, "Япония", "бетономешалка", "бетон");

        // Вызов метода repairRobot для каждого робота
        System.out.println("\nРемонт робота-повара:");
        cook.repairRobot();

        System.out.println("\nРемонт робота-сапёра (переопределён):");
        sapper.repairRobot();

        System.out.println("\nРемонт робота-строителя:");
        builder.repairRobot();

        // ===== 1.6: Создание 3 выставок роботов =====
        System.out.println("\n=== 1.6: Выставки роботов ===");

        // ── Выставка 1: Все виды роботов (массив Robot) ──
        System.out.println("\n=== Выставка 1: Все виды роботов ===");
        Robot[] allRobots = new Robot[3];
        allRobots[0] = cook;
        allRobots[1] = sapper;
        allRobots[2] = builder;

        // Включить всех роботов
        for (Robot robot : allRobots) {
            robot.turnOn();
        }

        // Демонстрация способностей (uniquePossibility)
        System.out.println("\nДемонстрация способностей всех роботов:");
        for (Robot robot : allRobots) {
            robot.uniquePossibility();
        }

        // ── Выставка 2: Только инженерные роботы (массив RobotEngineer) ──
        System.out.println("\n=== Выставка 2: Роботы-инженеры ===");
        RobotEngineer[] engineerRobots = new RobotEngineer[2];
        engineerRobots[0] = sapper;   // RobotSapper имплементирует RobotEngineer
        engineerRobots[1] = builder;  // RobotBuilder имплементирует RobotEngineer

        // Включить инженерных роботов
        for (RobotEngineer robot : engineerRobots) {
            robot.turnOn();
        }

        // Демонстрация способностей
        System.out.println("\nДемонстрация способностей роботов-инженеров:");
        for (RobotEngineer robot : engineerRobots) {
            robot.uniquePossibility();
        }

        // Демонстрация createItem для роботов-инженеров
        System.out.println("\nДемонстрация createItem для роботов-инженеров:");
        for (RobotEngineer robot : engineerRobots) {
            String item = robot.createItem();
            System.out.println("Создано: " + item);
        }

        // ── Выставка 3: Только роботы-сапёры (массив RobotSapper) ──
        System.out.println("\n=== Выставка 3: Роботы-сапёры ===");
        RobotSapper[] sapperRobots = new RobotSapper[3];
        sapperRobots[0] = new RobotSapper("SapperAlpha-100", 1800.0, "Шасси №3", "алюминий");
        sapperRobots[1] = new RobotSapper("SapperBeta-200", 2100.0, "Шасси №9", "сталь");
        sapperRobots[2] = sapper;  // используем уже созданный

        // Включить сапёров
        for (RobotSapper robot : sapperRobots) {
            robot.turnOn();
        }

        // Демонстрация способностей
        System.out.println("\nДемонстрация способностей роботов-сапёров:");
        for (RobotSapper robot : sapperRobots) {
            robot.uniquePossibility();
        }

        // Демонстрация createItem для сапёров
        System.out.println("\nДемонстрация createItem для роботов-сапёров:");
        for (RobotSapper robot : sapperRobots) {
            String item = robot.createItem();
            System.out.println("Создано: " + item);
        }

        // ===== Дополнительное: Выключение всех роботов =====
        System.out.println("\n=== Выключение всех роботов ===");
        for (Robot robot : allRobots) {
            robot.turnOff();
        }
    }
}