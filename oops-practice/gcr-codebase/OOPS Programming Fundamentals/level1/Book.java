class Book {
    String title;
    String author;
    double price;
    boolean availability;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        availability = true;
    }

    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + availability);
    }
}

public class Main {
    public static void main(String[] args) {
        Book b = new Book("Java Programming", "James Gosling", 450);

        b.display();
        b.borrowBook();
        b.display();
    }
}