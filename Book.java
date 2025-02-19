
public class Book implements Comparable<Book> {
    // Fields
    private String title;
    private String author;
    private int year;
    private String ISBN;
    private boolean isBorrowed;

    // Constructor
    public Book(String title, String author, int year, String ISBN) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.ISBN = ISBN;
        this.isBorrowed = false;
    }
    
    // Constructor Overload
    public Book(String title, String author) {
        this(title, author, 0, "Unknown ISBN");
    }

    // Getters and Setters
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    // Display method to print book details
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("ISBN: " + ISBN);
    }

    // Method to check availability of the book
    public boolean isAvailable() {
        return !isBorrowed;
    }

    // Override the toString method for a string representation of the book
    @Override
    public String toString() {
        return "Book[Title: " + title + " Author: " + author + " Year: " + year + " ISBN: " + ISBN + "]";
    }

    // Override the equals method to compare books based on their attributes
    // Two books are equal if they have the same title, author, year, and ISBN
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Book) {
            Book other = (Book) obj;
            return this.title.equals(other.title) && this.author.equals(other.author) && this.year == other.year && this.ISBN.equals(other.ISBN);
        }
        return false;
    }

    // Implementing the compareTo method from Comparable interface
    @Override
    public int compareTo(Book other) {
        // Compare books based on their title alphabetically
        return this.title.compareTo(other.title);
    }
}
