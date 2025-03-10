public class Main {
    public static void main(String[] args) {
    	Library library = new Library();

        // Creating books
        Book book1 = new Book("The Hobbit", "J.R.R Tolkien", "123456");
        Book book2 = new Book("1984", "George Orwell", "654321");

        // Adding books to library
        library.addBook(book1);
        library.addBook(book2);

        // Display all books
        library.displayBooks();
    }
}
