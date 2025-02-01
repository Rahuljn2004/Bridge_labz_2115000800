class Circle {
    private double radius;

    // Default Constructor
    public Circle() {
        this(1.0); // Calls the parameterized constructor with default value
    }

    // Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
}
