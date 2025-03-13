import java.util.ArrayList;
import java.util.List;

public class User {
    private String userId;
    private String name;
    private List<Book> borrowedBooks;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    } 

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Borrow Book if available
    public boolean borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrowBook();
            borrowedBooks.add(book);
            return true;
        }

        return false; // Book is already borrowed
    }

    // Return a book
    public boolean returnBook(String isbn) {
        for (Book book : borrowedBooks) {
            if (book.getIsbn().equals(isbn)) {
                book.returnBook();
                borrowedBooks.remove(book);
                return true;
            }
        }        

        return false; // Book was not found
    }

    // Display borrowed books
    public void displayBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println(name + " has not borrowed any books.");
            return;
        }
        
        System.out.println("\n" + name + "'s Borrowed Books:");
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }
}
