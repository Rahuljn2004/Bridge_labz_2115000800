import java.util.*;

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }
}

interface Reservable {
    boolean reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }

    public boolean reserveItem() {
        return true;
    }

    public boolean checkAvailability() {
        return true;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem book = new Book(101, "Java Programming", "John Doe");
        book.getItemDetails();
        System.out.println("Loan Duration: " + book.getLoanDuration() + " days");
    }
}
