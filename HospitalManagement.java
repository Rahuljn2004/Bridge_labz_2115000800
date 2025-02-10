import java.util.*;

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();

    public InPatient(int patientId, String name, int age) {
        super(patientId, name, age);
    }

    public double calculateBill() {
        return 10000;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public void viewRecords() {
        System.out.println("Medical Records: " + records);
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Patient patient = new InPatient(201, "Alice", 30);
        patient.getPatientDetails();
        System.out.println("Bill Amount: " + patient.calculateBill());
    }
}
