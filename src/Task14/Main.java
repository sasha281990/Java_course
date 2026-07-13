package src.Task14;


public class Main {
    public static void main(String[] args) {
        Patient p1 = new Patient(1, "Ivan", "Petrov", "Flu", 30, Gender.MALE);
        Patient p2 = new Patient(2, "Anna", "Sidorova", "Flu", 25, Gender.FEMALE);
        Patient p3 = new Patient(3, "Pavel", "Ivanov", "Flu", 40, Gender.MALE);
        Patient p4 = new Patient(4, "Olga", "Smirnova", "Cold", 28, Gender.FEMALE);
        Patient p5 = new Patient(5, "Sergey", "Kozlov", "Cold", 35, Gender.MALE);
        Patient p6 = new Patient(6, "Maria", "Volkova", "Cold", 22, Gender.FEMALE);

        Patient duplicate1 = new Patient(1, "Ivan", "Petrov", "Flu", 30, Gender.MALE);
        Patient duplicate2 = new Patient(1, "Ivan", "Petrov", "Flu", 30, Gender.MALE);

        Room maleRoom = new Room(101, Gender.MALE);
        Room femaleRoom = new Room(102, Gender.FEMALE);

        maleRoom.addPatient(p1);
        maleRoom.addPatient(p3);
        maleRoom.addPatient(p5);

        femaleRoom.addPatient(p2);
        femaleRoom.addPatient(p4);
        femaleRoom.addPatient(p6);

        System.out.println("Trying to add duplicates:");
        System.out.println("duplicate1 added: " + maleRoom.addPatient(duplicate1));
        System.out.println("duplicate2 added: " + maleRoom.addPatient(duplicate2));

        Department department = new Department("Therapy");
        department.addRoom(maleRoom);
        department.addRoom(femaleRoom);

        department.printInfo();

        System.out.println("Sorted patients in male room by id:");
        maleRoom.getPatients().stream()
                .sorted()
                .forEach(System.out::println);
    }
}