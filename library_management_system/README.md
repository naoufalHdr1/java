# Library Management System

## Task 1: Book Class

Create a class `Book` with the following attributes:
- `title` (String)
- `author` (String)
- `isbn` (String)
- `isAvailable` (boolean, initially true)
Add a constructor to initialize the attributes.
Implement getter and setter methods.
Override toString() to display book details.

## Task 2: Create a Library Class

Now, we will create a `Library` class that can:
- Store books in an `ArrayList<Book>`.
- Add books to the library.
- Display all available books.

## Task 3: Borrow and Return Books

Now, we will extend our `Book` and `Library` classes to allow users to:
- Borrow a book by ISBN.
- Return a book by ISBN.
- Update the isAvailable status of a book when borrowed or returned.
- Prevent borrowing if the book is already borrowed.

## Task 4: Implement User Management

Now, we will introduce users into our library system. Each user can:
- Register with a name and unique ID.
- Borrow multiple books.
- Return books they have borrowed.
- View their borrowed books.

## Task 5: Add Search Functionality

Now, we'll enhance the library system by adding search features:
- Search books by title.
- Search books by author.
- Display available books only.

## Task 6: Implement Book Categories & Genres

Now, we'll enhance the library system by adding book categories (genres):
- Each book will have a genre (e.g., Fiction, Non-Fiction, Science, History).
- Users can filter books by genre to find books more easily.

## Task 7: Implement a Fine System for Late Returns

Now, let's improve the borrowing system by adding a fine system for overdue books.
- Each book will have a due date (e.g., 7 days after borrowing).
- If a book is returned late, the user gets a fine (e.g., $1 per day late).
- Users can view their fines and pay them off.
