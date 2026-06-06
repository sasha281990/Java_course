package src.Task10;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ТЕСТ equals() и hashCode() для Dog и Bird ===\n");

        // ===== ТЕСТ для Dog =====
        System.out.println("=== ТЕСТ 1: equals() и hashCode() для Dog ===");

        Dog dog1 = new Dog("Рекс", "Германская овчарка", 30.5, "черный", 12, "мясо", 1);
        Dog dog2 = new Dog("Рекс", "Германская овчарка", 30.5, "черный", 12, "мясо", 2);
        Dog dog3 = new Dog("Бобик", "Лабрадор", 25.0, "золотистый", 13, "мясо", 3);

        System.out.println("dog1: " + dog1);
        System.out.println("dog2: " + dog2);
        System.out.println("dog3: " + dog3);

        System.out.println("\ndog1.equals(dog2) - одинаковые собаки (разные ID): " + dog1.equals(dog2));
        System.out.println("dog1.equals(dog3) - разные собаки: " + dog1.equals(dog3));
        System.out.println("dog1.equals(dog1) - тот же объект: " + dog1.equals(dog1));

        System.out.println("\ndog1.hashCode(): " + dog1.hashCode());
        System.out.println("dog2.hashCode(): " + dog2.hashCode());
        System.out.println("dog3.hashCode(): " + dog3.hashCode());

        if (dog1.equals(dog2)) {
            System.out.println("✓ dog1 и dog2 равны, хэш-коды совпадают: " +
                    (dog1.hashCode() == dog2.hashCode()));
        }

        // ===== ТЕСТ для Bird =====
        System.out.println("\n=== ТЕСТ 2: equals() и hashCode() для Bird ===");

        Bird bird1 = new Bird("Воробей", 100, "серый", 8, "насекомые", 4);
        Bird bird2 = new Bird("Воробей", 100, "серый", 8, "насекомые", 5);
        Bird bird3 = new Bird("Синица", 150, "синий", 10, "насекомые", 6);

        System.out.println("bird1: " + bird1);
        System.out.println("bird2: " + bird2);
        System.out.println("bird3: " + bird3);

        System.out.println("\nbird1.equals(bird2) - одинаковые птицы (разные ID): " + bird1.equals(bird2));
        System.out.println("bird1.equals(bird3) - разные птицы: " + bird1.equals(bird3));
        System.out.println("bird1.equals(bird1) - тот же объект: " + bird1.equals(bird1));

        System.out.println("\nbird1.hashCode(): " + bird1.hashCode());
        System.out.println("bird2.hashCode(): " + bird2.hashCode());
        System.out.println("bird3.hashCode(): " + bird3.hashCode());

        if (bird1.equals(bird2)) {
            System.out.println("✓ bird1 и bird2 равны, хэш-коды совпадают: " +
                    (bird1.hashCode() == bird2.hashCode()));
        }

        // ===== ТЕСТ в HashSet =====
        System.out.println("\n=== ТЕСТ 3: Использование в HashSet ===");

        java.util.HashSet<Dog> dogs = new java.util.HashSet<>();
        dogs.add(dog1);
        dogs.add(dog2);  // игнорирован (равен dog1)
        dogs.add(dog3);

        System.out.println("Добавили 3 собак: dog1, dog2, dog3");
        System.out.println("Размер HashSet: " + dogs.size() +
                " (dog2 игнорирован, так как равен dog1)");

        java.util.HashSet<Bird> birds = new java.util.HashSet<>();
        birds.add(bird1);
        birds.add(bird2);  // игнорирован (равен bird1)
        birds.add(bird3);

        System.out.println("Добавили 3 птиц: bird1, bird2, bird3");
        System.out.println("Размер HashSet: " + birds.size() +
                " (bird2 игнорирован, так как равен bird1)");
    }
}