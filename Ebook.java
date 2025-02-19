public class Ebook extends Book {
    private String format;
    private int size;
    private String url;

    // Constructor
    public Ebook(String title, String author, int year, String ISBN, String format, int size, String url) {
        super(title, author, year, ISBN);
        this.format = format;
        this.size = size;
        this.url = url;
    }
    // Constructor Overload
    public Ebook(String title, String author, String format, int size, String url) {
        super(title, author);
        this.format = format;
        this.size = size;
        this.url = url;
    }

    // Getters and Setters
    public String getFormat() {
        return format;
    }

    public int getSize() {
        return size;
    }

    public String getUrl() {
        return url;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setSize(int size) {
        if (size > 0) {
            this.size = size;
        } else {
            System.out.println("Error: Size must be greater than 0");
        }
    }
    

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    // display method
    // This method will display the details of the Ebook
    public void display() {
    super.display(); 
    System.out.println("Format: " + format);
    System.out.println("Size: " + size + "MB");
    System.out.println("URL: " + url);
    }

    @Override
    // equals method
    // This method will compare the Ebook object with another object
    public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    if (!super.equals(obj)) {
        return false;
    }
    Ebook other = (Ebook) obj;
    return format != null && format.equals(other.format) &&
           size == other.size &&
           url != null && url.equals(other.url);
}




    @Override
    public String toString() {
        return super.toString() + " Format: " + format + " Size: " + size + " URL: " + url;
    }
    
}
