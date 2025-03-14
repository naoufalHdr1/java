public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;
    private String genre;

    // Constructor
    public Book(String title, String author, String isbn, String genre) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true; // Default: available
        this.genre = genre;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getGenre() {
        return genre;
    }

    // Setters
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Borrow the book (if it's available)
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }

        return false; // Book already borrowed
    }

    // Return the book
    public void returnBook() {
        isAvailable = true;
    }

    // Override toString() to display book details
    @Override
    public String toString() {
        return "Book{" +
                "Title='" + title + '\'' +
                ", Author='" + author + '\'' +
                ", ISBN='" + isbn + '\'' +
                ", Available=" + (isAvailable ? "Yes" : "No") +
                '}';
    }
}
