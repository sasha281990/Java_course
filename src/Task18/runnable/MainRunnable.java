package src.Task18.runnable;


public class MainRunnable {
    public static void main(String[] args) {
        runTwoCars();
        runThreeCarsWithJoin();
    }

    private static void runTwoCars() {
        Thread car1 = new Thread(new CarRunnable("BMW", "1111-AA", 1000));
        Thread car2 = new Thread(new CarRunnable("Audi", "2222-BB", 1500));

        car1.start();
        car2.start();
    }

    private static void runThreeCarsWithJoin() {
        Thread car1 = new Thread(new CarRunnable("Mercedes", "3333-CC", 1000));
        Thread car2 = new Thread(new CarRunnable("Toyota", "4444-DD", 1000));
        Thread car3 = new Thread(new CarRunnable("Volkswagen", "5555-EE", 1000));

        try {
            car1.start();
            car1.join();

            car2.start();
            car3.start();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
