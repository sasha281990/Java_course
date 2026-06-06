package src.Task10;

public class Zoo {
    private src.Task10.Animal[] animals;  // массив животных (п.1.3)
    private int size;  // текущее количество животных
    private static int nextId = 1;  // следующий уникальный ID (п.1.9)

    public Zoo() {
        animals = new src.Task10.Animal[0];
        size = 0;
    }

    // Метод добавления животного (п.1.4)
    public void addAnimal(src.Task10.Animal animal) {
        // Создать новый массив с размером на 1 больше
        src.Task10.Animal[] newAnimals = new src.Task10.Animal[size + 1];

        // Скопировать текущий массив в новый
        for (int i = 0; i < size; i++) {
            newAnimals[i] = animals[i];
        }

        // Добавить новое животное
        newAnimals[size] = animal;

        // Записать новый массив в поле animals
        animals = newAnimals;
        size++;
    }

    // Метод получения всех животных (п.1.5)
    public src.Task10.Animal[] getAnimals() {
        return animals;
    }

    // Метод вывода информации о всех животных (п.1.9)
    public void printAllAnimals() {
        System.out.println("=== Все животные в зоопарке ===");
        for (int i = 0; i < size; i++) {
            System.out.println(animals[i].toString());
        }
        System.out.println("Total животных: " + size);
    }

    // Метод удаления животного по ID (п.1.9)
    public void removeAnimalById(int id) {
        int index = -1;

        // Найти индекс животного с данным ID
        for (int i = 0; i < size; i++) {
            if (animals[i].getId() == id) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Животное с ID " + id + " не найдено");
            return;
        }

        // Создать новый массив с размером на 1 меньше
        src.Task10.Animal[] newAnimals = new Animal[size - 1];

        // Скопировать элементы, исключая удалённое
        for (int i = 0; i < index; i++) {
            newAnimals[i] = animals[i];
        }
        for (int i = index + 1; i < size; i++) {
            newAnimals[i - 1] = animals[i];
        }

        animals = newAnimals;
        size--;

        System.out.println("Животное с ID " + id + " удалено из зоопарка");
    }

    // Getter для nextId
    public static int getNextId() {
        return nextId;
    }

    // Setter для nextId
    public static void setNextId(int id) {
        nextId = id;
    }
}