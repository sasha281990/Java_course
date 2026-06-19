package src.Task14;

import java.util.*;

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
        long count = 0;
        for (Room room : rooms) {
            for (Patient patient : room.getPatients()) {
                if (patient.getGender() == Gender.MALE) {
                    count++;
                }
            }
        }
        return count;
    }

    public long countWomen() {
        long count = 0;
        for (Room room : rooms) {
            for (Patient patient : room.getPatients()) {
                if (patient.getGender() == Gender.FEMALE) {
                    count++;
                }
            }
        }
        return count;
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