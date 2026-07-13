package src.Task18;

public class Car extends Thread {
    private String carName;
    private String number;
    private int stopTime;

    public Car(String carName, String number, int stopTime) {
        this.carName = carName;
        this.number = number;
        this.stopTime = stopTime;
    }

    @Override
    public void run() {
        drive();
    }

    private void drive() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(carName + " [" + number + "] едет: круг " + i);

            if (i == 5) {
                try {
                    System.out.println(carName + " остановился на " + stopTime + " мс");
                    Thread.sleep(stopTime);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        System.out.println(carName + " завершил движение");
    }
}