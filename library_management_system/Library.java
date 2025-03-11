import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Library {
    private List<Book> books; // List to store books
    private Map<String, User> users; // Map userId to User object

    // constructor
    public Library() {
        this.books = new ArrayList<>();
        this.users = new HashMap<>();
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

    // Borrow a book by ISBN
    public void borrowBook(String isbn, String userId) {
        User user = users.get(userId);
        if (!user) {
            System.out.println("User not found");
            return;
        }

        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (user.borrowBook(book)) {
                    System.out.println(user.getName() + " borrowed: " + book.getTitle());
                } else {
                    System.out.println("Sorry, this book is already borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found");
    }

    // Return a book by ISBN
    public void returnBook(String isbn, String userId) {
        User user = users.get(userId);
        if (!user) {
            System.out.println("User not found");
            return;
        }

        if (user.returnBook(isbn)) {
            System.out.println(user.getName() + " returned the book.);
        } else {
            System.out.println("You haven't borrowed this book.");
        }
    }

    public void displayUserborrowedBooks(String userId) {
        User user = users.get(userId);
        if (user) {
            user.displayBorrowedBooks();
        } else {
            System.out.println("User not found!");
        }
    }
}
