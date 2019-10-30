public class Book {
    private String id;
    private String title;
    private String year;
    private String genre;
    private String ISBN;
    private String publisher;
    private String author;
    private String numCopies;
    private String newArrival;

    public Book(String id, String title, String year, String genre, String ISBN,
    String publisher, String author, String numCopies, String newArrival) {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
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

    public String getNumCopies() {
        return numCopies;
    }

    public void setNumCopies(String numCopies) {
        this.numCopies = numCopies;
    }

    public String getNewArrival() {
        return newArrival;
    }

    public void setNewArrival(String newArrival) {
        this.newArrival = newArrival;
    }
}
