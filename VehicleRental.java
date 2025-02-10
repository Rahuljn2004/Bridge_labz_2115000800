import java.util.*;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
}

class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    public double calculateRentalCost(int days) {
        return days * 1000;
    }

    public double calculateInsurance() {
        return 5000;
    }
}

public class VehicleRental {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("AB123", 1000));

        for (Vehicle v : vehicles) {
            System.out.println("Rental Cost: " + v.calculateRentalCost(3));
        }
    }
}
