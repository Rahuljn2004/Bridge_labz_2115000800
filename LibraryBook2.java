class LibraryBook2 {
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    public LibraryBook2(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to access author
    public String getAuthor() {
        return author;
    }

    // Public method to modify author
    public void setAuthor(String author) {
        this.author = author;
    }
}

// Subclass demonstrating access to public and protected members
class EBook extends Book {
    private static final String ISBN = null;
        private double fileSize;
    
        public EBook(String ISBN, String title, String author, double fileSize) {
            super();
            this.fileSize = fileSize;
        }
    
        public void displayEBookDetails() {
            System.out.println("E-Book: " + title + " (ISBN: " + ISBN + ")");
        System.out.println("File Size: " + fileSize + "MB");
    }
}
