# Java Console Bank System with Database

## 📌 Project Description

This project is a **console-based banking system** developed in **Java** with **MySQL database integration**. It simulates basic banking operations such as creating accounts, viewing account details, deposits, withdrawals, balance checks, and transaction history. The system is designed to handle multiple users and stores all data securely in the database.

## 💻 Features

✅ User Registration and Login  
✅ Create Bank Accounts  
✅ Deposit Money  
✅ Withdraw Money  
✅ Check Account Balance  
✅ View Transaction History  
✅ Database Integration with MySQL  
✅ Error Handling and Data Validation  
✅ User-friendly Console UI  

## 🛠️ Technologies Used

- **Java (JDBC)**
- **MySQL Database**
- **Maven** (for dependency management) - optional
- **Git**

## 📚 Database Structure

### Database: `bank_system`

#### Tables:
- **users**
  - id (Primary Key)
  - username
  - password (hashed for security)
  
- **accounts**
  - `account_id` (Primary Key)
  - `user_id` (Foreign Key)
  - `account_number`
  - `balance`
  
- **transactions**
  - `transaction_id` (Primary Key)
  - `account_id` (Foreign Key)
  - `type` (Deposit/Withdrawal)
  - `amount`
  - `timestamp`

## 🚀 Getting Started

### Prerequisites

- Java 17+ installed
- MySQL installed and running
- JDBC Driver (mysql-connector-java)

### Setup Database

Create a MySQL database named `bank_system`
Execute the provided `database.sql` script to create tables

### Configure Database Connection

Edit the database connection properties in `DatabaseConnection.java`
```java
private static final String URL = "jdbc:mysql://localhost:3306/bank_system";
private static final String USER = "your_db_user";
private static final String PASSWORD = "your_db_password";
```

### Compile and Run

```bash
javac -cp .;mysql-connector-java-8.0.xx.jar Main.java
java -cp .;mysql-connector-java-8.0.xx.jar Main
```

## Future Enhancements

- Password encryption (BCrypt / SHA-256)
- Admin Panel to manage users
- Interest calculations
- Fund transfers between accounts
- GUI (Swing/JavaFX)

## Contributing

Feel free to fork this repository and contribute by submitting a pull request. Improvements, bug fixes, and new features are welcome!
