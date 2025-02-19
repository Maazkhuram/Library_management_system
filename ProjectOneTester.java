
public class ProjectOneTester {
    public static void main(String[] args) {
        // Create a Library
        Library library = new Library();

        // Create Book and Ebook instances
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "12345");
        Book book2 = new Book("Hench", "Natalie Zina Walschots", 2020, "1122330");
        Ebook ebook1 = new Ebook("Clean Code", "Robert C. Martin", 2008, "11223", "PDF", 5, "https://example.com/clean-code");
        Ebook ebook2 = new Ebook("Effective Java", "Joshua Bloch", 2008, "445566", "EPUB", 2, "https://example.com/effective-java");


        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(ebook1);
        library.addBook(ebook2);

        // Create Borrowers
        Borrower borrower1 = new Borrower("Random 1 ", 101);
        Borrower borrower2 = new Borrower("Random 2 ", 102);

        // Register borrowers in the library
        library.addBorrower(borrower1);
        library.addBorrower(borrower2);

        // Display books in the library
        System.out.println("\nLibrary Collection:");
        library.displayBooks();

        // Borrow and return books
        System.out.println("\nAttempting to lend books...");
        library.lendBook("12345", 101); // Lend "The Great Gatsby" to Alice
        library.lendBook("11223", 102); // Lend "Clean Code" to Bob

        // Display borrower details
        System.out.println("\nBorrower Details:");
        borrower1.displayBooks();
        borrower2.displayBooks();

        // Return a book
        System.out.println("\nAttempting to return a book");
        library.returnBook("12345", 101); // Alice returns "The Great Gatsby"

        // Display borrower details again
        System.out.println("\nUpdated Borrower Details:");
        borrower1.displayBooks();
        borrower2.displayBooks();
    }
}
