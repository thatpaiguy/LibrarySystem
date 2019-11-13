public class Book extends Item{
    private String ISBN;
    private String publisher;
    private String author;
    private String condition;

    /**
     * Parameterized Constructors
     * @param id
     * @param title
     * @param year
     * @param genre
     * @param numCopies
     * @param newArrival
     * @param isCheckedOut
     * @param ISBN
     * @param publisher
     * @param author
     */
    public Book(String id, String title,String year, String genre, long numCopies, boolean newArrival, boolean isCheckedOut,
                String ISBN, String publisher, String author, String condition, boolean matureRating, long dueDate) {
        super(id, title, year, genre, numCopies, newArrival, isCheckedOut, matureRating,dueDate);
        this.setISBN(ISBN);
        this.setPublisher(publisher);
        this.setAuthor(author);
        this.setCondition(condition);
    }

    /**
     * Getters and Setters
     * @return
     */
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

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
