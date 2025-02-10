import java.util.*;

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate: " + ratePerKm + " per km");
    }

    public double getRatePerKm() {
        return ratePerKm;
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

class Car extends Vehicle implements GPS {
    private String location = "Unknown";

    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}

public class RideHailingApp {
    public static void main(String[] args) {
        Vehicle car = new Car("CAR123", "John", 10);
        car.getVehicleDetails();
        System.out.println("Fare for 15 km: " + car.calculateFare(15));
    }
}
