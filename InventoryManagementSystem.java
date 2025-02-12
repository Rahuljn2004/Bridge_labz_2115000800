class Item {
    String itemName;
    int itemId, quantity;
    double price;
    Item next;

    public Item(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class InventoryManagementSystem {
    Item head;

    public void addItem(String itemName, int itemId, int quantity, double price, boolean atEnd) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        if (head == null || !atEnd) {
            newItem.next = head;
            head = newItem;
        } else {
            Item temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newItem;
        }
    }

    public void removeItem(int itemId) {
        if (head == null) return;
        if (head.itemId == itemId) {
            head = head.next;
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.itemId != itemId)
            temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    public void updateQuantity(int itemId, int newQuantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
    }

    public void searchItem(int itemId) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                System.out.println("Found: " + temp.itemName);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item Not Found");
    }

    public void displayInventory() {
        Item temp = head;
        while (temp != null) {
            System.out.println(temp.itemId + " " + temp.itemName + " " + temp.quantity + " " + temp.price);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        ims.addItem("Laptop", 101, 10, 700.0, true);
        ims.addItem("Phone", 102, 20, 500.0, true);
        ims.displayInventory();
        ims.updateQuantity(101, 5);
        ims.displayInventory();
        ims.removeItem(102);
        ims.displayInventory();
    }
}
