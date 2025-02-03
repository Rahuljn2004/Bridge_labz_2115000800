class Book {
    private static String libraryName = "City Library";
    private final String isbn;
    private String title;
    private String author;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }
}

public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", "12345");
        Book book2 = new Book("1984", "George Orwell", "67890");
        book1.displayBookDetails();
        book2.displayBookDetails();
        Book.displayLibraryName();
    }
}
