package src.Task18;

public class Main {
    public static void main(String[] args) {
        try {
            runTwoCars();
            runThreeCarsWithJoin();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private static void runTwoCars() {
        Car car1 = new Car("BMW", "1111-AA", 1000);
        Car car2 = new Car("Audi", "2222-BB", 1500);

        car1.start();
        car2.start();
    }

    private static void runThreeCarsWithJoin() throws InterruptedException {
        Car car1 = new Car("Mercedes", "3333-CC", 1000);
        Car car2 = new Car("Toyota", "4444-DD", 1000);
        Car car3 = new Car("Volkswagen", "5555-EE", 1000);

        car1.start();
        car1.join();

        car2.start();
        car3.start();
    }
}