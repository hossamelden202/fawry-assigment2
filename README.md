# Quantum Book Store

A simple object-oriented Java system that manages different types of books in an online bookstore — including paper books, eBooks, and non-sale demo books. Supports adding books, removing outdated ones, and purchasing with simulated delivery actions.

---

##  Features

- Add books to inventory (`PaperBook`, `EBook`, `ShowcaseBook`)
- Remove outdated books by year
- Buy a book by ISBN and quantity
  - Paper books trigger shipping (via `ShippingService`)
  - EBooks are sent to email (via `MailService`)
- Showcase books are not for sale
- Simple console test using `QuantumBookstoreFullTest`

---

##  File Structure

src/  
├── Book.java  
├── PaperBook.java  
├── EBook.java  
├── ShowcaseBook.java  
├── BookInventory.java  
├── MailService.java  
├── ShippingService.java  
└── QuantumBookstoreFullTest.java  

---

## How to Compile and Run

###  One-time setup

Open terminal and run:

```bash
cd ~/Desktop/assigment-fawry2
cd src
javac *.java
java QuantumBookstoreFullTest
```

 You should see output related to:
-----------------------------------

- Book listing
- Removal of outdated books
- Purchase success/fail messages

-----------------------------------

###  Requirements
---------------

- Java 11 or higher
- Terminal access (Linux/macOS/Windows)
