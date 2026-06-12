package src.Task14;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Room {
    private int number;
    private Gender roomType;
    private List<Patient> patients;

    public Room(int number, Gender roomType) {
        this.number = number;
        this.roomType = roomType;
        this.patients = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Gender getRoomType() {
        return roomType;
    }

    public void setRoomType(Gender roomType) {
        this.roomType = roomType;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public boolean addPatient(Patient patient) {
        if (patients.size() >= 3) {
            return false;
        }
        if (!patients.isEmpty() && !patients.get(0).getDiagnosis().equals(patient.getDiagnosis())) {
            return false;
        }
        if (patient.getGender() != roomType) {
            return false;
        }
        return patients.add(patient);
    }

    public void printPatientsInfo() {
        System.out.println("Room №" + number + ", type: " + roomType);
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    public long countByGender(Gender gender) {
        return patients.stream().filter(p -> p.getGender() == gender).count();
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", roomType=" + roomType +
                ", patients=" + patients.stream().map(Patient::toString).collect(Collectors.toList()) +
                '}';
    }
}