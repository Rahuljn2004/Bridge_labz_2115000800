class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable; // Availability status

    // Constructor to initialize book details
    public LibraryBook(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false; // Mark as borrowed
            System.out.println("You have successfully borrowed: " + title);
            return true;
        } else {
            System.out.println("Sorry, " + title + " is currently unavailable.");
            return false;
        }
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
}
