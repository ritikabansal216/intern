package Projects;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed the book: " + title);
        } else {
            System.out.println("Sorry, the book " + title + " is already borrowed.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Thank you for returning the book: " + title);
    }
}

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    // Other methods for managing the library can be added here.
}

public class LibraryManagementSystem {
    // The rest of the code remains the same.
    // ...
}
/*
 * Basic Library Management System Documentation
 * Purpose:
 * The Basic Library Management System is a simplified Java program designed to
 * manage a collection of books. Its primary purpose is to allow users to
 * interact with the library by adding books, listing available books, borrowing
 * books, and returning books.
 * 
 * Key Components:
 * Book Class:
 * 
 * The Book class represents individual books in the library.
 * Each book has attributes such as title, author, and availability status
 * (isAvailable).
 * It provides methods to:
 * Retrieve the title and author of the book.
 * Check if the book is available.
 * Borrow the book.
 * Return the book.
 * Library Class:
 * 
 * The Library class manages a collection of books using a private list of Book
 * objects.
 * It provides methods to:
 * Add books to the library.
 * Get the list of books.
 * Perform other library management operations (which can be added as needed).
 * 
 * Methods in the Basic Library Management System
 * Book Class Methods:
 * Book(String title, String author):
 * 
 * Constructor to create a new Book object with the specified title and author.
 * Initializes the book's availability status as true (i.e., available).
 * getTitle():
 * 
 * Returns the title of the book.
 * getAuthor():
 * 
 * Returns the author of the book.
 * isAvailable():
 * 
 * Returns a boolean indicating whether the book is available for borrowing.
 * borrow():
 * 
 * Marks the book as unavailable (borrowed).
 * Displays a message if the book was successfully borrowed or if it's already
 * borrowed.
 * returnBook():
 * 
 * Marks the book as available (returned).
 * Displays a message to thank the user for returning the book.
 * Library Class Methods:
 * Library():
 * 
 * Constructor to create a new Library object.
 * Initializes an empty list to store books.
 * addBook(String title, String author):
 * 
 * Adds a new book to the library with the given title and author.
 * Creates a new Book object and adds it to the list of books in the library.
 * getBooks():
 * 
 * Returns the list of books in the library.
 * Provides access to the list of books for external operations (such as listing
 * books).
 * LibraryManagementSystem Class Methods:
 * main(String[] args):
 * The main method is the entry point of the program.
 * Implements the user interface and menu-driven system for interacting with the
 * library.
 * Allows users to add books, list available books, borrow books, return books,
 * and exit the system.
 * Utilizes methods from the Library class and Book class to perform these
 * operations.
 * Handles user input and displays appropriate messages based on user actions.
 */