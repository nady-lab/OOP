/*
 * Book.java
 * TU856/2 TU858/2 Object-Oriented Programming Lab
 *
 * This class represents a Book object with three attributes:
 * ISBN number, title, and author.
 *
 * It includes:
 *  - Constructors to create new Book objects
 *  - A toString() method to display details of a book in a readable way
 *  - A titleLength() method that uses the String length() method
 *
 * Author: Colette Kirwan
 * Date: 28/09/2025
 */

package lab2;

public class Book {

    // Attributes (fields) for each book
    int isbn;
    String title;
    String author;

    // No-argument constructor (creates an empty Book object)
    public Book() {
    }

    // Constructor with two parameters: ISBN and title
    // 'this' refers to this Book object.
    // It is used here because the attributes and parameters have the same names.
    // We will look at 'this' in more detail on Wednesday.
    public Book(int isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    // Constructor with three parameters: ISBN, title, and author
    public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    // Method to return a String with the book's details
    public String displayDetails() {
        return "Book [ISBN=" + isbn + ", Title=" + title + ", Author=" + author + "]";
    }

    // Method to return the length of the title
    // Uses the built-in String method length()
    public int titleLength() {
        return title.length();
    }
}
