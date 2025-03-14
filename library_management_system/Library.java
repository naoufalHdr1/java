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

    public void registerUser(User user) {
        if (!users.containsKey(user.getUserId())) {
            users.put(user.getUserId(), user);
            System.out.println("User registered: " + user.getName());
        } else {
            System.out.println("User Id already exists!");
        }
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
        System.out.println("-- users=" + users);
        System.out.println("-- userId=" + userId);
        User user = users.get(userId);
        System.out.println("-- user=" + user);
        if (user == null) {
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
        if (user == null) {
            System.out.println("User not found");
            return;
        }

        if (user.returnBook(isbn)) {
            System.out.println(user.getName() + " returned the book.");
        } else {
            System.out.println("You haven't borrowed this book.");
        }
    }

    public void displayUserBorrowedBooks(String userId) {
        User user = users.get(userId);
        if (user != null) {
            user.displayBorrowedBooks();
        } else {
            System.out.println("User not found!");
        }
    }

    // Search books by title
    public void searchByTitle(String title) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                foundBooks.add(book);
            }
        }
        displaySearchResults(foundBooks, "Title: " + title);
    }

    // Search books by author
    public void searchByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                foundBooks.add(book);
            }
        }
        displaySearchResults(foundBooks, "Author: " + author);
    }

    // Filter books by genre
    public void filterByGenre(String genre) {
        List<Book> filteredBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre().equalsIgnoreCase(genre)) {
                filteredBooks.add(book);
            }
        }
        displaySearchResults(filteredBooks, "Genre: " + genre);
    }

    // Display available books only
    public void displayAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        displaySearchResults(availableBooks, "Available Books");
        
    }

    // Helper method to display search results
    public void displaySearchResults(List<Book> foundBooks, String searchCriteria) {
        System.out.println("\nSearch Results for " + searchCriteria + ":");
        if (foundBooks.isEmpty()) {
            System.out.println("No books found.");
        } else {
            for (Book book : foundBooks) {
                System.out.println(book);
            }
        }
    }
}
