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
