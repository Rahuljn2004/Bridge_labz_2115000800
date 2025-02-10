import java.util.*;

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    public double getPrice() {
        return price;
    }
}

interface Taxable {
    double calculateTax();
}

class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.1;
    }

    public double calculateTax() {
        return getPrice() * 0.18;
    }
}

public class ECommerce {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(101, "Laptop", 50000));

        for (Product p : products) {
            System.out.println("Final Price: " + (p.getPrice() + ((Taxable) p).calculateTax() - p.calculateDiscount()));
        }
    }
}
