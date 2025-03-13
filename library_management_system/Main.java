import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien", "123456"));
        library.addBook(new Book("1984", "George Orwell", "654321"));
        library.addBook(new Book("Clean Code", "Robert C. Martin", "987654"));
        library.addBook(new Book("The Lord of the Rings", "J.R.R. Tolkien", "112233"));

        // Registering users
        library.registerUser(new User("U001", "Alice"));
        library.registerUser(new User("U002", "Bob"));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Display Books");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. View Borrowed Books");
            System.out.println("5. Search Book by Title");
            System.out.println("6. Search Book by Author");
            System.out.println("7. View Available Books");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    System.out.print("Enter your User ID: ");
                    String borrowUserId = scanner.nextLine();
                    System.out.print("Enter ISBN of book to borrow: ");
                    String borrowIsbn = scanner.nextLine();
                    library.borrowBook(borrowUserId, borrowIsbn);
                    break;
                case 3:
                    System.out.print("Enter your User ID: ");
                    String returnUserId = scanner.nextLine();
                    System.out.print("Enter ISBN of book to return: ");
                    String returnIsbn = scanner.nextLine();
                    library.returnBook(returnUserId, returnIsbn);
                    break;
                case 4:
                    System.out.print("Enter your User ID: ");
                    String userId = scanner.nextLine();
                    library.displayUserBorrowedBooks(userId);
                    break;
                case 5:
                    System.out.print("Enter book title to search: ");
                    String title = scanner.nextLine();
                    library.searchByTitle(title);
                    break;
                case 6:
                    System.out.print("Enter author name to search: ");
                    String author = scanner.nextLine();
                    library.searchByAuthor(author);
                    break;
                case 7:
                    library.displayAvailableBooks();
                    break;
                case 8:
                    System.out.println("Exiting Library System. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

