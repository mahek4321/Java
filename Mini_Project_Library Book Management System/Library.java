import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Add Book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // Remove Book by Title
    public void removeBook(String title) {
        boolean found = false;

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                System.out.println("Book removed successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found!");
        }
    }

    // Search Book
    public void searchBook(String title) {
        boolean found = false;

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book Found:");
                book.displayBook();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found!");
        }
    }

    // Display All Books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Library is empty!");
            return;
        }

        System.out.println("\nAvailable Books:");
        for (Book book : books) {
            book.displayBook();
        }
    }
}
