import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class User {
    private String userId;
    private String name;
    private List<Book> borrowedBooks;
    private double fineAmount;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
        this.fineAmount = 0.0;
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
                LocalDate today = LocalDate.now();
                if (today.isAfter(book.getDueDate())) {
                    long daysLate = today.toEpochDay() - book.getDueDate().toEpochDay();
                    fineAmount += daysLate * 1.0;
                    System.out.println("Late return! You have been fined $" + (daysLate * 1.0));
                }
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

    public double getFineAmount() {
        return fineAmount;
    }

    public void payFine(double amount) {
        if (amount >= fineAmount) {
            System.out.println("Fine paid. Thank you!");
            fineAmount = 0;
        } else {
            fineAmount -= amount;
            System.out.println("Partial payment made. Remaining fine: $" + fineAmount);
        }
    }

    public void displayFines() {
        System.out.println(name + "'s Total Fine: $" + fineAmount);
    }
}
