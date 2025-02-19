import java.util.*;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Borrower> borrowers;

    public Library() {
        books = new ArrayList<Book>();
        borrowers = new ArrayList<Borrower>();
    }

    // Prevents duplicate books (checks ISBN before adding)
    public void addBook(Book book) {
        for (Book b : books) {
            if (b.getISBN().equals(book.getISBN())) {
                System.out.println("Book with ISBN " + book.getISBN() + " already exists in the library.");
                    return;
            }
        }
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Prevents duplicate borrowers (checks borrower ID before adding)
    public void addBorrower(Borrower borrower) {
        for (Borrower b : borrowers) {
            if (b.getBorrowerID() == borrower.getBorrowerID()) {
                System.out.println("Borrower with ID " + borrower.getBorrowerID() + " is already registered.");
                return;
            }
        }
        borrowers.add(borrower);
        System.out.println("Borrower added: " + borrower.getName());
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("There are no books in the library.");
        } else {
            for (Book book : books) {
                book.display();
            }
        }
    }

    public void lendBook(String ISBN, int borrowerID) {
        Book book = null;
        Borrower borrower = null;

        for (Book b : books) {
            if (b.getISBN().equals(ISBN)) {
                book = b;
                break;
            }
        }
        for (Borrower b : borrowers) {
            if (b.getBorrowerID() == borrowerID) {
                borrower = b;
                break;
            }
        }

        if (book == null) {
            System.out.println("Error: Book or Borrower not found.");
        } 
        else if (book.isAvailable()) {
            borrower.borrowBook(book);
            System.out.println("Book borrowed successfully: " + book.getTitle());
        }
         else {
            System.out.println("Book is already borrowed: " + book.getTitle());
        }
    }

    public void returnBook(String ISBN, int borrowerID) {
        Book book = null;
        Borrower borrower = null;

        for (Book b : books) {
            if (b.getISBN().equals(ISBN)) {
                book = b;
                break;
            }
        }
        for (Borrower b : borrowers) {
            if (b.getBorrowerID() == borrowerID) {
                borrower = b;
                break;
            }
        }

        if (book == null || borrower == null) {
            System.out.println("Error: Book or Borrower not found.");
        } else {
            borrower.returnBook(book);
            System.out.println("Book returned successfully: " + book.getTitle());
        }
    }
}
