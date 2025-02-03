class Product {
    private static double discount = 10.0;
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Product ID: " + productID);
            System.out.println("Discount: " + discount + "%");
        }
    }
}

public class ShoppingCartMain {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Laptop", 800, 2);
        Product p2 = new Product(2, "Phone", 500, 5);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.updateDiscount(15);
    }
}
