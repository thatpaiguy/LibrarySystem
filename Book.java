public class Book {
    private int id;
    private String title;
    private int year;
    private String genre;
    private String ISBN;
    private String publisher;
    private String author;
    private int numCopies;
    private boolean newArrival;

    public Book(int id, String title, int year, String genre, String ISBN,
    String publisher, String author, int numCopies, boolean newArrival) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.author = author;
        this.numCopies = numCopies;
        this.newArrival = newArrival;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumCopies() {
        return numCopies;
    }

    public void setNumCopies(int numCopies) {
        this.numCopies = numCopies;
    }

    public boolean getNewArrival() {
        return newArrival;
    }

    public void setNewArrival(boolean newArrival) {
        this.newArrival = newArrival;
    }
}
