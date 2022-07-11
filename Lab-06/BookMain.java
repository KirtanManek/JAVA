/* 2. Declare a class called book having author_name as private data member.
      Extend book class to have two sub classes called book_publication & paper_publication.
      Each of these classes have private member called title.
      Write a complete program to show usage of dynamic method dispatch (dynamic polymorphism)
      to display book or paper publications of given author.
      Use command line arguments for inputting data. */

package java_classes;
import java.util.Scanner;

class Book {
    private String author_name = "Amish";

    void display() {
        System.out.println("Author : "+author_name);
    }
}

class BookPublication extends Book {
    private String title = "Mehula";

    void display() {
        System.out.println("Book Title : "+title);
    }
}

class PaperPublication extends Book {
    private String title = "Prime";

    void display() {
        System.out.println("Paper Title : "+title);
    }
}

public class BookMain {
    public static void main(String[] args) {
        /*
        // User inputs type and object is made and called with respect to the input.
        Scanner input = new Scanner(System.in);
        String book;
        Book b1;

        System.out.print("Enter what it is (book,book_publication or paper_publication) : ");
        book = input.next();
        book = book.toLowerCase();

        if (book.equals("book")) {
            b1 = new Book();
            b1.display();
        }

        else if (book.equals("book_publication")) {
            b1 = new BookPublication();
            b1.display();
        }

        else if (book.equals("paper_publication")) {
            b1 = new PaperPublication();
            b1.display();
        }
        */

        Book b1 = new Book(); // Dynamic method dispatch
        b1.display();

        Book b2 = new BookPublication(); // Dynamic method dispatch
        b2.display();

        Book b3 = new PaperPublication(); // Dynamic method dispatch
        b3.display();
    }
}
