import java.util.*;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

interface Discountable {
    double applyDiscount();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.1;
    }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50;
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }
}

public class FoodDelivery {
    public static void main(String[] args) {
        List<FoodItem> orders = new ArrayList<>();
        orders.add(new VegItem("Paneer Curry", 200, 2));
        orders.add(new NonVegItem("Chicken Biryani", 350, 1));

        for (FoodItem item : orders) {
            item.getItemDetails();
            System.out.println("Total Price: " + item.calculateTotalPrice());
        }
    }
}
