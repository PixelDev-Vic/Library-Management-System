// LibrarySystem.java
import java.util.*;
import java.io.*;
import java.time.LocalDate;

class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;
    private LocalDate dueDate;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    // Getters and setters
    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return isAvailable; }
    public LocalDate getDueDate() { return dueDate; }

    public void borrowBook() {
        this.isAvailable = false;
        this.dueDate = LocalDate.now().plusWeeks(2);
    }

    public void returnBook() {
        this.isAvailable = true;
        this.dueDate = null;
    }

    @Override
    public String toString() {
        return String.format("ISBN: %s | Title: %s | Author: %s | Available: %s",
                isbn, title, author, isAvailable ? "Yes" : "No");
    }
}

class Library {
    private Map<String, Book> books;
    private Set<String> borrowedBooks;

    public Library() {
        books = new HashMap<>();
        borrowedBooks = new HashSet<>();
        loadSampleBooks();
    }

    private void loadSampleBooks() {
        addBook(new Book("978-0134685991", "Effective Java", "Joshua Bloch"));
        addBook(new Book("978-0596009205", "Head First Design Patterns", "Eric Freeman"));
        addBook(new Book("978-0132350884", "Clean Code", "Robert Martin"));
        addBook(new Book("978-0201633610", "Design Patterns", "Gang of Four"));
    }

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    public void displayBooks() {
        System.out.println("\n=== LIBRARY CATALOG ===");
        for (Book book : books.values()) {
            System.out.println(book);
        }
    }

    public boolean borrowBook(String isbn) {
        Book book = books.get(isbn);
        if (book != null && book.isAvailable()) {
            book.borrowBook();
            borrowedBooks.add(isbn);
            System.out.println("Book borrowed successfully! Due date: " + book.getDueDate());
            return true;
        }
        System.out.println("Book not available or doesn't exist.");
        return false;
    }

    public boolean returnBook(String isbn) {
        Book book = books.get(isbn);
        if (book != null && !book.isAvailable()) {
            book.returnBook();
            borrowedBooks.remove(isbn);
            System.out.println("Book returned successfully!");
            return true;
        }
        System.out.println("Invalid return request.");
        return false;
    }

    public void searchByTitle(String title) {
        System.out.println("\n=== SEARCH RESULTS ===");
        for (Book book : books.values()) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println(book);
            }
        }
    }
}

public class LibrarySystem {
    private static Scanner scanner = new Scanner(System.in);
    private static Library library = new Library();

    public static void main(String[] args) {
        System.out.println("📚 Welcome to Library Management System!");

        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    System.out.print("Enter ISBN to borrow: ");
                    String borrowIsbn = scanner.nextLine();
                    library.borrowBook(borrowIsbn);
                    break;
                case 3:
                    System.out.print("Enter ISBN to return: ");
                    String returnIsbn = scanner.nextLine();
                    library.returnBook(returnIsbn);
                    break;
                case 4:
                    System.out.print("Enter title to search: ");
                    String searchTitle = scanner.nextLine();
                    library.searchByTitle(searchTitle);
                    break;
                case 5:
                    System.out.println("Thank you for using Library Management System!");
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\n=== MENU ===");
        System.out.println("1. View all books");
        System.out.println("2. Borrow book");
        System.out.println("3. Return book");
        System.out.println("4. Search books");
        System.out.println("5. Exit");
        System.out.print("Choose option: ");
    }
}