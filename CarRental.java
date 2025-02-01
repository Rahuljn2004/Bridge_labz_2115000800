class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double rentalRate = 50.0; // Example fixed rate per day

    // Default Constructor
    public CarRental() {
        this("Customer", "Standard", 1);
    }

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Copy Constructor
    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
    }

    // Encapsulated logic for price calculation
    private double calculateTotalCost() {
        return rentalDays * rentalRate;
    }

    public double getTotalCost() {
        return calculateTotalCost();
    }
}
