class Book {
    String title;
    String author;
    int price;
    int year; 
    Book(String title, String author, int price, int year) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
    }
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Year: " + year);
        System.out.println();
    }
    }

    public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        Book b1 = new Book("The Guide", "narayan", 800, 2004);
         books[0] = b1;
        Book b2 = new Book("Animal Farm ", "George Orwell", 900, 2008);
        books[1] = b2;
        Book b3 = new Book("Wings of Fire ", "APJ", 450, 1988);
         books[2] = b3;
        for (int i = 0; i < books.length; i++) {
            books[i].display();
        }
    }
}
