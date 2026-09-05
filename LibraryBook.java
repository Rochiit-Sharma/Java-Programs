class LibraryBook {

    public static void main(String[] args) {

        Book book = new Book(
            "9780135166307",
            "Java Programming",
            "Herbert Schildt",
            750
        );

        book.displayBook();
    }
}

class Book {

    final String ISBN;
    String title;
    String author;
    double price;

    Book(String ISBN, String title, String author, double price) {

        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayBook() {

        System.out.println("Library Book Details:");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs. " + price);
    }
}