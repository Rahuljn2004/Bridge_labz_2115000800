// Superclass
class Vehicle {
    int maxSpeed;
    String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface for refueling (Simulating Multiple Inheritance)
interface Refuelable {
    void refuel();
}

// Subclass 1: Electric Vehicle
class ElectricVehicle extends Vehicle {
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge() {
        System.out.println(model + " (Electric Vehicle) is charging.");
    }
}

// Subclass 2: Petrol Vehicle (Implements Refuelable)
class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println(model + " (Petrol Vehicle) is refueling.");
    }
}

// Main Class to Test
public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3");
        PetrolVehicle pv = new PetrolVehicle(180, "Ford Mustang");

        // Displaying vehicle info
        ev.displayInfo();
        ev.charge();

        pv.displayInfo();
        pv.refuel();
    }
}
