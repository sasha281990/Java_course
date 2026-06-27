package src.Task17;


import java.io.*;

public class Main {
    public static void main(String[] args) {
        String text = "The Rostóvs knew everybody in Moscow. The old count had money enough that year, as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, very stylish riding breeches of the latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his time very gaily. After a short period of adapting himself to the old conditions of life, Nicholas found it very pleasant to be at home again. He felt that he had grown up and matured very much. His despair at failing in a Scripture examination, his borrowing money from Gavríl to pay a sleigh driver, his kissing Sónya on the sly—he now recalled all this as childishness he had left immeasurably behind. Now he was a lieutenant of hussars, in a jacket laced with silver, and wearing the Cross of St. George, awarded to soldiers for bravery in action, and in the company of well-known, elderly, and respected racing men was training a trotter of his own for a race. He knew a lady on one of the boulevards whom he visited of an evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with Field Marshal Kámenski, visited the English Club, and was on intimate terms with a colonel of forty to whom Denísov had introduced him.";

        String relativePath = "relative_text.txt";
        String absolutePath = "C:\\Users\\aleksandr.filanovich\\Desktop\\text.txt"; // замени на свой путь
        String carFile = "car.bin";

        try {
            writeToRelativeFile(relativePath, text);
            writeToAbsoluteFile(absolutePath, text);

            String textFromFirstFile = readFromFirstFile(relativePath);
            String textFromSecondFile = readFromSecondFile(absolutePath);

            System.out.println("Текст из первого файла:");
            System.out.println(textFromFirstFile);

            System.out.println("\nТекст из второго файла:");
            System.out.println(textFromSecondFile);

            Car car = new Car("BMW", 240, "Germany");

            serializeCar(carFile, car);

            Car restoredCar = deserializeCar(carFile);
            System.out.println("\nДесериализованный автомобиль:");
            System.out.println(restoredCar);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeToRelativeFile(String path, String text) throws IOException {
        try (Writer writer = new FileWriter(path)) {
            writer.write(text);
        }
    }

    public static void writeToAbsoluteFile(String path, String text) throws IOException {
        try (Writer writer = new FileWriter(path)) {
            writer.write(text);
        }
    }

    public static String readFromFirstFile(String path) throws IOException {
        return readText(path);
    }

    public static String readFromSecondFile(String path) throws IOException {
        return readText(path);
    }

    private static String readText(String path) throws IOException {
        try (Reader reader = new FileReader(path)) {
            StringBuilder sb = new StringBuilder();
            char[] buffer = new char[1024];
            int len;
            while ((len = reader.read(buffer)) != -1) {
                sb.append(buffer, 0, len);
            }
            return sb.toString();
        }
    }

    public static void serializeCar(String fileName, Car car) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(car);
        }
    }

    public static Car deserializeCar(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Car) in.readObject();
        }
    }
}