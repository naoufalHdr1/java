import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books; // List to store books

    // constructor
    public Library() {
        this.books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Display all books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }

        System.out.println("\nList of books in the library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
