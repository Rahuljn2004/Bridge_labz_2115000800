class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0; // Class variable

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment for each new product
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class method to display total products
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}
