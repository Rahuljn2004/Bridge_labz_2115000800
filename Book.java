class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + String.format("%.2f", price));
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java Basics", "John Smith", 29.99);
        book1.displayDetails();
    }
}
