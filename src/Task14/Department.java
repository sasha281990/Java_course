package src.Task14;

import java.util.HashSet;
import java.util.Set;

public class Department {
    private String name;
    private Set<Room> rooms;

    public Department(String name) {
        this.name = name;
        this.rooms = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public long countMen() {
        return rooms.stream()
                .flatMap(room -> room.getPatients().stream())
                .filter(p -> p.getGender() == Gender.MALE)
                .count();
    }

    public long countWomen() {
        return rooms.stream()
                .flatMap(room -> room.getPatients().stream())
                .filter(p -> p.getGender() == Gender.FEMALE)
                .count();
    }

    public void printInfo() {
        System.out.println("Department: " + name);
        for (Room room : rooms) {
            room.printPatientsInfo();
        }
        System.out.println("Men: " + countMen());
        System.out.println("Women: " + countWomen());
    }
}
