package src.Task9;

public class Main {
    public static void main(String[] args) {
        // Создаем зоопарк
        Zoo zoo = new Zoo();

        // ===== 1.6: Добавление 3 собак и 3 птиц =====
        System.out.println("=== 1.6: Добавление собак и птиц в зоопарк ===");

        // 3 собаки
        Dog dog1 = new Dog("Рекс", "Германская овчарка", 30.5, "черный",
                12, "мясо", Zoo.getNextId());
        Zoo.setNextId(Zoo.getNextId() + 1);

        Dog dog2 = new Dog("Бобик", "Лабрадор", 25.0, "золотистый",
                13, "мясо", Zoo.getNextId());
        Zoo.setNextId(Zoo.getNextId() + 1);

        Dog dog3 = new Dog("Тёма", "Дворняга", 15.0, "коричневый",
                10, "мясо", Zoo.getNextId());
        Zoo.setNextId(Zoo.getNextId() + 1);

        zoo.addAnimal(dog1);
        zoo.addAnimal(dog2);
        zoo.addAnimal(dog3);

        // 3 птицы
        Bird bird1 = new Bird("Воробей", 100, "серый",
                8, "насекомые", Zoo.getNextId());
        Zoo.setNextId(Zoo.getNextId() + 1);

        Bird bird2 = new Bird("Синица", 150, "синий",
                10, "насекомые", Zoo.getNextId());
        Zoo.setNextId(Zoo.getNextId() + 1);

        Bird bird3 = new Bird("Снегирь", 80, "красный",
                12, "растения", Zoo.getNextId());
        Zoo.setNextId(Zoo.getNextId() + 1);

        zoo.addAnimal(bird1);
        zoo.addAnimal(bird2);
        zoo.addAnimal(bird3);

        // ===== 1.1: Демонстрация поведения отдельной собаки =====
        System.out.println("\n=== 1.1: Демонстрация поведения собаки ===");
        dog1.bite();    // Рекс кусает
        dog1.run();     // Рекс бегает
        dog1.jump();    // Рекс прыгает
        dog1.play();    // Рекс играет

        // ===== 1.1: Демонстрация поведения отдельной птицы =====
        System.out.println("\n=== 1.1: Демонстрация поведения птицы ===");
        bird1.peck();      // Воробей клевает
        bird1.hatchEggs(); // Воробей высиживает птенцов
        bird1.play();      // Воробей играет

        // ===== 1.2: Демонстрация toString =====
        System.out.println("\n=== 1.2: Демонстрация toString ===");
        System.out.println(dog1);  // автоматически вызывает toString()
        System.out.println(bird1);

        // ===== 1.7: Вызов makeSound и play для 3 собак и 3 птиц =====
        System.out.println("\n=== 1.7: Методы для 3 собак и 3 птиц ===");
        Animal[] allAnimals = zoo.getAnimals();
        for (Animal animal : allAnimals) {
            animal.makeSound();
            animal.play();
        }

        // ===== 1.8: Добавление 3 львов =====
        System.out.println("\n=== 1.8: Добавление львов ===");

        Lion lion1 = new Lion("Левот", "золотистый", 15, "мясо", Zoo.getNextId());
        Zoo.setNextId(Zoo.getNextId() + 1);

        Lion lion2 = new Lion("Моргон", "золотистый", 14, "мясо", Zoo.getNextId());
        Zoo.setNextId(Zoo.getNextId() + 1);

        Lion lion3 = new Lion("Арахан", "золотистый", 16, "мясо", Zoo.getNextId());
        Zoo.setNextId(Zoo.getNextId() + 1);

        // Демонстрация поведения львов
        System.out.println("\n=== 1.8: Поведение львов ===");
        lion1.makeSound();  // Левот рычит
        lion1.play();       // Левот играет
        lion2.makeSound();  // Моргон рычит
        lion2.play();       // Моргон играет

        zoo.addAnimal(lion1);
        zoo.addAnimal(lion2);
        zoo.addAnimal(lion3);

        System.out.println("Теперь в зоопарке 9 животных (3 собаки, 3 птицы, 3 льва)");

        // Ещё раз по всем животным
        System.out.println("\n=== 1.8: Методы для всех 9 животных ===");
        allAnimals = zoo.getAnimals();
        for (Animal animal : allAnimals) {
            animal.makeSound();
            animal.play();
        }

        // ===== 1.9: Вывод информации о всех животных =====
        System.out.println("\n=== 1.9: Информация о всех животных ===");
        zoo.printAllAnimals();

        // ===== 1.9: Удаление животного по ID =====
        System.out.println("\n=== 1.9: Удаление животного с ID=2 ===");
        zoo.removeAnimalById(2);

        // Вывод после удаления
        System.out.println("\n=== 1.9: Информация после удаления ===");
        zoo.printAllAnimals();
    }
}