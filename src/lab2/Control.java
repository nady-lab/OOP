/*
 * Control.java
 * TU856/2 TU858/2 Object-Oriented Programming Lab
 *
 * This is the main program used to test the Book class.
 * It demonstrates:
 *  - Creating Book objects using different constructors
 *  - Printing object details using toString()
 *  - Using the titleLength() method
 *
 * Author: Colette Kirwan
 * Date: 28/09/2025
 */

package lab2;

public class Control {

    public static void main(String[] args) {

        // Create a Book object using the constructor with ISBN and title
        Book javabook = new Book(1234567, "TUD Learning Java");

        // Create another Book object using the constructor with ISBN, title and author
        Book b1 = new Book(12345, "Java Basics", "Alice Smith");

        // Print the details of the books
    
        System.out.println(javabook.displayDetails());
        System.out.println(b1.displayDetails());

        // Use titleLength() to find the number of characters in the title
        System.out.println("Title length of '" + b1.title
                + "' is: " + b1.titleLength());

        // Create another Book object with different values
        Book b2 = new Book(54321, "Advanced Java", "Bob Jones");
        System.out.println(b2.displayDetails());
        
        // two different library member objects
        // Create two LibraryMember objects using the two different constructors
        LibraryMember member1 = new LibraryMember("John", "Murphy", 101);

        LibraryMember member2 = new LibraryMember("Sarah", "Kelly", 102, "sarah.kelly@email.com", "Student");

        // Print the objects
        System.out.println(member1.displayDetails());
        System.out.println(member2.displayDetails());
        
        System.out.println(member1.toUpperCase());
        System.out.println(member2.toUpperCase());
      
    }
}
