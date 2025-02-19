import java.util.*;
public class Borrower{

    private String name;
    private int borrowerID;
    private ArrayList<Book> borrowedBooks;

    public Borrower(String name, int borrowerID){
        this.name = name;
        this.borrowerID = borrowerID;
        borrowedBooks = new ArrayList<Book>();
    }
    public Borrower(String name){
        this(name,0);
    }

    //getters
    public String getName(){
        return name;
    }
    public int getBorrowerID(){
        return borrowerID;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setBorrowerID(int borrowerID){
        this.borrowerID = borrowerID;
    }
    //method for borrowing a book
    public void borrowBook(Book book) {
        if (borrowedBooks.contains(book)) {
            System.out.println(name + " has already borrowed " + book.getTitle());
            return;
        }
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setIsBorrowed(true);
            System.out.println(name + " has borrowed " + book.getTitle());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is not available.");
        }
    }
    
    public void returnBook(Book book) {
        if (!borrowedBooks.contains(book)) {
            System.out.println("Error: " + name + " did not borrow " + book.getTitle());
            return;
        }
        borrowedBooks.remove(book);
        book.setIsBorrowed(false);
        System.out.println(name + " has returned " + book.getTitle());
    }
    
    //display the borrowed books
    public void displayBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println(name + " has no borrowed books.");
        } else {
            System.out.println(name + " has the following borrowed books:");
            for (Book book : borrowedBooks) {
                System.out.println(" - " + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
    
    @Override
    //override the toString method
    //the string representation of a borrower is its name and borrowerID
    public String toString(){
        return "Borrower[Name: " + name + " BorrowerID: " + borrowerID + "]";
    }

    @Override
    //override the equals method
    //two borrowers are equal if they have the same borrowerID
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Borrower other = (Borrower) obj;
        return borrowerID == other.borrowerID;
    }

}