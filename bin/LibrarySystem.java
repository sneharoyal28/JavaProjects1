package sneha;

import java.util.*;

class Book {
    String title;
    String author;
    String genre;

    // Constructor
    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String toString() {
        return title + " by " + author + " [" + genre + "]";
    }
}

public class LibrarySystem {
    private ArrayList<Book> bookList = new ArrayList<>();
    private LinkedList<Book> recentBooks = new LinkedList<>();
    private HashSet<String> authors = new HashSet<>();
    private HashMap<String, List<Book>> genreMap = new HashMap<>();

    // Method 1: Add book
    public void addBook(Book book) {
        bookList.add(book);
        authors.add(book.author);
        recentBooks.addFirst(book); // recent additions at beginning

        genreMap.putIfAbsent(book.genre, new ArrayList<>());
        genreMap.get(book.genre).add(book);
    }

    // Method 2: Display all books
    public void displayAllBooks() {
        System.out.println("All Books:");
        for (Book b : bookList) {
            System.out.println(b);
        }
    }

    // Method 3: Display recent additions
    public void displayRecentBooks(int count) {
        System.out.println("\nRecent " + count + " Books:");
        int displayed = 0;
        for (Book b : recentBooks) {
            if (displayed++ >= count) break;
            System.out.println(b);
        }
    }

    // Method 4: Display all unique authors
    public void displayAuthors() {
        System.out.println("\nUnique Authors:");
        for (String author : authors) {
            System.out.println(author);
        }
    }

    // Method 5: Display books by genre
    public void displayBooksByGenre(String genre) {
        System.out.println("\nBooks in genre: " + genre);
        List<Book> booksInGenre = genreMap.getOrDefault(genre, new ArrayList<>());
        for (Book b : booksInGenre) {
            System.out.println(b);
        }
    }

    // Main method
    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();

        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy"));
        library.addBook(new Book("1984", "George Orwell", "Dystopian"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "Classic"));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic"));
        library.addBook(new Book("Brave New World", "Aldous Huxley", "Dystopian"));

        library.displayAllBooks();
        library.displayRecentBooks(3);
        library.displayAuthors();
        library.displayBooksByGenre("Classic");
    }
}
